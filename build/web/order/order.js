var total =0.00;

function startload() {
    localStorage.clear();
}

function qtyfun() {
    for(var i=0;i<=100;i++)
        document.write("<option value:\""+i+"\">"+i+"</option>");
    
}



function enableprod(n) {
    var typeI = "type" + n;
    var prodfloI ="prodflo" + n;
    var prodfbI = "prodfb" +n;
    var priceI = "price" + n;
    var quantityI = "quantity"+n;
    var amountI ="amount"+n;

    if(document.getElementById(typeI).selectedIndex == 0){
        document.getElementById(prodfloI).style.display = "none";
        document.getElementById(prodfloI).disabled = true;
        document.getElementById(prodfloI).selectedIndex = "0";

        document.getElementById(prodfbI).style.display = "initial";
        document.getElementById(prodfbI).disabled = true;
        document.getElementById(prodfbI).selectedIndex = "0";

        document.getElementById(priceI).innerHTML = "";

        document.getElementById(quantityI).selectedIndex="0";

        document.getElementById(amountI).innerHTML = "0.00";

    }
    else if(document.getElementById(typeI).selectedIndex == 1){
        document.getElementById(prodfloI).style.display = "initial";
        document.getElementById(prodfloI).disabled = false;

        document.getElementById(prodfbI).style.display = "none";
        document.getElementById(prodfbI).disabled = true;
    }
    else if(document.getElementById(typeI).selectedIndex == 2){
        document.getElementById(prodfloI).style.display = "none";
        document.getElementById(prodfloI).disabled = true;

        document.getElementById(prodfbI).style.display = "initial";
        document.getElementById(prodfbI).disabled = false;
    }
}

function enableqty(n) {
    var typeI = "type" + n;
    var prodfloI ="prodflo" + n;
    var prodfbI = "prodfb" +n;
    var priceI = "price" + n;
    var quantityI = "quantity"+n;
    var amountI ="amount"+n;

    if(document.getElementById(typeI).selectedIndex == 1)
        document.getElementById(priceI).innerHTML = document.getElementById(prodfloI).value;
    else
        document.getElementById(priceI).innerHTML = document.getElementById(prodfbI).value;

    if(document.getElementById(prodfloI).disabled == true && document.getElementById(prodfbI).disabled == true){
        document.getElementById(priceI).innerHTML = "";

        document.getElementById(quantityI).selectedIndex="0";

        document.getElementById(amountI).innerHTML = "0.00";
    }

    

    document.getElementById(quantityI).disabled = false;
}

function sub(n) {
    var priceI = "price" + n;
    var quantityI = "quantity"+n;
    var amountI ="amount"+n;

    var price = parseFloat(document.getElementById(priceI).innerHTML);
    var total = price * document.getElementById(quantityI).selectedIndex;
    document.getElementById(amountI).innerHTML = total.toFixed(2);
}

function totalsub() {
    var amount1 = parseFloat(document.getElementById('amount1').innerHTML);
    var amount2 = parseFloat(document.getElementById('amount2').innerHTML);
    var amount3 = parseFloat(document.getElementById('amount3').innerHTML);
    
    total = amount1+amount2+amount3;
    document.getElementById('totalamount').innerHTML = total.toFixed(2);
}

function resetform() {
    if(confirm('Are you sure to reset your order?')==1){
        for(var i=1;i<=3;i++){
            typeI = document.getElementById('type'+i);
            prodfloI = document.getElementById('prodflo'+i);
            prodfbI = document.getElementById('prodfb'+i);
            priceI = document.getElementById('price'+i);
            quantityI = document.getElementById('quantity'+i);
            amountI = document.getElementById('amount'+i);
            

            typeI.selectedIndex = "0";

            prodfloI.style.display = "none";
            prodfloI.selectedIndex = "0";
            prodfloI.disabled = true;

            prodfbI.style.display = "initial";
            prodfbI.selectedIndex = "0";
            prodfbI.disabled = true;

            priceI.innerHTML = "";

            quantityI.selectedIndex = "0";

            amountI.innerHTML = "0.00"; 

            document.getElementById('totalamount').innerHTML = "0.00";
        }
    }
}

