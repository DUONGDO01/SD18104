<%@ page pageEncoding="utf-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-danger">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/home/smartphone">TRANG CHỦ</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="/admin/smartphone/index">QUẢN LÝ SẢN PHẨM</a>
        </li>
   
        <li class="nav-item">
          <a class="nav-link active" href="#">LIÊN HỆ</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            TÀI KHOẢN
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="/login">Đăng Nhập</a></li>
            <li><a class="dropdown-item" href="/signin">Đăng Ký</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="/Assignment_SOF3011_Quocdvph14459/users/index">Quản Lý Tài Khoản</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            HÃNG SẢN XUẤT
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <div class="container">
            	<div class="row">
            	<div class="col-6">
            		<li><a class="dropdown-item" name="brand" id=""brand" href="/home/smartphone?brand=Samsung">Samsung</a></li>
            <li><a class="dropdown-item" name="brand" id=""brand" href="/home/smartphone?brand=Xiaomi">Xiaomi</a></li>
            <li><a class="dropdown-item" name="brand" id=""brand" href="/home/smartphone?brand=Realme">Realme</a></li>
             <li><a class="dropdown-item" name="brand" id=""brand" href="/home/smartphone?brand=Apple">iPhone(Apple)</a></li>
            	</div>
            	<div class="col-6 ">
            	            <li><a class="dropdown-item" id=""brand" name="brand" href="/home/smartphone?brand=Oneplus">Oneplus</a></li>
            <li><a class="dropdown-item" name="brand" id=""brand" href="/home/smartphone?brand=Nokia">Nokia</a></li>
            <li><a class="dropdown-item" name="brand" id=""brand" href="/home/smartphone?brand=Oppo">Oppo</a></li>
            	</div>
            </div>
            </div>
          </ul>
        </li>
      </ul>
      
      <form class="d-flex" action="/home/smartphone">
      <a id="btnCart" class="dropdown-item" href="/shopping/cart"><img src="/img/cart-icon2.png"></a>
        <input class="form-control me-2" type="search" name="name" id="name" required placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-primary text-light">Search</button>
      </form>
    </div>
  </div>
</nav>
