<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
  <style>
    table {
      font-family: arial, sans-serif;
      border-collapse: collapse;
      width: 30%;
    }

    th {
      border: 1px solid #dddddd;
      text-align: left;
      padding: 8px;
    }

    tr:nth-child(even) {
      /*background-color: #dddddd;*/
    }
  </style>
</head>
<body>
<h2>Danh sách khách hàng</h2>

<table>
  <tr>
    <th>Họ</th>
    <th>Tên</th>
    <th>Tuổi</th>
  </tr>

  <tr onclick="window.location='/customerdetail'">
  <th>Phạm Văn</th>
  <th>Thanh</th>
  <th>22</th>
  </tr>

  <tr onclick="window.location='/customerdetail1'">
    <th>Trần Văn</th>
    <th>Đạt</th>
    <th>19</th>
  </tr>

  <tr onclick="window.location='/customerdetail2'">
    <th>Dương Minh</th>
    <th>Hằng</th>
    <th>18</th>
  </tr>
</body>
</html>

