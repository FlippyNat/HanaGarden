var weekendDate = [0,0,0,0,0,0,0,0,0,0,0];
var iWeekendDate = 0;
var nextWeekendDate = [0,0,0,0,0,0,0,0,0,0];   
var iNextWeekendDate = 0;

var year = new Date().getFullYear();
var month = new Date().getMonth() + 1;
var monthdate;
var nextMonth = month + 1;



function calender() {
    var firstDay = new Date().getDay();
    var firstDate = new Date().getDate();
    

    while (firstDate >= 8) {
        firstDate -= 7;
    }

    //Print empty cell
    var emptyCells = firstDay - firstDate + 1;

    if (emptyCells < 0) {
        emptyCells += 7;
    }


    for(var iEmptyCells = 0;iEmptyCells < emptyCells;iEmptyCells++) {
        document.write("<td> </td>");
    }

    //calculate how many day in first month
    //odd
    if (month % 2 == 1) {
        if (month <= 7)       //1,3,5,7 (31)
            monthdate = 31;
        
        else                 //9,11 (30)
            monthdate = 30;
        
    }

    //even
    else {
        if (month == 2) {    //2 (28/29)
            if (year % 4 == 0)   //29
            monthdate = 29;

            else                 //28
            monthdate = 28;
        }
        else if (month == 4 || month == 6) //4,6  (30)
            monthdate = 30;

        else                 //8,10,12 (31)
            monthdate = 31;
    }

    //print first month date
    for (var iMonthDate = 1; iMonthDate <= monthdate; iMonthDate++) {
        
        
        if (emptyCells==6||emptyCells==0) {
            document.write("<td class=\"firstmonth\" class=\"weekend\" style=\"font-weight: bold;\">" + iMonthDate + "</td>");

            //remember weekend date
            weekendDate[iWeekendDate] = iMonthDate;
            iWeekendDate++;
            
        }
        else 
            document.write("<td class=\"firstmonth\" class=\"weekday\">" + iMonthDate + "</td>");
            
        emptyCells++;
        if (emptyCells == 7){
            document.write("</tr><tr>");
            emptyCells = 0;
        }
    }

    //calculate next month
    if (nextMonth == 13)
        nextMonth = 1;

    //calculate how many day in second month
    if (nextMonth % 2 == 1) {
        if (nextMonth <= 7)       //1,3,5,7 (31)
            nextMonthdate = 31;
        
        else                 //9,11 (30)
            nextMonthdate = 30;
        
    }

    //even
    else {
        if (nextMonth == 2) {    //2 (28/29)
            if (year % 4 == 0)   //29
            nextMonthdate = 29;

            else                 //28
            nextMonthdate = 28;
        }
        else if (nextMonth == 4 || nextMonth == 6) //4,6  (30)
            nextMonthdate = 30;

        else                 //8,10,12 (31)
            nextMonthdate = 31;
    }
    
    //print secondmonth
    for (var iNextMonthDate = 1; iNextMonthDate <= nextMonthdate; iNextMonthDate++) {
        if (emptyCells==6||emptyCells==0) {
            document.write("<td class=\"secondmonth\" class=\"weekend\" style=\"font-weight: bold;\">" + iNextMonthDate + "</td>");
            emptyCells++;

            nextWeekendDate[iNextWeekendDate] = iNextMonthDate;
            iNextWeekendDate++;
        }
        else {
            document.write("<td class=\"secondmonth\" class=\"weekday\">" + iNextMonthDate + "</td>");
            emptyCells++;
        }
        if (emptyCells == 7){ //i==n 
        
            document.write("</tr><tr>");
            emptyCells = 0;
            
        }
    }

    emptyCells=7-emptyCells;

    for(var iEmptyCells = 0;iEmptyCells < emptyCells;iEmptyCells++) {
        document.write("<td> </td>");
    }

    
}
    

function captionmonth() {
    
    
    var year = new Date().getFullYear();
    var nextYear = new Date().getFullYear() + 1;
    var monthName = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "January"];
    
    document.write("<span class=\"firstmonth\" id=\"firstmonth\"></span>= "+monthName[month - 1]+"<br /><br /><br /><span class=\"secondmonth\" id=\"secondmonth\"></span> = "+monthName[nextMonth - 1]);
}

function formfun() {
    if (nextMonth == 13)
        nextMonth = 1;
        
    for (iWeekendDate = 0;weekendDate[iWeekendDate] != 0;iWeekendDate++){
        document.write("<option style=\"background-color: rgba(65, 125, 176,0.5);\" value=\""+month+"/"+weekendDate[iWeekendDate]+"\">"+month+"/"+weekendDate[iWeekendDate]+"</option>");
    }
    
    for (iNextWeekendDate = 0;nextWeekendDate[iNextWeekendDate] != 0;iNextWeekendDate++){
        document.write("<option style=\"background-color:#98ff98;\" value=\""+nextMonth+"/"+nextWeekendDate[iNextWeekendDate]+"\">"+nextMonth+"/"+nextWeekendDate[iNextWeekendDate]+"</option>");
    }

}

