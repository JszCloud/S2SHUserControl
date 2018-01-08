$(function() {
    //菜单动作
    var $ul=$(".ul")
    $ul.find("li:eq(0)").on("click",function(){
        $(".iframe").prop("src","userAction!list")
    })
    var $ul=$(".ul")
    $ul.find("li:eq(1)").on("click",function(){
        $(".iframe").prop("src","userAction!to_save")
    })

    //全选
    $("#over").bind("click",
        function() {
            $("[name=over]:checkbox").prop("checked", this.checked);
        });

    $("input[name='over']").on("click",function() {
        var $subs = $("input[name='over']");
        $("#over").prop("checked", $subs.length == $subs.filter(":checked").length ? true : false);
    });
})