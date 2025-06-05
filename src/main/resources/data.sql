INSERT IGNORE INTO tb_tipo_usuario (idTipoUsuario, nomeTipoUsuario) VALUES
(1, 'Admin'),
(2, 'Cliente'),
(3, 'Vendedor'),
(4, 'Gerente');

INSERT IGNORE INTO tb_categoria_produto (idCategoriaProduto, nomeCategoriaProduto, descricaoCategoriaProduto) VALUES
(1, 'Anéis', 'Acesório para os dedos'),
(2, 'Colares', 'Acesório para o pescoço'),
(3, 'Brincos', 'Acesório para as orelhas'),
(4, 'Pulseiras', 'Acessorio para os braços'),
(5, 'Relógios', 'Acesório para não atrasar no SENAI');

-- Inserindo Tipos (se não existirem)
INSERT IGNORE INTO tb_tipo_produto (idTipoProduto, nomeTipoProduto, descricaoTipoProduto) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750'),
(3, 'Bijuteria', 'É biju mas é de rico');

-- inserindo a tb_ornamento
INSERT IGNORE INTO tb_ornamento (idOrnamento, descricao, nome) VALUES
(1, 'Ornamento de ouro com pedras preciosas', 'Anel de Ouro'),
(2, 'Ornamento de prata com design moderno', 'Brinco de Prata'),
(3, 'Ornamento com pedras sintéticas', 'Colar de Cristal');

-- Colocando 5 clientes ja cadastrados 
INSERT IGNORE INTO tb_usuario (idUsuario, nomeUsuario, cpf, email, senha,  telefone, dtNascimento, tipoUsuario)VALUES
(1, 'Khallil','47456147896','khalli@gmail.com','12345','996141865','1999-02-05','Cliente'),
(2, 'Gariella','45678468168','gabi@gmail.com','23451','997627706','1999-08-06','Cliente'),
(3, 'Rafaela','45678912465','rafa@gmail.com','34512','998756423','2001-01-25','Cliente'),
(4, 'Agarra','45236688971','agarra@gmail.com','45123','994788721','2016-11-11','Cliente'),
(5, 'Jullia','45887896591','julia@gmail.com','51234','992143571','2003-7-19','Cliente');