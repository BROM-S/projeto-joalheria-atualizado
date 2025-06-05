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

-- Colocando 5 clientes ja cadastrados 
<<<<<<< HEAD
<<<<<<< HEAD
INSERT IGNORE INTO tb_usuario (id_usuario, nome_usuario, cpf, email, senha,  telefone, dt_nascimento, tipo_usuario)VALUES
(1, 'Khallil','47456147896','khalli@gmail.com','12345','996141865','1999-02-05','Cliente',),
(2, 'Gariella','45678468168','gabi@gmail.com','23451','997627706','1999-08-06','Cliente',),
(3, 'Rafaela','45678912465','rafa@gmail.com','34512','998756423','2001-01-25','Cliente',),
(4, 'Agarra','45236688971','agarra@gmail.com','45123','994788721','2016-11-11','Cliente',),
(5, 'Julia','45887896591','julia@gmail.com','51234','992143571','2003-7-19','Cliente',);

-- Colocando 20 produtos pre-cadastrados 

INSERT IGNORE INTO tb_produto(id_produto, nome, desc_produto, preco, quant_estoque, categoria_produto, tipo_produto)VALUES
(1,"Anel de ouro","Um anel de outro com pequenos pontos de luzes com rubis",400,80,"Anel","Ouro");
(2,"Colar de Pérolas","Um elegante colar de pérolas naturais com fecho de ouro",500,60,"Colar","Pérola"),
(3,"Brinco de Diamante","Brincos de diamantes incrustados em ouro branco, com design clássico",1500,45,"Brinco","Diamante"),
(4,"Pulseira de Prata","Pulseira de prata com design minimalista e fechamento em gancho",250,120,"Pulseira","Prata"),
(5,"Anel de Platina","Anel de platina com um grande diamante centralizado",2500,30,"Anel","Platina"),
(6,"Pingente de Rubi","Pingente de rubi montado em ouro 18k, com acabamento polido",800,40,"Pingente","Rubi"),
(7,"Bracelete de Ouro","Bracelete largo de ouro com detalhes em pedras preciosas",1500,25,"Bracelete","Ouro"),
(8,"Anel de Esmeralda","Anel de esmeralda com ouro rosé e pequenas pedras ao redor",1200,50,"Anel","Esmeralda"),
(9,"Colar de Ouro Branco","Colar fino de ouro branco com design sofisticado e discreto",700,90,"Colar","Ouro Branco"),
(10,"Brinco de Pérolas","Brincos elegantes de pérolas cultivadas, com fecho de prata",300,70,"Brinco","Pérola"),
(11,"Anel com Topázio Azul","Anel de prata com topázio azul no centro, acompanhado de pedras menores",400,100,"Anel","Topázio"),
(12,"Corrente de Ouro","Corrente delicada de ouro 18k, com 50cm de comprimento",350,200,"Corrente","Ouro"),
(13,"Broche de Safira","Broche de safira com design vintage e detalhes de diamantes",2200,15,"Broche","Safira"),
(14,"Relógio de Ouro","Relógio de pulso com pulseira de ouro e mostrador com diamantes",3000,10,"Relógio","Ouro"),
(15,"Anel de Ametista","Anel de ametista em prata com acabamento artesanal",550,85,"Anel","Ametista"),
(16,"Colar com Diamante","Colar delicado com diamante solitário montado em ouro branco",1800,40,"Colar","Diamante"),
(17,"Pingente de Âmbar","Pingente de âmbar com detalhe em prata envelhecida",350,65,"Pingente","Âmbar"),
(18,"Brinco de Safira Azul","Brincos de safira azul com incrustações de pequenas pedras preciosas",950,55,"Brinco","Safira"),
(19,"Pulseira de Rubi","Pulseira de rubis em ouro com acabamento polido e design moderno",1100,75,"Pulseira","Rubi"),
(20,"Anel de Jade","Anel de jade montado em ouro com acabamento brilhante",650,50,"Anel","Jade");
=======
INSERT IGNORE INTO tb_usuario (idUsuario, nomeUsuario, cpf, email, senha,  telefone, dtNascimento, tipoUsuario)VALUES
=======
INSERT IGNORE INTO tb_usuario (id_usuario, nome_usuario, cpf, email, senha,  telefone, dt_nascimento, tipo_usuario)VALUES
>>>>>>> 1cb8f5e (Mudança para underline no data.sql)
(1, 'Khallil','47456147896','khalli@gmail.com','12345','996141865','1999-02-05','Cliente'),
(2, 'Gariella','45678468168','gabi@gmail.com','23451','997627706','1999-08-06','Cliente'),
(3, 'Rafaela','45678912465','rafa@gmail.com','34512','998756423','2001-01-25','Cliente'),
(4, 'Agarra','45236688971','agarra@gmail.com','45123','994788721','2016-11-11','Cliente'),
(5, 'Jullia','45887896591','julia@gmail.com','51234','992143571','2003-7-19','Cliente');
>>>>>>> dab09aef37e68327e8a579bda90c2d6f7e21eab2
