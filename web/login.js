/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validate(){
                var user = form_id.username.value;
                var pass = form_id.password.value;
                var P = "910122";
                var U = "Cider";
                
                if((user==U)&&(pass==P)){
                    alert("Correct credentials");
                    window.location = "Home.html";
                }else if((user=="")||(pass=="")){
                    alert("fields are empty");
                    form_id.username.focus();
                }
                else{
                    alert("Incorrect value");
                    form_id.username.focus();
                }
                
            }