const HelloToken = artifacts.require("HelloToken");

/*
 * uncomment accounts to access the test accounts made available by the
 * Ethereum client
 * See docs: https://www.trufflesuite.com/docs/truffle/testing/writing-tests-in-javascript
 */
contract("HelloToken", function (/* accounts */) {
  // it("should assert true", async function () {
  //   await HelloToken.deployed();
  //   return assert.isTrue(true);
  // });
  /*
  console.log('should assert true');
  function async aa(){...};
  aa();
  의 내용과 같다.
  */ 
  it("should assert true", async function () {
    let instance = await HelloToken.deployed();
    let result = await instance.hello();
    console.log(`consolelog:`,result);
    return result;
   });
});
