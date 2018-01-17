
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- HTML代码片段中请勿添加<body>标签 //-->
<div style="float: left"><canvas id="chart-area" width="300" height="300"/></div>


<div style="padding-left: 400px"><canvas id="myChart" width="500" height="300"/></div>


<!-- 推荐开源CDN来选取需引用的外部JS //-->
<script type="text/javascript" src="http://cdn.gbtags.com/Chart.js/0.2.0/Chart.min.js"></script>
<script>
    var pieData = [
        {
            value: ${chart.man},
            color:"#F7464A",
            highlight: "#FF5A5E",
            label: "男"
        },
        {
            value: ${chart.woman},
            color: "#46BFBD",
            highlight: "#5AD3D1",
            label: "女"
        }

    ];

    var data = {
        //折线图需要为每个数据点设置一标签。这是显示在X轴上。
        labels: ["2018-01-04", "2017-01-06", "2017-01-07"],
        //这边的thisId分别对应labels的id
        thisIds : [1,2,3 ,4],
        //数据集（y轴数据范围随数据集合中的data中的最大或最小数据而动态改变的）
        datasets: [{
            fillColor: "rgba(220,220,220,0.5)", //背景填充色
            strokeColor: "rgba(220,220,220,1)", //路径颜色
            pointColor: "rgba(220,220,220,1)", //数据点颜色
            pointStrokeColor: "#fff", //数据点边框颜色
            data: [1, 4, 2] //对象数据
        }]
    };


    window.onload = function(){
        var ctx = document.getElementById("chart-area").getContext("2d");
        window.myPie = new Chart(ctx).Pie(pieData);



        var ctx = document.getElementById("myChart").getContext("2d");;
        //方式二：传入对象字面量去修改默认图标参数，自定义图表
        var MyNewChart = new Chart(ctx).Line(data, {
            // 网格颜色
            scaleGridLineColor: "rgba(255,0,0,1)",
            // Y/X轴的颜色
            scaleLineColor: "rgba(0,0,0,.1)",
            // 文字大小
            scaleFontSize: 16,
            // 文字颜色
            scaleFontColor: "#666",
            // 网格颜色
            scaleGridLineColor: "rgba(0,0,0,.05)",
            // 是否使用贝塞尔曲线? 即:线条是否弯曲
            // 是否执行动画
            animation: true,
            // 动画的时间
            animationSteps: 60,
            // 动画完成时的执行函数
            onAnimationComplete: function(){
                console.log("给x轴的lable对应的id：");
                console.log(data.thisIds);
            }
        });
    };










</script>



