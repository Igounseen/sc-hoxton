DELETE
FROM virtual_network;

INSERT INTO virtual_network (id, name, description, status)
VALUES (1, '工业互联网', '', 'UP'),
       (2, '能源互联网', '', 'UP'),
       (3, '三地网络互通', '', 'DOWN')
