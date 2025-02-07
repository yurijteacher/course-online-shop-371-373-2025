create table addresses
(
    id           bigint not null auto_increment,
    city         varchar(255),
    country      varchar(255),
    state        varchar(255),
    street       varchar(255),
    zip          varchar(255),
    customers_id bigint,
    primary key (id)
) engine = InnoDB;
create table attribute_has_product
(
    id           bigint not null auto_increment,
    attribute_id bigint,
    productes_id bigint,
    primary key (id)
) engine = InnoDB;
create table attributes
(
    id   bigint not null auto_increment,
    name varchar(255),
    unit varchar(255),
    primary key (id)
) engine = InnoDB;
create table brand_has_category
(
    id            bigint not null auto_increment,
    brands_id     bigint,
    categories_id bigint,
    primary key (id)
) engine = InnoDB;
create table brands
(
    id          bigint not null auto_increment,
    description varchar(255),
    name        varchar(255),
    primary key (id)
) engine = InnoDB;
create table categories
(
    id          bigint not null auto_increment,
    description varchar(255),
    link_images varchar(255),
    name        varchar(255),
    primary key (id)
) engine = InnoDB;
create table clients
(
    id       bigint not null auto_increment,
    password varchar(255),
    username varchar(50),
    primary key (id)
) engine = InnoDB;
create table clients_rolesset
(
    clients_set_id bigint not null,
    rolesset_id    bigint not null,
    primary key (clients_set_id, rolesset_id)
) engine = InnoDB;
create table customers
(
    id         bigint      not null,
    email      varchar(255),
    first_name varchar(60) not null,
    last_name  varchar(60) not null,
    phone      varchar(255),
    primary key (id)
) engine = InnoDB;
create table deliveries
(
    id   bigint not null auto_increment,
    name varchar(255),
    primary key (id)
) engine = InnoDB;
create table images
(
    id            bigint not null auto_increment,
    url_image     varchar(255),
    productimg_id bigint,
    primary key (id)
) engine = InnoDB;
create table manufacturers
(
    id      bigint not null auto_increment,
    country varchar(255),
    name    varchar(255),
    primary key (id)
) engine = InnoDB;
create table orders
(
    id           bigint not null auto_increment,
    date_created datetime(6),
    status       varchar(255),
    customer_id  bigint,
    delivery_id  bigint,
    payment_id   bigint,
    primary key (id)
) engine = InnoDB;
create table payments
(
    id   bigint not null auto_increment,
    name varchar(255),
    primary key (id)
) engine = InnoDB;
create table product_has_order
(
    id         bigint  not null auto_increment,
    quantity   integer not null,
    order_id   bigint,
    product_id bigint,
    primary key (id)
) engine = InnoDB;
create table products
(
    id                bigint not null auto_increment,
    full_description  varchar(1024),
    link_image        varchar(255),
    name              varchar(255),
    price             decimal(38, 2),
    short_description varchar(200),
    brand_id          bigint,
    category_id       bigint,
    manufacturer_id   bigint,
    primary key (id)
) engine = InnoDB;
create table rating
(
    id             bigint    not null auto_increment,
    rating         float(53) not null,
    review         varchar(255),
    customerrat_id bigint,
    productrat_id  bigint,
    primary key (id)
) engine = InnoDB;
create table roles
(
    id   bigint not null auto_increment,
    name varchar(255),
    primary key (id)
) engine = InnoDB;
alter table addresses
    add constraint FKacvrlov343vgpx5ruuxe4b6tl foreign key (customers_id) references customers (id);
alter table attribute_has_product
    add constraint FK3fawasut3mtepi6l9xaaukfcs foreign key (attribute_id) references attributes (id);
alter table attribute_has_product
    add constraint FK2ipqcy2bop4unhxk7f7y1aksy foreign key (productes_id) references products (id);
alter table brand_has_category
    add constraint FK3rli0nx3w1vhv2hp33ph9oslq foreign key (brands_id) references brands (id);
alter table brand_has_category
    add constraint FK3haswhy7melo2c6vb4e7a08l0 foreign key (categories_id) references categories (id);
alter table clients_rolesset
    add constraint FKqehqyv1svx6hblulqx6cvqlc7 foreign key (rolesset_id) references roles (id);
alter table clients_rolesset
    add constraint FK94dlai8psrx1glhu8lnkki0wt foreign key (clients_set_id) references clients (id);
alter table customers
    add constraint FK6wx1ltbmqdavt7qutvrqcppg2 foreign key (id) references clients (id);
alter table images
    add constraint FKllofah9a1cxmy6ped3exc7krr foreign key (productimg_id) references products (id);
alter table orders
    add constraint FKpxtb8awmi0dk6smoh2vp1litg foreign key (customer_id) references customers (id);
alter table orders
    add constraint FK8w9m21riko8j8eit0yvog02nr foreign key (delivery_id) references deliveries (id);
alter table orders
    add constraint FK8aol9f99s97mtyhij0tvfj41f foreign key (payment_id) references payments (id);
alter table product_has_order
    add constraint FKbxqf9xsjrqcdulvq8yhcyavbp foreign key (order_id) references orders (id);
alter table product_has_order
    add constraint FKfgp6lkbm40x2ofocigdkfm1io foreign key (product_id) references products (id);
alter table products
    add constraint FKa3a4mpsfdf4d2y6r8ra3sc8mv foreign key (brand_id) references brands (id);
alter table products
    add constraint FKog2rp4qthbtt2lfyhfo32lsw9 foreign key (category_id) references categories (id);
alter table products
    add constraint FKljnead8q1652k9q5p0fe0o1g2 foreign key (manufacturer_id) references manufacturers (id);
alter table rating
    add constraint FKsj4lh71psnyk00px7n9pwkw0c foreign key (customerrat_id) references customers (id);
alter table rating
    add constraint FKkew1q56enuiyvgtx19x61pmix foreign key (productrat_id) references products (id);