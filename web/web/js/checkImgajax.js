/**
 * Created by Administrator on 2017/8/1.
 */
//ajax的功能 
var xmlhttp;
//得到异步对象
function createXmlHttpRequest()
{
    if(window.ActiveXObject)
    {
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }else
    {
        xmlhttp=new XMLHttpRequest();
    }
}
//发送异步请求
function sendRequest(message)
{
    //1.调用创建对象的方法
    createXmlHttpRequest();
    //4.监视ajax的工作状态
    xmlhttp.onreadystatechange=stateFun;
    //2.打开异步请求
    xmlhttp.open("post","checkImg?yzm="+message);
    //3.发送
    xmlhttp.send(null);
}

function stateFun()
{
    if(xmlhttp.readyState==4)
    {
        if(xmlhttp.status==200)
        {
            var str=xmlhttp.responseText;
            var span=document.getElementsByTagName("span")[0];
            if(str.indexOf("ok")>=0)
            {
                span.style.color="green";
                span.innerHTML="ok";
            }else
            {
                span.style.color="red";
                span.innerHTML="验证码错误";
            }
        }
    }
}