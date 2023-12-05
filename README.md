# Sistema de Troca de Serviços

## Descrição
 
O Sistema de Troca de Serviços, uma plataforma online que permite aos usuários oferecer e solicitar serviços em troca de outros serviços. Este sistema foi projetado para promover a colaboração e a comunidade,sem a necessidade de transações financeiras.

## Funcionalidades Principais

* Cadastro de Usuário (inicial): Registre-se no sistema com informações básicas, como nome, e-mail e senha.
* Perfil do Usuário: Crie e gerencie seu perfil de usuário, incluindo detalhes pessoais, fotos de perfil e habilidades que você pode oferecer.
* Pesquisa de Serviços: Encontre serviços disponíveis com base em categorias, localização geográfica e palavras-chave.
* Publicação de Ofertas de Serviços: Crie anúncios detalhados para os serviços que desejam oferecer em troca de outros serviços.
* Solicitação de Serviços: Faça ofertas específicas de serviços de outros usuários, fornecendo suas necessidades e preferências.
* Chat de Comunicação: Comunique-se com outros usuários por meio de um sistema de mensagens interno para discutir detalhes e negociar negociações.
* Avaliações e Classificações: Avalie e classifique outros usuários após a conclusão de trocas de serviços para construir confiança na comunidade.
* Gestão de Trocas: Acompanhe e gerencie suas trocas de serviços pendentes e histórico de trocas.


## Requisitos Não Funcionais

* Segurança : O sistema deve garantir a segurança dos dados dos usuários, incluindo informações pessoais e histórico de trocas.
* Escalabilidade : O sistema deve ser escalável para acomodar um número crescente de usuários e trocas de serviços.
* Desempenho : O sistema deve ser responsivo e rápido, garantindo uma experiência de usuário satisfatória.
* Disponibilidade : O sistema deve estar disponível 24 horas por dia, 7 dias por semana, com tempo de inatividade mínimo para manutenção.
* Usabilidade : A interface do usuário deve ser intuitiva e fácil de usar, para atrair e reter os usuários.
* Privacidade : A privacidade dos usuários deve ser respeitada, com controles de privacidade para compartilhamento de informações pessoais.
* Backup e Recuperação de Dados : Deve haver um sistema de backup regular dos dados do sistema, com capacidade de recuperar dados em caso de falhas.
* Compatibilidade de Navegadores : O sistema deve ser compatível com os principais navegadores da web.
* Acessibilidade : O sistema deve ser acessível a pessoas com deficiência, de acordo com as diretrizes de acessibilidade da web.

## Objetivos
O objetivo final do projeto é fornecer uma plataforma de troca de serviços que seja confiável, segura e atraente para os usuários, promovendo uma comunidade ativa e colaborativa de compartilhamento de habilidades.


## Tecnologias Utilizadas

* Backend: Java;
* Banco de Dados:MySQL;
* Controle de Versão: Git;

# Configuração do Banco de Dados
## Tabela Perfil

```
CREATE TABLE `perfil` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`avaliacoes` VARCHAR(500) NOT NULL DEFAULT '0' COLLATE 'utf8mb4_general_ci',
	`areas_interesse` VARCHAR(500) NOT NULL COLLATE 'utf8mb4_general_ci',
	`ft_perfil` VARCHAR(500) NOT NULL COLLATE 'utf8mb4_general_ci',
	`habilidades` VARCHAR(500) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	`nome` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`sexo` ENUM('M','F') NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`idade` INT(3) NOT NULL,
	`cpf` VARCHAR(11) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`email` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=3;
```
## Tabela Serviços
```
CREATE TABLE `servicos` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `area` VARCHAR(500) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `desc_serv` VARCHAR(500) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `cidade` VARCHAR(500) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `bairro` VARCHAR(500) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `tempo_ex` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `cpf` VARCHAR(11) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `whatsapp` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `instagram` VARCHAR(300) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `facebook` VARCHAR(300) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `linkedin` VARCHAR(300) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    PRIMARY KEY (`id`)
)
AUTO_INCREMENT=1
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB;
```

Este readme fornece uma visão abrangente do Sistema de Troca de Serviços, incluindo suas funcionalidades, requisitos não funcionais e configuração do banco de dados. Siga as instruções para configurar o ambiente e aproveitar os benefícios desta plataforma colaborativa.
