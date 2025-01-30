<div class="list-group">
    <#if categories??>
        <#list categories as category>
            <a href="/category/${category.id}" class="list-group-item list-group-item-action">${category.name}</a>
        </#list>
    </#if>
</div>