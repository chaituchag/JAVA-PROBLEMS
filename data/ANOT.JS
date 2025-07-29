const mysql=require("mysql2");
const connection=mysql.createConnection({
    user:"root",
    password:"chaitu@123",
    database:"college",
    host:"localhost"

}); 

connection.connect((error)=>{
    if(error) throw error;
    console.log("data conec")
 })