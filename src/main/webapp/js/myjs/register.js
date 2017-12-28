/**
 * Created by dell on 2017/12/26.
 */
var check_name;
var check_password;
var check_email;
var check_phone;
$(document).ready(function () {
    //获取验证用户名提示信息dom结点
    check_name = $("#checkName");
    //获取验证用户密码提示信息dom结点
    check_password = $("#checkPassword");
    //获取验证用户邮箱提示信息dom结点
    check_email = $("#checkEmail");
    //获取验证用户电话提示信息dom结点
    check_phone = $("#checkPhone");
    //失焦验证用户格式和是否被注册
    $("#name").blur(checkName);
    //失焦验证用户密码格式
    $("#password").blur(checkPassword);
    //失焦验证用户邮箱格式和是否被注册
    $("#email").blur(checkEmail);
    //失焦验证用户电话格式和是否被注册
    $("#phone").blur(checkPhone);
})
/**
 * 检查所有的信息是否正确或被填入
 */
function checkAll() {
    checkName();
    checkPassword();
    checkEmail();
    checkPhone();

    var cn = check_name.text();
    var cp =check_password.text();
    var ce =check_email.text();
    var cph =check_phone.text();

    if(cn.indexOf("allowed")>=0
        &cp.indexOf("allowed")>=0
        &ce.indexOf("allowed")>=0
        &cph.indexOf("allowed")>=0)
    return true;
    return false;
}
function checkName() {

    var reg = /^[\S]{3,16}$/;
    //表单通过val()函数获取输入的用户名信息
    var value=$("#name").val();
    //判断输入的内容是否符合正则表达式
    if(reg.test(value)){
        //验证用户名是否被注册
        checkFromSQL(value,"name");
    }else {
        check_name.css("color","red");
        check_name.text("Error,the name format is illegal.");
    }
}
function checkPassword() {
    var reg = /^[a-z0-9_-]{3,18}$/;
    var value = $("#password").val();
    if(reg.test(value)){
        check_password.css("color","green");
        check_password.text("Ok,the password is allowed.");
    }else{
        check_password.css("color","red");
        check_password.text("Error,the password format is illegal.");
    }
}
function checkEmail() {
    var reg = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
    var value = $("#email").val();
    if(reg.test(value)){
        checkFromSQL(value,"email");
    }else{
        check_email.css("color","red");
        check_email.text("Error,the email format is illegal.");
    }
}
function checkPhone() {
    var reg = /^[1][0-9]{10}$/;
    var value = $("#phone").val();
    if(reg.test(value)){
        checkFromSQL(value,"phone");
    }else{
        check_phone.css("color","red");
        check_phone.text("Error,the phone format is illegal.");
    }
}
/**
 * 验证用户名是否已经被注册
 * @param param
 */
function checkFromSQL(param,type) {
    $.get(
        //请求地址
        "checkInfo.do",
        //携带的参数
        {
            param:param,
            type:type
        },
        //回调函数
        function (data) {
            var temp;
            if(data.trim().indexOf("name")>=0){
                temp=check_name;
            }else if(data.trim().indexOf("email")>=0){
                temp=check_email;
            }else {
                temp=check_phone;
            }
            //如果已经被注册
            if(data.trim().indexOf("noHas")>=0) {
                //设置样式
                temp.css("color", "green");
                //通过text()函数赋值
                temp.text("Ok,the "+type+" is allowed.");
            }else {
                
                //设置样式
                temp.css("color", "red");
                //通过text()函数赋值
                temp.text("Warning,the " +type+ " has been registered.");
            }
        }
    );
}