function submitted(namec, telc) {

    if(namec == ""){
        alert("Please write your name!!");
        document.getElementById('custname').focus();
        document.getElementById('custname').select();
        return false;
    }

    if(telc == ""){
        alert("Please write your telephone number!!");
        document.getElementById('telno').focus();
        document.getElementById('telno').select();
        return false;
    }

    if(isNaN(namec)==false){
        alert("Your name should be a combination of alphabet!!");
        document.getElementById('custname').focus();
        document.getElementById('custname').select();
        return false;
    }

    if(isNaN(telc) == true){
        alert("Your telephone number should be a combination of number!!");
        document.getElementById('telno').focus();
        document.getElementById('telno').select();
        return false;
    }

    if(document.getElementById('totalamount').innerHTML == "0.00"){
        alert('Please make a selection!');
        return false;
    }
    else{
        if(confirm('Are you sure to order the product?')==1){


            localStorage.setItem("lname",document.getElementById('custname').value);
            localStorage.setItem("ltel",document.getElementById('telno').value);

            transfer1();
            transfer2();
            transfer3();

            localStorage.setItem("ltotal",document.getElementById('totalamount').innerHTML);
            return true; 
        }
        else
            return false;
    }
}

function transfer1() {

    if(document.getElementById('type1').selectedIndex == "1"){
        var j = document.getElementById('prodflo1').selectedIndex;
             if(j == "1") localStorage.setItem("lprod1","Amelia");
        else if(j == "2") localStorage.setItem("lprod1","Anastasia");
        else if(j == "3") localStorage.setItem("lprod1","Annabeth");
        else if(j == "4") localStorage.setItem("lprod1","Ashley");
        else if(j == "5") localStorage.setItem("lprod1","Aurora");

        else if(j == "6") localStorage.setItem("lprod1","Calypso");
        else if(j == "7") localStorage.setItem("lprod1","Chantai");
        else if(j == "8") localStorage.setItem("lprod1","Claudia");
        else if(j == "9") localStorage.setItem("lprod1","Clemetine");
        else if(j == "10") localStorage.setItem("lprod1","Contance");

        else if(j == "11") localStorage.setItem("lprod1","Cora White");
        else if(j == "12") localStorage.setItem("lprod1","Darling");
        else if(j == "13") localStorage.setItem("lprod1","Esther White");
        else if(j == "14") localStorage.setItem("lprod1","Forever");
        else if(j == "15") localStorage.setItem("lprod1","Hermione");

        else if(j == "16") localStorage.setItem("lprod1","Isla Black");
        else if(j == "17") localStorage.setItem("lprod1","Madelyn White");
        else if(j == "18") localStorage.setItem("lprod1","Magdalene");
        else if(j == "19") localStorage.setItem("lprod1","Mary");
        else if(j == "20") localStorage.setItem("lprod1","Precious");

        else if(j == "21") localStorage.setItem("lprod1","Promise");
        else if(j == "22") localStorage.setItem("lprod1","Sadie White");
        else if(j == "23") localStorage.setItem("lprod1","Serilda");
        else if(j == "24") localStorage.setItem("lprod1","Sofia White");
        else if(j == "25") localStorage.setItem("lprod1","Soulmate");

        else if(j == "26") localStorage.setItem("lprod1","Stella Black");
        else if(j == "27") localStorage.setItem("lprod1","Sweetheart");
        else if(j == "28") localStorage.setItem("lprod1","Tessa");
        else if(j == "29") localStorage.setItem("lprod1","Tessa Bouquet");

    }

    else if(document.getElementById('type1').selectedIndex == "2"){
        var k = document.getElementById('prodfb1').selectedIndex;
             if(k == "1") localStorage.setItem("lprod1","Buttercream Cupcakes");
        else if(k == "2") localStorage.setItem("lprod1","Chocolates Mud Cupcakes");
        else if(k == "3") localStorage.setItem("lprod1","Classic Tiramisu");
        else if(k == "4") localStorage.setItem("lprod1","Cocoa Bon Bon Cupcakes");
        else if(k == "5") localStorage.setItem("lprod1","Deluxe Savoury Box");
        else if(k == "6") localStorage.setItem("lprod1","Mini Croissant Box");
        else if(k == "7") localStorage.setItem("lprod1","Oreo Cheese Cake");
        else if(k == "8") localStorage.setItem("lprod1","Rosie Cupcakes");
        else if(k == "9") localStorage.setItem("lprod1","Scarlette Cake");
        else if(k == "10") localStorage.setItem("lprod1","Strawberry Shortcake");
        else if(k == "11") localStorage.setItem("lprod1","Tropical Fruits Cupcakes");
        else if(k == "12") localStorage.setItem("lprod1","Tropical Fruits Cupcakes");
    }
    localStorage.setItem("lprice1",document.getElementById('price1').innerHTML);
    localStorage.setItem("lquantity1",document.getElementById('quantity1').value);
    localStorage.setItem("lamount1",document.getElementById('amount1').innerHTML);
}

