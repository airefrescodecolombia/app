jQuery(document).ready(function(){
    var size = jQuery(window).width();
    var NoImages=5;
    jQuery(document).keyup(function (e) {
        if (e.which === 17 ) {
            var size2 = jQuery(window).width();
            if (size!==size2){
                reloadPage();
            }
        }
    });
    
    jQuery(".menuOp").click(function(){
        var op = jQuery(this);
        if (op.hasClass("des"))
        var dese = jQuery(".sel");
        dese.removeClass("sel");
        dese.addClass("des");
        op.removeClass("des");
        op.addClass("sel");
    });  
     
    /*funcion de slide (visor de imagenes)
    jQuery(".arrow").click(function(){
        var object = jQuery(".imagenSlide");
        var suma = parseInt(jQuery(this).attr("id"))+parseInt(object.attr("id"));
        if (suma>NoImages || suma<1){
            suma = Math.abs(NoImages-suma);
        }
        object.attr("id",suma);
        object.attr("src",'resources/imagenes/slide/'+suma+'.png');
        effect(suma,NoImages);
    });
    /*funcion responsive del menu*/
    jQuery("#buttonMenuR").click(function(){
        jQuery("#menu").slideToggle(500);
    });
    /*funcion de la presentacion de la pagina*/
    jQuery(".doot").click(function(){
        if (jQuery(this).hasClass("deactiDot")){
            var current = jQuery(".activeDot");
            current.removeClass("activeDot");
            current.addClass("deactiDot");
            jQuery(this).removeClass("deactiDot");
            jQuery(this).addClass("activeDot");
            changeSource(jQuery(this).attr("id").substr(1,2));
        }
    });
    
});

/*Scripts in ejecution for javascript*/
var runner=false;
var timer;
var curr=1;
startPres();

function reloadPage(){
    location.reload();
}

function changeSource(index){
    var ob=document.getElementById("imgpress");
    ob.src="resources/imagenes/slideprincipal/"+index+".png";
    ob.style.display = "none";
    show(ob);
    startPres();
}

function stopPres(){
    clearTimeout(timer);
    runner=false;
}

function startPres(){
    if(!runner){
        runner=true;
        automatico();
    }
}

function automatico(){
    if (curr>4){
        curr=1;
    }
    timer = setTimeout(function(){automatico();},6000);
    document.getElementById("s"+curr).click();
    curr+=1;
}

function show(element){
    setTimeout(function(){
        element.style.display="block";
    },20);
}

function cargado(){
    document.getElementById("loadingPage").style.display="none";
    var x = document.getElementById("pg");
    var altura = x.contentWindow.document.body.scrollHeight;
    x.height=altura;
    x.style.display="block";
}


