DROP TABLE IF EXISTS virtual_network;

CREATE TABLE virtual_network
(
    id          BIGINT(20)  NOT NULL COMMENT '主键ID',
    name        VARCHAR(30) NULL DEFAULT NULL COMMENT '虚网名称',
    description VARCHAR(50) NULL DEFAULT NULL COMMENT '虚网描述',
    status      VARCHAR(20)     NULL DEFAULT NULL COMMENT '虚网状态',
    PRIMARY KEY (id)
);