function transfer2() {

    if(document.getElementById('type2').selectedIndex == "1"){
        var j = document.getElementById('prodflo2').selectedIndex;
             if(j == "1") localStorage.setItem("lprod2","Amelia");
        else if(j == "2") localStorage.setItem("lprod2","Anastasia");
        else if(j == "3") localStorage.setItem("lprod2","Annabeth");
        else if(j == "4") localStorage.setItem("lprod2","Ashley");
        else if(j == "5") localStorage.setItem("lprod2","Aurora");

        else if(j == "6") localStorage.setItem("lprod2","Calypso");
        else if(j == "7") localStorage.setItem("lprod2","Chantai");
        else if(j == "8") localStorage.setItem("lprod2","Claudia");
        else if(j == "9") localStorage.setItem("lprod2","Clemetine");
        else if(j == "10") localStorage.setItem("lprod2","Contance");

        else if(j == "11") localStorage.setItem("lprod2","Cora White");
        else if(j == "12") localStorage.setItem("lprod2","Darling");
        else if(j == "13") localStorage.setItem("lprod2","Esther White");
        else if(j == "14") localStorage.setItem("lprod2","Forever");
        else if(j == "15") localStorage.setItem("lprod2","Hermione");

        else if(j == "16") localStorage.setItem("lprod2","Isla Black");
        else if(j == "17") localStorage.setItem("lprod2","Madelyn White");
        else if(j == "18") localStorage.setItem("lprod2","Magdalene");
        else if(j == "19") localStorage.setItem("lprod2","Mary");
        else if(j == "20") localStorage.setItem("lprod2","Precious");

        else if(j == "21") localStorage.setItem("lprod2","Promise");
        else if(j == "22") localStorage.setItem("lprod2","Sadie White");
        else if(j == "23") localStorage.setItem("lprod2","Serilda");
        else if(j == "24") localStorage.setItem("lprod2","Sofia White");
        else if(j == "25") localStorage.setItem("lprod2","Soulmate");

        else if(j == "26") localStorage.setItem("lprod2","Stella Black");
        else if(j == "27") localStorage.setItem("lprod2","Sweetheart");
        else if(j == "28") localStorage.setItem("lprod2","Tessa");
        else if(j == "29") localStorage.setItem("lprod2","Tessa Bouquet");
    }

    else if(document.getElementById('type2').selectedIndex == "2"){
        var k = document.getElementById('prodfb2').selectedIndex;
             if(k == "1") localStorage.setItem("lprod2","Buttercream Cupcakes");
        else if(k == "2") localStorage.setItem("lprod2","Chocolates Mud Cupcakes");
        else if(k == "3") localStorage.setItem("lprod2","Classic Tiramisu");
        else if(k == "4") localStorage.setItem("lprod2","Cocoa Bon Bon Cupcakes");
        else if(k == "5") localStorage.setItem("lprod2","Deluxe Savoury Box");
        else if(k == "6") localStorage.setItem("lprod2","Mini Croissant Box");
        else if(k == "7") localStorage.setItem("lprod2","Oreo Cheese Cake");
        else if(k == "8") localStorage.setItem("lprod2","Rosie Cupcakes");
        else if(k == "9") localStorage.setItem("lprod2","Scarlette Cake");
        else if(k == "10") localStorage.setItem("lprod2","Strawberry Shortcake");
        else if(k == "11") localStorage.setItem("lprod2","Tropical Fruits Cupcakes");
        else if(k == "12") localStorage.setItem("lprod2","Tropical Fruits Cupcakes");
    }
    localStorage.setItem("lprice2",document.getElementById('price2').innerHTML);
    localStorage.setItem("lquantity2",document.getElementById('quantity2').value);
    localStorage.setItem("lamount2",document.getElementById('amount2').innerHTML);
}

