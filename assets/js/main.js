
//funcion para mostrar el formulario docentes
function mostrarDocentes(){
    document.getElementById('docentes').style.display = 'block';
}

//funcion para ocultar el formulario docentes
function ocultarDocentes(){
    document.getElementById('docentes').style.display = 'none';
}

//funcion para mostrar el formulario estudiantes
function mostrarEstudiantes(){
    document.getElementById('estudiantes').style.display = 'block';
}

//funcion para ocultar el formulario estudiantes
function ocultarEstudiantes(){
    document.getElementById('estudiantes').style.display = 'none';
}

//funcion para mostrar el formulario acudientes
function mostrarAcudientes(){
    document.getElementById('acudientes').style.display = 'block';
}

//funcion para ocultar el formulario acudientes
function ocultarAcudientes(){
    document.getElementById('acudientes').style.display = 'none';
}

(function() {
    'use strict';
    window.addEventListener('load', function() {
      // Fetch all the forms we want to apply custom Bootstrap validation styles to
      var forms = document.getElementsByClassName('needs-validation');
      // Loop over them and prevent submission
      var validation = Array.prototype.filter.call(forms, function(form) {
        form.addEventListener('submit', function(event) {
          if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
          }
          form.classList.add('was-validated');
        }, false);
      });
    }, false);
  })();

  

  function verificarPasswords() {

  password1 = document.getElementById('ingresoPassword');
  password2 = document.getElementById('verificarPassword');

  // Verificamos si las constraseñas no coinciden 
  if (password1.value  !='' && password2.value != '') {

      if (password1.value != password2.value) {
  
          // Si las constraseñas no coinciden mostramos un mensaje 
          document.getElementById("error").classList.add("mostrar");
  
          return false;
      } else {
  
          // Si las contraseñas coinciden ocultamos el mensaje de error
          document.getElementById("error").classList.remove("mostrar");
  
          // Mostramos un mensaje mencionando que las Contraseñas coinciden 
          document.getElementById("ok").classList.remove("ocultar");
  
          // Desabilitamos el botón de login 
          document.getElementById("crear").disabled = true;
  
          // Refrescamos la página (Simulación de envío del formulario) 
          setTimeout(function() {
              location.reload();
          }, 3000);
  
          return true;
      }
  }

  }