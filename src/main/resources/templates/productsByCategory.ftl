<#import "customer/templ_customer.ftl" as p>
<@p.pages>

    <h3 pt-3> Categories </h3>
    <br>
    <hr>

    <div class="row row-cols-2 row-cols-md-3 g-4">
        <#if products??>
            <#list products as product>
                <div class="col">
                    <div class="card">
                        <a href="/category/${product.id}">
                            <img src="${product.linkImage}" class="card-img-top" alt="${product.name}">
                        </a>
                        <div class="card-body text-center">
                            <h5 class="card-title"><b>${product.name}</b></h5>
                            <hr>
                            <p class="card-text">Category: ${product.category.name}</p>
                            <p class="cart-text">Manufacturer: ${product.manufacturer.name}</p>
                            <p class="card-text">${product.short_description}</p>

                            <p>Кількість</p><input type="number" min="1" max="1000" value="1" name="quantity">
                            <p class="cart-text"> Ціна: <b> ${product.price} грн.</b></p>
                            <hr>
                            <div class="">
                                <input type="submit" value="addToCart" class="btn btn-success">
                            </div>
                        </div>
                    </div>
                </div>
            </#list>
        </#if>
    </div>

</@p.pages>