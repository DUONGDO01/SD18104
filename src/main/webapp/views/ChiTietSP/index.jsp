<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Chi Tiết Sản Phẩm</title>
</head>
<body class="container">
<div>
    <h1 class="mt-4">Chi Tiết Sản Phẩm</h1>
    <a class="d-flex" style="text-decoration: none" href="/chi-tiet-sp/create"> <button class="btn btn-success">Thêm</button></a>
</div>
<br>
<table class="table table-striped">
    <thead>
    <tr>
<%--        <td>Mã SP</td>--%>
<%--        <td>Mã NSX</td>--%>
<%--        <td>Mã Màu Sắc</td>--%>
<%--        <td>Mã Dòng SP</td>--%>
        <td>NămBH</td>
        <td>Mô Tả</td>
        <td>Số Lượng Tồn</td>
        <td>Giá Nhập</td>
        <td>Giá Bán</td>
        <td colspan="2">Thao Tác</td>
    </tr>
    </thead>
    <tbody >
    <c:forEach items="${ chitietsp }" var="ct">
<tr>
<%--        <td>${ct.idSP}</td>--%>
<%--        <td>${ct.idNsx}</td>--%>
<%--        <td>${ct.idMauSac}</td>--%>
<%--        <td>${ct.idDongSP}</td>--%>
        <td>${ct.namBh}</td>
        <td>${ct.moTa}</td>
        <td>${ct.soLuongTon}</td>
        <td>${ct.giaNhap}VND</td>
        <td>${ct.giaBan}VND</td>


<%--<td><a href="/chi-tiet-sp/edit/${ct.idSP}">Update</a> </td>--%>
<%--    <td><a href="/chi-tiet-sp/delete/${ct.idSP}">delete</a> </td>--%>
</tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>