
/******************************/
/*      top SildeShow        */
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


/******************************/
/*      main SildeShow        */
/*****************************/
var slideindex = 0;
mainBanSlid();

function mainBanSlid() {
    var i;
    var x = document.getElementsByClassName("mainslidImg");
    for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
    }
    slideindex++;
    if (slideindex > x.length) {
        slideindex = 1
    }
    x[slideindex - 1].style.display = "block";
    setTimeout(mainBanSlid, 2000);
}


/******************************/
/*       footSildeShow        */
/*****************************/
var footindex = 0;
footBanSlid();

function footBanSlid() {
    var i;
    var y = document.getElementsByClassName("footslidImg");
    for (i = 0; i < y.length; i++) {
        y[i].style.display = "none";
    }
    footindex++;
    if (footindex > y.length) {
        footindex = 1
    }
    y[footindex - 1].style.display = "block";
    setTimeout(footBanSlid, 2000);
}