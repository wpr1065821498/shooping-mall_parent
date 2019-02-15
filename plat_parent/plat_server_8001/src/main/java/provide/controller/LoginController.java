package provide.controller;

import domain.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import until.AjaxResult;

@RestController
@RequestMapping("/index")
public class LoginController {
    //@requestBody这个注解的作用是将前台传过来的restful风格请求中的json参数直接封装成一个domain对象
    //前提是json的属性名称必须个domain的名称相匹配
    //method的作用是用来
    //restful请求是使用url来定位资源，所以如下代码要写成@RequestMapping(value = "/login",method = RequestMethod.POST)
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult getAjax(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername()) && "0".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功");
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或者密码错误!!");
    }

}
