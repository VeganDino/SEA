# 특화프로젝트
<div align="center">
  <br />
  <img src="/uploads/db0e281172599cf15f744dff6ec7031d/sea.png" alt="Save Endangered Animal" />
  <br />
  <h1>서비스 개요</h1>
  <br />
</div>

## 목차

1. [**서비스 소개**](#1)
2. [**기술 스택**](#2)
3. [**시스템 아키텍처**](#3)
4. [**주요기능 및 데모영상**](#4)
5. [**UCC 보러가기**](#5)
6. [**협업 관리**](#6)
7. [**개발 멤버 소개**](#7)
8. [**프로젝트 기간**](#8)
9. [**프로젝트 관련 문서**](#9)

<br/>


<div id="1"></div>

## 💡 서비스 소개

### 서비스 모토

> 서비스 소개
>
#### 서비스에 대한 한마디
<br/>

<div id="2"></div>

## 🛠️ 기술 스택

<img src="https://img.shields.io/badge/Amazon S3-569A31?style=for-the-badge&logo=Amazon S3&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=Ubuntu&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Nginx-009639?style=for-the-badge&logo=NGINX&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<br>
<img src="https://img.shields.io/badge/Java-FF7800?style=for-the-badge&logo=Java&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/JPA-000000?style=for-the-badge" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<br>

<img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=Python&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/FastAPI-009688?style=for-the-badge&logo=FastAPI&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<br>

<img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Node.js-339939?style=for-the-badge&logo=Node.js&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>

<br>
<img src="https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=Jira&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/GitLab-FCA121?style=for-the-badge&logo=GitLab&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <br/>

<details><summary> <b> 상세 기술스택 및 버전</b> </summary>

| 구분       | 기술스택                    | 상세내용                 | 버전          |
| -------- | ----------------------- | -------------------- | ----------- |
| 공통     | 형상관리                 | Gitlab               | \-          |
|          | 이슈관리                 | Jira                 | \-          |
|          | 커뮤니케이션             | Mattermost, Notion   | \-          |
| BackEnd  | DB                      | MySQL                | 5.7         |
|          |                         | JPA                  | \-          |
|          | Java                    | Zulu                 | 8.33.0.1    |
|          | Spring                  | Spring               | 5.3.6       |
|          |                         | Spring Boot          | 2.4.5       |
|          | IDE                     | IntelliJ             | 2022.1.3    |
|          | Cloud Storage           | AWS S3               | \-          |
|          | Build                   | Gradle               | 7.3.2       |
|          | API Docs                | Postman              |             |
| SmartContract |                    | Solidity             | ^0.8.4      |
|          | IDE                     | Remix                | 0.26.3      |
| FrontEnd | HTML5                   |                      | \-          |
|          | CSS3                    |                      | \-          |
|          | JavaScript(ES6)         |                      |\-           |
|          | React                   | React                | 17.0.0      |
|          | IDE                     | Visual Studio Code   | 1.70.0      |
| Server   | 서버                    | AWS EC2              | \-          |
|          | 플랫폼                  | Ubuntu               | 20.04.3 LTS |
|          | CI/CD                   | Docker               | 20.10.17    |
|          |                         | Jenkins              | 2.361.1     |
</details>

<br />

<div id="3"></div>

## 🗂️ 시스템 아키텍처

|                              시스템 구성                           |
| :------------------------------------------------------------------------------: |
| !![image](/uploads/5f3932fcd483bf2c197b873dd464e674/image.png)(#) |


|                              디렉토리 구조                       |
| :------------------------------------------------------------------------------: |
| 프론트엔드![image](/uploads/565caa25b92abc38029d17974c064b10/bandicam_2022-08-19_01-43-56-589.jpg) 백엔드![image](/uploads/f31e4ca4f6f35ba8544b0f4616713308/bandicam_2022-08-19_01-49-31-508.jpg) |

<br />
