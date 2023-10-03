function fillin() {
    document.getElementById('dname').value = localStorage.lname;
    document.getElementById('dtel').value = localStorage.ltel;

    if (localStorage.lquantity1 != "0" ){
    document.getElementById('tr1').innerHTML = "<td id=\"dprod1\"></td><td id=\"dprice1\"></td><td id=\"dquantity1\"></td><td id=\"damount1\"></td>";
    document.getElementById('dprod1').innerHTML = localStorage.lprod1;
    document.getElementById('dprice1').innerHTML = localStorage.lprice1;
    document.getElementById('dquantity1').innerHTML = localStorage.lquantity1;
    document.getElementById('damount1').innerHTML = localStorage.lamount1;
    }
    else{
        document.getElementById('tr1').innerHTML = "";
    }
    if(localStorage.lquantity2 != "0" ){
    document.getElementById('tr2').innerHTML = "<td id=\"dprod2\"></td><td id=\"dprice2\"></td><td id=\"dquantity2\"></td><td id=\"damount2\"></td>";
    document.getElementById('dprod2').innerHTML = localStorage.lprod2;
    document.getElementById('dprice2').innerHTML = localStorage.lprice2;
    document.getElementById('dquantity2').innerHTML = localStorage.lquantity2;
    document.getElementById('damount2').innerHTML = localStorage.lamount2;
    }
    else{
        document.getElementById('tr2').innerHTML = "";
    }
    if(localStorage.lquantity3 != "0" ){
    document.getElementById('tr3').innerHTML = "<td id=\"dprod3\"></td><td id=\"dprice3\"></td><td id=\"dquantity3\"></td><td id=\"damount3\"></td>";
    document.getElementById('dprod3').innerHTML = localStorage.lprod3;
    document.getElementById('dprice3').innerHTML = localStorage.lprice3;
    document.getElementById('dquantity3').innerHTML = localStorage.lquantity3;
    document.getElementById('damount3').innerHTML = localStorage.lamount3;
    }
    else{
        document.getElementById('tr3').innerHTML = "";
    }

    

    document.getElementById('dtotalamount').innerHTML = localStorage.ltotal;
    

    

}

function cardnumhide() {
    if(document.getElementById('paychoice').selectedIndex != "0" && document.getElementById('paychoice').selectedIndex != "1"){
        document.getElementById('cardnum').disabled = false;
        document.getElementById('cardnum').placeholder = "";
    }
    else{
        document.getElementById('cardnum').disabled = true;
        document.getElementById('cardnum').placeholder = "Skip this.";
    }
}

function resetinfo() {
    if(confirm('Are you sure to reset your form?')==1){
        document.getElementById('dname').value = "";
        document.getElementById('dtel').value = "";
        document.getElementById('addr').value = "";
        document.getElementById('poscode').value = "";
        document.getElementById('city').value = "";
        document.getElementById('state').selectedIndex = "0";
        document.getElementById('paychoice').selectedIndex = "0";
        document.getElementById('cardnum').value = "";
        
    }
}

function submitform(name,telno,addr,pos,city,state,choice,cardnum) {
    /*CHECK USER GOT INPUT OR NOT*/
    if(name == ""){
        alert("Please write your name !!");
        document.getElementById('dname').focus();
        document.getElementById('dname').select();
        return false;
    }
    
    if(telno == ""){
        alert("Please write your telephone number !!");
        document.getElementById('dtel').focus();
        document.getElementById('dtel').select();
        return false;
    }

    if(addr == ""){
        alert("Please write your address !!");
        document.getElementById('addr').focus();
        document.getElementById('addr').select();
        return false;
    }

    if(pos == ""){
        alert("Please write your postcode !!");
        document.getElementById('poscode').focus();
        document.getElementById('poscode').select();
        return false;
    }

    if(city == ""){
        alert("Please write your city !!");
        document.getElementById('city').focus();
        document.getElementById('city').select();
        return false;
    }

    if(state == "0"){
        alert("Please select your state !!");
        document.getElementById('state').focus();
        return false;
    }

    if(choice== "0"){
        alert("Please select your payment method !!");
        document.getElementById('paychoice').focus();
        return false;
    }
    if(choice != "1"){
        if(cardnum == ""){
            alert("Please write your debit/credit card number !!");
            document.getElementById('cardnum').focus();
            document.getElementById('cardnum').select();
            return false;
        }
    }

    /*CHECK USER GOT INPUT RIGHT FORMAT OR NOT*/
    if(isNaN(name) == false){
        alert("Your name should be a combination of alphabet!!");
        document.getElementById('dname').focus();
        document.getElementById('dname').select();
        return false;
    }

    if(isNaN(telno) == true){
        alert("Your telephone should be a combination of number!!");
        document.getElementById('dtel').focus();
        document.getElementById('dtel').select();
        return false;
    }

    if(isNaN(pos) == true){
        alert("Your postcode should be a combination of number!!");
        document.getElementById('poscode').focus();
        document.getElementById('poscode').select();
        return false;
    }

    if(isNaN(city) == false){
        alert("Your city should be a combination of alphabet!!");
        document.getElementById('city').focus();
        document.getElementById('city').select();
        return false;
    }
    if(isNaN(cardnum) == true){
        alert("Your debit/credit card number should be a combination of number!!");
        document.getElementById('cardnum').focus();
        document.getElementById('cardnum').select();
        return false;
    }

    if(confirm('Are you sure to buy this/these item(s) ?')==1){
        alert('We have recieve your order. Thank you !');
        return true
    }
}