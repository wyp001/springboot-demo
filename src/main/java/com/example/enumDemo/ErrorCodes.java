package com.example.enumDemo;

public enum ErrorCodes {
    PARAM_NULL_ERROR(1001, "[%s]參數不可為空"),
    OBJECT_PARSE_ERROR(1001, "对象解析异常，原因：[%s]"),
    HDFS_CLIENT_INIT_ERROR(1001, "HDFS客户端初始化异常，原因：[%s]"),
    JSON_PARSE_ERROR(1001, "JSON解析失败，原因：[%s]"),
    OBJECT_CONVERT_ERROR(1001, "对象转换异常，原因：[%s]"),
    PARAM_DATE_PARSE_ERROR(1002, "日期解析失败，格式有误"),
    RESP_PARSE_ERROR(2000, "响应解析异常,原因：[%s]"),
    TOPOLOGY_NOT_CONSISTENT(2000, "拓扑ID不一致"),
    NODE_NOT_CONSISTENT(2000, "节点ID不一致"),
    TOPOLOGY_NOT_FOUND_ERROR(2003, "拓扑作业[%s]不存在"),
    NAMESPACE_NOT_FOUND_ERROR(2003, "名称空间[%s]不存在"),
    NODE_NOT_FOUND_ERROR(2003, "节点[%s]不存在"),
    EDGE_NOT_FOUND_ERROR(2003, "连线[%s]不存在"),
    CONPONENT_NOT_FOUND_ERROR(2003, "单元组件[%s]不存在"),
    FROM_TOMAP_ERROR(1004, "表单对象转化异常"),
    UDF_NOT_FOUND_ERROR(2003, "函数不存在"),
    RECORD_NOT_FOUND_ERROR(2003, "记录[%s]不存在"),
    TOPOLOGY_NODE_INCONSISTENT_ERROR(2002, "节点[%s]不属于拓扑作业[%s]异常,归属拓扑作业[%s]"),
    TOPOLOGY_EDGE_INCONSISTENT_ERROR(2002, "连线[%s]不属于拓扑作业[%s]异常,归属拓扑作业[%s]"),
    UNKNOWN_TYPE_ERROR(2002, "[%s]类型未知错误"),
    ARGUMENT_ERROR(1001, "参数[%s]错误"),
    OPERATION_ERROR(1000, "数据库操作失败"),
    TOPOLOGY_STATUS_ERROR(1003, "任务状态错误"),
    JOB_SUBMIT_ERROR(1004, "任务[%s]提交失败"),
    QUARTZ_CRON_TRIGGER_ERROR(1004, "Quartz获取定时任务CronTrigger出现异常,原因[%s]"),
    QUARTZ_JOB_CLASS_NOT_FOUND_ERROR(1004, "Quartz任务具体实现类[%s]不存在存在"),
    QUARTZ_UPDATE_JOB_ERROR(1004, "Quartz更新定时任务失败,原因[%s]"),
    QUARTZ_SCHEDULE_JOB_ERROR(1004, "Quartz作业调度失败,原因[%s]"),
    QUARTZ_CREATE_JOB_ERROR(1004, "Quartz创建定时任务失败,原因[%s]"),
    QUARTZ_EXECUTE_JOB_ERROR(1004, "Quartz立即执行定时任务失败,原因[%s]"),
    QUARTZ_PAUSE_JOB_ERROR(1004, "Quartz暂停定时任务失败,原因[%s]"),
    QUARTZ_RESUME_JOB_ERROR(1004, "Quartz恢复定时任务失败,原因[%s]"),
    QUARTZ_DELETE_JOB_ERROR(1004, "Quartz删除定时任务失败,原因[%s]"),
    JOB_KILL_ERROR(1004, "任务[%s]停止失败"),
    FILE_UPLOAD_FAILURE(1004, "文件[%s]上传失败"),
    FILE_DOWNLOAD_FAILURE(1004, "文件[%s]下载失败"),
    LOAD_CONFIG_FILE_ERROR(1004, "加载配置文件失败"),
    PRIMARYRESOURCE_NOT_FOUND_ERROR(2003, "主类的jar路径未指定"),
    ENVLOP_CONFIG_PARSE_ERROR(2000, "ENVLOP模板配置文件解析错误"),
    YARN_CLIENT_INIT_ERROR(2004, "yarn客户端初始化错误"),
    GET_YARN_APPLICATION_REPROT_ERROR(1004, "获取yarn应用程序监控数据异常"),
    INVALID_SCHEMA_RECEIVED_ERROR(1005,"模式无效 [%s] : [%s]"),
    SCHEMA_NOT_FOUND_ERROR(1005,"模式[%s]不存在"),
    DEPENDENCY_ERROR(1001,"依赖匹配错误"),
    SCHEMA_VERSIONINFO_NOT_FOUND_ERROR(1005,"模式版本信息[%s]不存在"),
    SCHEMA_INCOMPATIBLE_ERROR(1005,"模式[%s]不兼容异常"),
    RUNTIME_ERROR(1005,"未知异常，原因：[%s]"),
    KUBERNETES_ERROR(3001,"服务异常，原因：[%s]"),
    KUBERNETES_UPDATE_ERROR(3001,"容器更新异常，原因：[%s]"),
    KUBERNETES_CONN_ERROR(3002,"连接kubernetes集群异常，原因：[%s]"),;

    private int code;
    ErrorCodes(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public ErrorCodes format(Object... args) {
        this.msg = String.format(this.msg, args);
        return this;
    }

    @Override
    public String toString() {
        return "[" + this.code + "]" + this.msg;
    }
}
