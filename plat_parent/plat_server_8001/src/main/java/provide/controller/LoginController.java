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
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult getAjax(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername()) && "0".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功");
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或者密码错误!!");
    }

}
