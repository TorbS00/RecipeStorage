var string = document.getElementById("generated-text").innerHTML;
        
document.getElementById("generator").onclick = function() {
    
    var random = Math.floor(Math.random() * 11); 
    var newString = string + " " + random;
    
   document.getElementById("generated-text").innerHTML = newString;
}