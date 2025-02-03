<#import "customer/templ_customer.ftl" as p>
<@p.pages>

<h3 pt-3> Categories </h3>
<hr>

<div class="row row-cols-2 row-cols-md-3 g-4">
    <#if categories??>
        <#list categories as category>
            <div class="col">
                <div class="card">
                    <a href="/category/${category.id}">
                        <img src="${category.linkImages}" class="card-img-top card-img-bottom" alt="${category.name}" height="150px">
                    </a>
                    <div class="card-body">
                        <h5 class="card-title">${category.name}</h5>
                        <p class="card-text">${category.description}</p>
                    </div>
                </div>
            </div>
        </#list>
    </#if>
</div>

    <br>

</@p.pages>
