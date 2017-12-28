/**
 * Created by dell on 2017/12/26.
 */
var check_name;
var check_password;
var check_email;
var check_phone;
$(document).ready(function () {
    //��ȡ��֤�û�����ʾ��Ϣdom���
    check_name = $("#checkName");
    //��ȡ��֤�û�������ʾ��Ϣdom���
    check_password = $("#checkPassword");
    //��ȡ��֤�û�������ʾ��Ϣdom���
    check_email = $("#checkEmail");
    //��ȡ��֤�û��绰��ʾ��Ϣdom���
    check_phone = $("#checkPhone");
    //ʧ����֤�û���ʽ���Ƿ�ע��
    $("#name").blur(checkName);
    //ʧ����֤�û������ʽ
    $("#password").blur(checkPassword);
    //ʧ����֤�û������ʽ���Ƿ�ע��
    $("#email").blur(checkEmail);
    //ʧ����֤�û��绰��ʽ���Ƿ�ע��
    $("#phone").blur(checkPhone);
})
/**
 * ������е���Ϣ�Ƿ���ȷ������
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
    //��ͨ��val()������ȡ������û�����Ϣ
    var value=$("#name").val();
    //�ж�����������Ƿ����������ʽ
    if(reg.test(value)){
        //��֤�û����Ƿ�ע��
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
 * ��֤�û����Ƿ��Ѿ���ע��
 * @param param
 */
function checkFromSQL(param,type) {
    $.get(
        //�����ַ
        "checkInfo.do",
        //Я���Ĳ���
        {
            param:param,
            type:type
        },
        //�ص�����
        function (data) {
            var temp;
            if(data.trim().indexOf("name")>=0){
                temp=check_name;
            }else if(data.trim().indexOf("email")>=0){
                temp=check_email;
            }else {
                temp=check_phone;
            }
            //����Ѿ���ע��
            if(data.trim().indexOf("noHas")>=0) {
                //������ʽ
                temp.css("color", "green");
                //ͨ��text()������ֵ
                temp.text("Ok,the "+type+" is allowed.");
            }else {
                
                //������ʽ
                temp.css("color", "red");
                //ͨ��text()������ֵ
                temp.text("Warning,the " +type+ " has been registered.");
            }
        }
    );
}