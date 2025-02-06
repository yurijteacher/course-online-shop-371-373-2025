<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><#if hello??>${hello}</#if> </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/">
                        <i class="bi bi-house">Home</i>
                        </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/categories"><i class="bi bi-bag-plus-fill">Categories</i></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/brands">Brands</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/manufacturers">Manufacturers</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/delivery">Delivery</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/payment">Payment</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/about-us">Інформація про магазин</a>
                </li>

            </ul>

            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit"><i class="bi bi-search">Search</i></button>
            </form>

            <form class="d-flex" method="get" action="/cart">
                <button class="btn btn-outline-success" type="submit"><i class="bi bi-cart4"><br>Cart</i></button>
            </form>
        </div>
    </div>
</nav>