function transfer3() {

    if(document.getElementById('type3').selectedIndex == "1"){
        var j = document.getElementById('prodflo3').selectedIndex;
             if(j == "1") localStorage.setItem("lprod3","Amelia");
        else if(j == "2") localStorage.setItem("lprod3","Anastasia");
        else if(j == "3") localStorage.setItem("lprod3","Annabeth");
        else if(j == "4") localStorage.setItem("lprod3","Ashley");
        else if(j == "5") localStorage.setItem("lprod3","Aurora");

        else if(j == "6") localStorage.setItem("lprod3","Calypso");
        else if(j == "7") localStorage.setItem("lprod3","Chantai");
        else if(j == "8") localStorage.setItem("lprod3","Claudia");
        else if(j == "9") localStorage.setItem("lprod3","Clemetine");
        else if(j == "10") localStorage.setItem("lprod3","Contance");

        else if(j == "11") localStorage.setItem("lprod3","Cora White");
        else if(j == "12") localStorage.setItem("lprod3","Darling");
        else if(j == "13") localStorage.setItem("lprod3","Esther White");
        else if(j == "14") localStorage.setItem("lprod3","Forever");
        else if(j == "15") localStorage.setItem("lprod3","Hermione");

        else if(j == "16") localStorage.setItem("lprod3","Isla Black");
        else if(j == "17") localStorage.setItem("lprod3","Madelyn White");
        else if(j == "18") localStorage.setItem("lprod3","Magdalene");
        else if(j == "19") localStorage.setItem("lprod3","Mary");
        else if(j == "20") localStorage.setItem("lprod3","Precious");

        else if(j == "21") localStorage.setItem("lprod3","Promise");
        else if(j == "22") localStorage.setItem("lprod3","Sadie White");
        else if(j == "23") localStorage.setItem("lprod3","Serilda");
        else if(j == "24") localStorage.setItem("lprod3","Sofia White");
        else if(j == "25") localStorage.setItem("lprod3","Soulmate");

        else if(j == "26") localStorage.setItem("lprod3","Stella Black");
        else if(j == "27") localStorage.setItem("lprod3","Sweetheart");
        else if(j == "28") localStorage.setItem("lprod3","Tessa");
        else if(j == "29") localStorage.setItem("lprod3","Tessa Bouquet");
    }

    else if(document.getElementById('type3').selectedIndex == "2"){
        var k = document.getElementById('prodfb3').selectedIndex;
             if(k == "1") localStorage.setItem("lprod3","Buttercream Cupcakes");
        else if(k == "2") localStorage.setItem("lprod3","Chocolates Mud Cupcakes");
        else if(k == "3") localStorage.setItem("lprod3","Classic Tiramisu");
        else if(k == "4") localStorage.setItem("lprod3","Cocoa Bon Bon Cupcakes");
        else if(k == "5") localStorage.setItem("lprod3","Deluxe Savoury Box");
        else if(k == "6") localStorage.setItem("lprod3","Mini Croissant Box");
        else if(k == "7") localStorage.setItem("lprod3","Oreo Cheese Cake");
        else if(k == "8") localStorage.setItem("lprod3","Rosie Cupcakes");
        else if(k == "9") localStorage.setItem("lprod3","Scarlette Cake");
        else if(k == "10") localStorage.setItem("lprod3","Strawberry Shortcake");
        else if(k == "11") localStorage.setItem("lprod3","Tropical Fruits Cupcakes");
        else if(k == "12") localStorage.setItem("lprod3","Tropical Fruits Cupcakes");
    }
    localStorage.setItem("lprice3",document.getElementById('price3').innerHTML);
    localStorage.setItem("lquantity3",document.getElementById('quantity3').value);
    localStorage.setItem("lamount3",document.getElementById('amount3').innerHTML);
}