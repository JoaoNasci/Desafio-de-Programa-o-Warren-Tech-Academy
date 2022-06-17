/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
{
    function inverso(y){
        
        if(y === false){
            console.log(true);
        }else if( y === true){
            console.log(false);
        }else{
            for (var c=1;c<=1000; c++){
            
            var i = 0;
             while (y > 0) { 
                  
                i *= 10; 
                i += (y % 10); 
                y/= 10; 
                
                     }
           
        }
        console.log(i);
    }
    
}
console.log(inverso(68));
}

