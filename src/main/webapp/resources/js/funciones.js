/**
 * Created by Alejandro on 7/12/2017.
 */

function borrarTarea(idTarea)
{

    if(alert("borrar tarea?")){
        $.ajax({
            data:  idTarea,
            url:   '/list_tasks/delete/'+idTarea,
            type:  'POST',
            success:  function (response) {

            }
        });

    }
}