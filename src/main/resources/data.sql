INSERT IGNORE INTO tb_tipo_usuario (id_tipo_usuario, nome_tipo_usuario) VALUES
(1, 'Admin'),
(2, 'Cliente'),
(3, 'Vendedor'),
(4, 'Gerente');

INSERT IGNORE INTO tb_categoria_produto (id_categoria_produto, nome_categoria_produto, descricao_categoria_produto) VALUES
(1, 'Anéis', 'Acesório para os dedos'),
(2, 'Colares', 'Acesório para o pescoço'),
(3, 'Brincos', 'Acesório para as orelhas'),
(4, 'Pulseiras', 'Acessorio para os braços'),
(5, 'Relógios', 'Acesório para não atrasar no SENAI');

-- Inserindo Tipos (se não existirem)
INSERT IGNORE INTO tb_tipo_produto (id_tipo_produto, nome_tipo_produto, descricao_tipo_produto) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750'),
(3, 'Bijuteria', 'É biju mas é de rico');

-- inserindo a tb_ornamento
INSERT IGNORE INTO tb_ornamento (id_ornamento, descricao, nome) VALUES
(1, 'Ornamento de ouro com pedras preciosas', 'Anel de Ouro'),
(2, 'Ornamento de prata com design moderno', 'Brinco de Prata'),
(3, 'Ornamento com pedras sintéticas', 'Colar de Cristal');
