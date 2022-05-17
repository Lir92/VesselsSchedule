// $(function(){
//     let input = $('#status-input'),
//         inpVal = input.val();
//
//     $('.selectstatus').on('change', function(){
//         input.val(inpVal + $(this).val());
//     });
// });

$(document).ready(function(){
    $(".select").change(function(){
        $('.status-input').val($('.select').val());
    });
});