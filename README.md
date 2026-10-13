# RPG Spring Boot

Migração do jogo da Unidade 1 para o modelo MVC com Spring Boot.

**GRUPO:** HEITOR GOMES DE SENA MELO MARIZ, ANTHONY GABRIEL GOMES ROCHA, MAURO CESAR GUERRA PACHECO, GABRIEL SOARES GOMES

## Como rodar

```bash
./mvnw spring-boot:run
```
O servidor sobe em `http://localhost:8080`. O banco é H2 em memória (os dados somem ao reiniciar).

## Estrutura

- `model/` – entidades (Personagem, Inimigo, Item...)
- `service/` – regras de negócio
- `repository/` – acesso ao banco (JPA)
- `controller/` – rotas HTTP

## Rotas para testar no Postman

| Método | Rota | O que faz |
|---|---|---|
| POST | `/personagens?nome=Heitor` | Cria um personagem (vida 100, dano 10, ouro 0) |
| GET | `/personagens/{id}` | Busca um personagem pelo id |

### Exemplo
1. `POST http://localhost:8080/personagens?nome=Heitor` → retorna o personagem criado com `id: 1`
2. `GET http://localhost:8080/personagens/1` → retorna o mesmo personagem