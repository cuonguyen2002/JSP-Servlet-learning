<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><dec:title default="Trang chủ" /></title>

    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/bootstrap.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css' />" />

    <!-- page specific plugin styles -->

    <!-- text fonts -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/fonts.googleapis.com.css' />" />

    <!-- ace styles -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace.min.css' />" />

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-part2.min.css' />" />
    <![endif]-->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-skins.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-rtl.min.css' />" />

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-ie.min.css' />" />
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- ace settings handler -->
    <script src="<c:url value='/template/admin/js/ace-extra.min.js' />"></script>
</head>

<body class="no-skin">

    <!-- header -->
    <%@ include file="/common/admin/header.jsp" %>
    <!-- header -->

    <div class="main-container ace-save-state" id="main-container">
        <script type="text/javascript">
            try{ace.settings.loadState('main-container')}catch(e){}
        </script>

        <!-- menu -->
        <%@ include file="/common/admin/menu.jsp" %>
        <!-- menu -->

        <!--body-->
        <dec:body/>
        <!--body-->

        <!-- footer -->
        <%@ include file="/common/admin/footer.jsp" %>
        <!-- footer -->

        <!--scroll top btn-->
        <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse display">
            <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
        </a>

    </div>




    <script src="<c:url value='/template/admin/js/bootstrap.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/jquery-ui.custom.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/jquery.ui.touch-punch.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/jquery.easypiechart.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/jquery.sparkline.index.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/jquery.flot.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/jquery.flot.pie.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/jquery.flot.resize.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/ace-elements.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/ace.min.js' />"></script>
    <script src="<c:url value='/template/admin/js/bootstrap.min.js'/>"></script>

    <!-- page specific plugin scripts -->
    <script src="<c:url value='/template/admin/js/jquery-ui.min.js'/>"></script>

</body>
</html>
