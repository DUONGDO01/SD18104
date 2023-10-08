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
    <title>NhanVien</title>
</head>
<body>
<div class="container">
    <div class="body">
        <fs:form action="/khach-hang/update/${khachhang.ma}" modelAttribute="khachhang" method="post" >
            <div class="mb-3">
                <label  for="" class="form-label">Mã :</label>
                <fs:input type="text" name="ma" path="ma" class="form-control"  aria-describedby="emailHelp" required="" />
                <span style="color: red">*</span> <fs:errors path="ma" cssStyle="color: red"></fs:errors>

            </div>
            <div class="mb-3">
                <label class="form-label">Tên</label>
                <fs:input type="text" name="ten" path="ten" class="form-control" />
                <fs:errors path="ten" cssStyle="color: red"></fs:errors>
            </div>

            <div class="mb-3">
                <label for="" class="form-label">Tên Đệm :</label>
                <fs:input type="text" name="tenDem" path="tenDem" class="form-control"  />
                <fs:errors path="tenDem" cssStyle="color: red"></fs:errors>
            </div>
            <div class="mb-3">
                <label class="form-label">Họ</label>
                <fs:input type="text" name="ho" path="ho" class="form-control" />
                <fs:errors path="ho" cssStyle="color: red"></fs:errors>
            </div>

            <div class="mb-3">
                <label for="" class="form-label">Ngày Sinh : </label>
                <fs:input type="date" name="ngaySinh" path="ngaySinh" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Địa Chỉ :</label>
                <fs:input type="text" name="diaChi" path="diaChi" class="form-control"  aria-describedby="emailHelp"/>

            </div>
            <div class="mb-3">
                <label for="" class="form-label">Thành Phố :</label>
                <fs:input type="text" name="thanhPho" path="thanhPho" class="form-control"  aria-describedby="emailHelp"/>

            </div>
            <div class="mb-3">
                <label for="" class="form-label">Quốc Gia :</label>
                <fs:input type="text" name="quocGia" path="quocGia" class="form-control"  aria-describedby="emailHelp"/>

            </div>
            <div class="mb-3">
                <label for="" class="form-label">Số Điện Thoại : </label>
                <fs:input type="number" name="sdt" path="sdt" class="form-control" id=""/>
            </div>
            <div class="mb-3">
                <label for="" class="form-label">Mật khẩu :</label>
                <fs:input type="password"  path="matKhau" class="form-control" name="matKhau " />
                <fs:errors path="matKhau" cssStyle="color: red"></fs:errors>
            </div>

            <button type="submit" class="btn btn-primary">Create</button>
        </fs:form>
    </div>

</div>

</body>
</html>