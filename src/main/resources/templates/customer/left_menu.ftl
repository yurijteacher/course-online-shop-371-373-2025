<div class="list-group">
    <#if categories??>
        <#list categories as category>
            <a href="/category/${category.id}" class="list-group-item list-group-item-action">
                <img src="${category.linkImages}" width="25px" alt="${category.name}">
                ${category.name}</a>
        </#list>
    </#if>
</div>