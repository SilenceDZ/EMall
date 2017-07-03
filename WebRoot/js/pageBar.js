/**
 * 用于后台分页控制的js代码
 */
//$(document).ready 的作用是等页面的文档（document）中的节点都加载完毕后，
//再执行后续的代码
$(document).ready(function() {
	initPageBar();
});
function initPageBar() {
	var currentPage = $("#pageNow").html();
	if (currentPage == 1) {
		$("#prePage2").hide();
		$("#prePage").hide();
	} else if (currentPage <= 2) {
		//$("#prePage2").hide();
		$("#prePage2").hide();
		$("#prePage").html("1");
	}
	var pageCount = $("#pageCount").val();
	if(currentPage==pageCount){
		$("#nextPage").hide();
		$("#nextPage2").hide();
	}	
	if((parseInt(currentPage)+1)==pageCount){
		$("#nextPage2").hide();
	}
}
function goPage() {
	var pageNum = parseInt($("#goPage").val());
	var count = parseInt($("#pageCount").val());
	if (pageNum <= count) {
		$("#currentPage").val(pageNum);
	}
	pageFormSubmit();
}
function changePageSize(sizeValue) {
	$("#pageSize").val(sizeValue);
	$("#currentPage").val(1);
}
function pageFormSubmit() {
	$("#pageForm").submit();
}
function firstPage() {
	$("#currentPage").val(1);
	$("#pageForm").submit();
}
function endPage() {
	$("#currentPage").val(parseInt($("#pageCount").val()));
	$("#pageForm").submit();
}
function prePage(num) {
	var curPage = $("#currentPage").val();
	if ((parseInt(curPage) - parseInt(num)) > 0) {
		$("#currentPage").val(parseInt(curPage) - parseInt(num));
	} else {
		$("#currentPage").val(1);
	}
	$("#pageForm").submit();
}
function nextPage(num) {
	var curPage = $("#currentPage").val();
	var pageCount = $("#pageCount").val();
	if ((parseInt(curPage) + parseInt(num)) < pageCount) {
		$("#currentPage").val(parseInt(curPage )+parseInt(num));
	} else {
		$("#currentPage").val(parseInt(pageCount));
	}
	$("#pageForm").submit();
}