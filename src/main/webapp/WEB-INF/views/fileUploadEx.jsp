<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="No-Cache">
<meta http-equiv="Pragma" content="No-Cache">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script>
	$(function(){
		
		$(".fileDrop").on("dropenter dragover", function(evt){
			evt.preventDefault(); // 이벤트 전파를 막음... -> 여기선 드랍된 파일이 열리는 것을 방지함 
			let files = evt.originalEvent.dataTransfer.files; // 드래그 된 파일을 얻어옴
			console.log(files);
		});

		
		
		$(".fileDrop").on("drop",function(evt){
			evt.preventDefault(); // 이벤트 전파를 막음... -> 여기선 드랍된 파일이 열리는 것을 방지함 
		});
		
		
	});
	
	function openArea(){
		$(".fileDrop").show();
	}
</script>
</head>
<style>
.fileDrop {
	width: 100%;
	height: 400px;
	border: 1px dotted blue;
	display: none;
}

.fileDrop .fileContent{
 	text-align:center;
 	margin:10px auto;
 	padding:20px;

}
</style>
<body>
	<h3>fileUpload Test using Ajax</h3>
	<button type="button" class="btn btn-default" onclick="openArea();"> 파일업로드</button>
	
	<div class="fileDrop">
		<div class ="fileContent">여기에 업로드할 파일을 드래그 하세요. </div>
	</div>
	<div class="fDropList"></div>

</body>
</html>