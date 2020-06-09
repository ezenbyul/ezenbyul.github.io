
/******************************/
/*           SildeShow        */
/*****************************/
var slideindex = 0;
topBanSlid();

function topBanSlid() {
    var i;
    var y = document.getElementsByClassName("slidImg");
    for (i = 0; i < y.length; i++) {
        y[i].style.display = "none";
    }
    slideindex++;
    if (slideindex > y.length) {
        slideindex = 1
    }
    y[slideindex - 1].style.display = "block";
    setTimeout(topBanSlid, 2000);
}