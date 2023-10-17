<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="fs" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <!--Fontawesome CDN-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

    <!--Custom styles-->
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>
        body {
            font-family: Arial, sans-serif; /* Sử dụng phông chữ Arial hoặc một phông chữ hỗ trợ tiếng Việt khác */
        }
    </style>
    <title>Chi Tiết SP</title>
</head>
<body>
<div class="container">
    <div class="body">
        <fs:form action="store" modelAttribute="chitietsp" method="post" >
<%--            <div class="mb-3">--%>
<%--                <label  for="" class="form-label">Mã Sản Phẩm :</label>--%>
<%--                <fs:input type="text" name="idSP" path="idSP" class="form-control"  aria-describedby="emailHelp" required="" />--%>
<%--                <span style="color: red">*</span> <fs:errors path="idSP" cssStyle="color: red"></fs:errors>--%>

<%--            </div>--%>
<%--            <div class="mb-3">--%>
<%--                <label for="" class="form-label">Mã Nhà Sản Xuất :</label>--%>
<%--                <fs:input type="text" name="idNsx" path="idNsx" class="form-control" />--%>
<%--                <fs:errors path="idNsx" cssStyle="color: red"></fs:errors>--%>
<%--            </div>--%>

<%--            <div class="mb-3">--%>
<%--                <label for="" class="form-label"> Mã Màu Sắc :</label>--%>
<%--                <fs:input type="text" name="idMauSac" path="idMauSac" class="form-control"  aria-describedby="emailHelp"/>--%>

<%--            </div>--%>
<%--            <div class="mb-3">--%>
<%--                <label for="" class="form-label">Mã Dòng Sản Phẩm : </label>--%>
<%--                <fs:input type="text" name="idDongSP" path="idDongSP" class="form-control" id=""/>--%>
<%--            </div>--%>
            <div class="mb-3">
                <label for="" class="form-label">Năm Bảo Hành :</label>
                <fs:input type="number" name="namBh"  path="namBh" class="form-control" />
                <fs:errors path="namBh" cssStyle="color: red"></fs:errors>
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Mô Tả :</label>
                <fs:input type="text" name="moTa"  path="moTa" class="form-control" />
                <fs:errors path="moTa" cssStyle="color: red"></fs:errors>
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Số Lượng Tồn :</label>
                <fs:input type="number" name="soLuongTon"  path="soLuongTon" class="form-control" />
                <fs:errors path="soLuongTon" cssStyle="color: red"></fs:errors>
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Giá NHập :</label>
                <fs:input type="number" name="giaNhap"  path="giaNhap" class="form-control" />
                <fs:errors path="giaNhap" cssStyle="color: red"></fs:errors>
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Giá Bán :</label>
                <fs:input type="number" name="giaBan"  path="giaBan" class="form-control" />
                <fs:errors path="giaBan" cssStyle="color: red"></fs:errors>
            </div>

            <button type="submit" class="btn btn-primary">Create</button>
        </fs:form>
    </div>

</div>

</body>
</html>