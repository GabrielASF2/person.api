# person.api
Avaliação Desenvolvedor Back-end Attornatus

### API para gernciamento de Pessoas que permite: 

* Criar uma pessoa
* Editar uma pessoa
* Consultar uma pessoa
* Listar pessoas
* Criar endereço para pessoa
* Listar endereços da pessoa
* Informar qual endereço é o principal da pessoa

## Postman
### Criando uma pessoa

*POST - Criar pessoa
localhost:8080/person

```
{
    "name": "Gabriel Franco",
    "birthDate": "12/09/1996",
    "address": [
        {
            "street": "Rua da Represa",
            "number": "153",
            "city": "Florianópolis",
            "cep": "88030-000"
        }
    ]
}
```
* ![https://github.com/GabrielASF2/person.api/edit/main/s](https://github.com/GabrielASF2/person.api/blob/main/screenshots/post.person.png)

* PUT - Editar Pessoa
* ![](https://github.com/GabrielASF2/person.api/blob/main/screenshots/put.person.png)

* GET - Listar Pessoa
* ![](https://github.com/GabrielASF2/person.api/blob/main/screenshots/get.person.png)

* POST - Criar Endereço
* ![](https://github.com/GabrielASF2/person.api/blob/main/screenshots/post.address.png)

* PUT - Add Endereço para pessoa
* ![](https://github.com/GabrielASF2/person.api/blob/main/screenshots/put.personaddaddress.png)
