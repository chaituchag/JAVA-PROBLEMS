const mysql=require("mysql2");
const connection=mysql.createConnection({
    user:"root",
    host:"localhost",
    password:"chaitu@123",
    database:"Chaitu"
});

connection.connect((error)=>{
    if(error) throw error;
    console.log("database connected")
})