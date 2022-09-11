<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
</head>
<script src="webjars/jquery/3.1.1/jquery.min.js"></script>
<script>
    //页面一加载好就请求一次分页数据
    $(function () {
        toPage(1, 10)
    })

    //发送Ajax请求, 请求分页数据
    function toPage(page, rows) { //页码, 记录数
        $.ajax({
            type: "GET",
            url: "${APP_PATH}/emps",
            data: {"page": page, "rows": rows},
            dataType: "json",
            success: function (result) {
                alert(result.dataMap.pageInfo.list)
            }
        })
    }

</script>
<body>

</body>
</html>