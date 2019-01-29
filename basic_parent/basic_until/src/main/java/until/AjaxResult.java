package until;


public class AjaxResult {

    private boolean success;//结果

    private String message;//提示信息

    private Object returnData;//后端返回到前端的数据

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getReturnData() {
        return returnData;
    }

    public AjaxResult setReturnData(Object returnData) {
        this.returnData = returnData;
        return this;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }

}
