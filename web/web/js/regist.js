/**
 * Created by Administrator on 2017/8/4.
 */
$(document).ready(function () {
    $("#province").change(function () {
        var index = this.selectedIndex;
        var pid = this.options[index].value;
        $.ajax({
            type:'post',
            url:'selectCity?pid=' + pid,
            dataType:'json',
            success:function (data) {
                $("#city").empty();
                $.each(data,function () {
                    $item = $("<option value='"+this.id + "'>" + this.city + "</option>>");
                    $("#city").append($item);
                })
            }
        })
    })
});