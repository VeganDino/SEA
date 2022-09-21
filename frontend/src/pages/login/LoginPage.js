import React, { useEffect, useState } from "react";
import { Button, Paper, Stack, Typography } from "@mui/material";
import { useNavigate } from 'react-router-dom';
import { useCookies } from 'react-cookie'; 
import { ethers } from "ethers";

const LoginPage = () => {
  const [errorMessage, setErrorMessage] = useState(null);
  const [account, setAccount] = useState(null);
  const [balance, setBalance] = useState(null);
  const [cookies, setCookie] = useCookies();
  const navigate = useNavigate();

  useEffect(() => {
    if (window.ethereum) {
      window.ethereum.on("accountsChanged", accountsChanged);
      window.ethereum.on("chainChanged", chainChanged);
    }
  }, []);

  const connectHandler = async () => {
    if (window.ethereum) {
      try {
        const res = await window.ethereum.request({
          method: "eth_requestAccounts",
        });
        await accountsChanged(res[0]);
      } catch (err) {
        console.error(err);
        setErrorMessage("MetaMask 연결 에러");
      }
    } else {
      setErrorMessage("MetaMask를 설치하세요.");
      window.open('https://metamask.io/download.html');
    }
  };

  const accountsChanged = async (newAccount) => {
    setAccount(newAccount);
    try {
      const balance = await window.ethereum.request({
        method: "eth_getBalance",
        params: [newAccount.toString(), "latest"],
      });
      setBalance(ethers.utils.formatEther(balance));
    } catch (err) {
      console.error(err);
      setErrorMessage("MetaMask 연결 에러");
    }
  };

  const chainChanged = () => {
    setErrorMessage(null);
    setAccount(null);
    setCookie('id', account);
    setBalance(null);
    navigate("/main");
  };

  return (
      <Stack spacing={2}>
        <Typography variant="h6"> 지갑: {account} </Typography>
        <Typography variant="h6">
          잔고 : {balance} {balance ? "ETH" : null}
        </Typography>
        <Button onClick={connectHandler}>MetaMask 로그인</Button>
        {errorMessage ? (
          <Typography variant="body1" color="red">
            Error: {errorMessage}
          </Typography>
        ) : null}
      </Stack>
  );
};

export default LoginPage;