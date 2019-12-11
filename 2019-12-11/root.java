<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>购物车</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<table id="cartTable">
    <thead>
        <tr>
            <th><label><input class="check-all check" type="checkbox"/>&nbsp;全选</label></th>
            <th>商品</th>
            <th>单价</th>
            <th>数量</th>
            <th>小计</th>
            <th>操作</th>
        </tr>
    </thead>
    <tbody>

        <tr>
    <td class="checkbox"><input class="check-one check" type="checkbox"></td>
            <td class="goods"><img  src="C:\Users\M\Desktop\imagesLoad\images\u=1314779792,4127566196&fm=26&gp=0.jpg" alt=""/><span>蜂蜜柚子茶</span></td>
            <td class="price">3.0</td>
            <td class="count">
                <span class="reduce"></span>
                <input class="count-input" type="text" value="1">
                <span aria-label="add">+</span></td>
            <td class="subtotal">3.0</td>
            <td class="operation"><span class="delete">删除</span></td>
        </tr>

        <tr>
            <td class="checkbox"><input class="check-one check" type="checkbox"></td>
            <td class="goods"><img  src="C:\Users\M\Desktop\imagesLoad\images\u=1314779792,4127566196&fm=26&gp=0.jpg" alt=""/><span>冰红茶</span></td>
            <td class="price">3.5</td>
            <td class="count">
                <span class="reduce"></span>
                <input class="count-input" type="text" value="1">
                <span aria-label="add">+</span></td>
            <td class="subtotal">3.5</td>
            <td class="operation"><span class="delete">删除</span></td>
        </tr>

        <tr>
            <td class="checkbox"><input class="check-one check" type="checkbox"></td>
            <td class="goods"><img  src="C:\Users\M\Desktop\imagesLoad\images\u=1314779792,4127566196&fm=26&gp=0.jpg" alt=""/><span>鲜果橙</span></td>
            <td class="price">3.0</td>
            <td class="count">
                <span class="reduce"></span>
                <input class="count-input" type="text" value="1">
                <span aria-label="add">+</span></td>
            <td class="subtotal">3.0</td>
            <td class="operation"><span class="delete">删除</span></td>
        </tr>

        <tr>
            <td class="checkbox"><input class="check-one check" type="checkbox"></td>
            <td class="goods"><img  src="C:\Users\M\Desktop\imagesLoad\images\u=1314779792,4127566196&fm=26&gp=0.jpg" alt=""/><span>冰糖雪梨</span></td>
            <td class="price">4.0</td>
            <td class="count">
                <span class="reduce"></span>
                <input class="count-input" type="text" value="1">
                <span aria-label="add">+</span></td>
            <td class="subtotal">4.0</td>
            <td class="operation"><span class="delete">删除</span></td>
        </tr>
    </tbody>

<div class="foot" id="foot">
    <label class="fl select-all"><input type="checkbox" class="check-all check"/>&nbsp;全选</label>
    <a class="fl delete" id="deleteAll" href="javascript:;">删除</a>
    <div class="fr closing">结算</div>
    <div class="fr total">合计:￥<span id="priceTotal">0.00</span></div>
    <div class="fr selected" id="selected">已选商品
        <span id="selectedTotal">0</span>件
        <span class="arrow up">👆</span>
        <span class="arrow down">👇</span>
    </div>
    <div class="selsct-view">
        <div id="selsctViewList" class="clearfix">
        </div>
        <span class="arrow"><span></span></span>
    </div>
</div>
</body>
</html>