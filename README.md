# **Spring PROJECT**

## Prerequisite
1. JAVA Spring
2. VS CODE
3. GIT

## Project Setup
1. Create Project on Spring initializer in Vs Code
2. 


___
## Backend Setup
1. Include node_modules/ in the .gitignore file.
2. Add bash terminal to the VS code.
```JSON
   terminal.integrated.shell.windows": "A:\\Program FIles\\64 bit\\Git\\bin\\bash.exe"
```
1. Initialize git repo with git init.  
```BASH
   git init
```
2. Initialize node project
```NODE
   npm init
```
3. Install regular Dependencies
```NODE
   npm i express express-validator bcryptjs config gravatar jsonwebtoken mongoose request
```
4. Install Dev Dependencies
```NODE
   npm i -D nodemon concurrently
```
5. Add below script to package.json
```JSON
   "scripts": {
    "start": "node server",
    "server":"nodemon server"
  }
```
6. GIT add Commit
```GIT
   git add.
   git commit -m 'your comment'
```
___
## MongoDB Setup
### ATLAS setup
1. Create Project eg: MERN.
2. Create cluster eg: MernCluster (may take some time to spin up).
3. Create user inside Database Access tab eg: MernAdmin.
4. Setup Network Access CIDR address.
5. Click on connect(inside clustertab) and copy the connection String and add to default.json.
 ```JSON
 eg: mongodb+srv://MernAdmin:<password>@merncluster.btdb6.mongodb.net/myFirstDatabase?retryWrites=true&w=majority
 ```

 $ npm i axios react-router-dom redux react-redux redux-thunk redux-devtools-extention moment react-moment