document.addEventListener('DOMContentLoaded',() => {
    inicio();
    muestraTabla();
});

function muestraTabla() {
    $tabla_Alumnos = $('#tabla_Alumnos').dataTable({
        "ajax": {
            url: "alumnos/listarAlumnos",
            method: 'GET',
            dataSrc: ''
        },
        responsive: true,
        bProcessing: true,
        select: true,
        "language": {
            'processing': 'Procesando espere...',
            "sProcessing": "Procesando...",
            "sLengthMenu": "Mostrar _MENU_ registros",
            "sZeroRecords": "No se encontraron resultados",
            "sEmptyTable": " ",
            "sInfo": " _START_ al _END_ Total: _TOTAL",
            "sInfoEmpty": " ",
            "sInfoFiltered": "(filtrado de un total de _MAX_ registros)",
            "sInfoPostFix": "",
            //"searchPlaceholder": "Buscar",
            "search": "Buscar",
            "paginate": {
                "previous": 'Anterior',
                "next": 'Siguiente',
            },
            "paging": false,
            "bPaging": false,
            "scrollY": "300px",
            "sUrl": "",
            "sInfoThousands": ",",
            "sLoadingRecords": "Cargando...",
            "oAria": {
                "sSortAscending": ": Activar para ordenar la columna de manera ascendente",
                "sSortDescending": ": Activar para ordenar la columna de manera descendente"
            }
        },
        columns: [
            { data: "id_alumno" },
            { data: "nombre" },
            { data: "apellido_paterno" },
            { data: "apellido_materno" },
            { data: "edad" },
            { data: "genero" }
        ]
    });
}

function inicio(){
    $.ajax({
        type: "GET",
        url: "alumnos/listarAlumnos",
        dataType: 'json',
        success: function (data) {
            console.log(data);
        },
        error: function (e){
            toastr["warning"]("Error al recuperar los Alumnos", {progressBar: true, closeButton: true});
        }
    });
    
    
}