document.addEventListener('DOMContentLoaded', () => {

    hljs.initHighlightingOnLoad();

    const codeblock =document.getElementById('code')
    const copybutton = document.getElementById('copy-button')
    const copysuccess = document.getElementById('copy-succes')


// const copytexthandler = () => {

//     const text = codeblock.innerText;

//     //firsst method of copying text
//     var element = document.createElement('textarea');
//     document.body.appendChild(element);
//     element.value = text;
//     element.select();
//     document.execCommand('copy');
//     document.body.removeChild(element);

//       copysuccess.classList.add('show-message')

      

//       setTimeout(() =>{
//         copysuccess.classList.remove('show-message');

//       },2500 )


// second method of copying

const copytexthandler = () => {

    const text = codeblock.innerText;
    navigator.clipboard.writeText(text).then( () => {
        copysuccess.classList.add('show-message') 

        setTimeout(() =>{
            copysuccess.classList.remove('show-message');
    
          },2500 )
        }
        
        //if not copied sussesfully
        
        
        
        )
        
          
    };
        copybutton.addEventListener('click',copytexthandler);

});