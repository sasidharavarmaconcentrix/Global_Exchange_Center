<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">

</head>
<body class="container">

<div class="display-1">Update Cpmpany's Share Price</div>
<hr/>

<div class="row">
    <div class="col-6">
        <div class="card">
            <div class="card-header">Update Company</div>
            <div class="card-body">
                <form action="update_company_toList" method="post">
                    <div class="form-group">
                        <label class="form-control-label" for="CompanyID">CompanyID</label>
                        <input type="text" class="form-control" id="CompanyID" placeholder="CompanyID" readonly="readonly" value=${companyid} name="CompanyID"/>
                    </div>
                    <div class="form-group">
                        <label class="form-control-label" for="CompanyName">CompanyName</label>
                        <input type="text" class="form-control" id="CompanyName" placeholder="CompanyName" readonly="readonly" value=${companyname}
                        name="CompanyName"/>
                    </div>
                    <div class="form-group">
                        <label class="form-control-label" for="SharePrice">SharePrice</label>
                        <input type="text" class="form-control" id="SharePrice" placeholder="SharePrice" value=${shareprice}
                        name="SharePrice"/>
                    </div>
                    <hr/>
                    <button type="submit" class="btn btn-primary">Submit Company</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>