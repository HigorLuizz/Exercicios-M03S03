insert into role (name) values ('ROLE_ADMIN')
    insert into role (name) values ('ROLE_ONLY_READ')

insert into usuario (username, name, password) values ('admin', 'Admin', '$2a$10$iYc8aSqwnwfrn0uLOzXQGudcU96lIBg6suPWMtB6kVPW48OaX1psq')
insert into usuario (username, name, password) values ('higor', 'Higor', '$2a$10$dHB1Y.OBfPQUh/dyINcLrO0ucrjgSaSm9VPkRp5jQXfuFpMPJAf.C')

insert into usuario_roles values (1, 1)
insert into usuario_roles values (2, 1)
insert into usuario_roles values (2, 2)