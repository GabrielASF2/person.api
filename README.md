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

## TESTES
### Criando uma pessoa

* POST - Criar pessoa -  ( Ao criar uma pessoa, ele define o primeiro endereço como endereço principal)

REQUEST:
```
curl --location --request POST 'localhost:8080/person' \
--header 'Content-Type: application/json' \
--data-raw '{
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
}'
```
RETURN: 
```
{
    "id": "c7f9164a-6f76-4a51-b246-855018e7893c",
    "principalAddressId": "25fb7462-7e3d-4f3b-8ca4-e8fc88ba96fb",
    "name": "Gabriel Franco",
    "birthDate": "12/09/1996",
    "address": [
        {
            "id": "25fb7462-7e3d-4f3b-8ca4-e8fc88ba96fb",
            "street": "Rua da Represa",
            "number": "153",
            "city": "Florianópolis",
            "cep": "88030-000"
        }
    ]
}
```
* PUT - Editar Pessoa

REQUEST:
```
curl --location --request PUT 'localhost:8080/person' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": "c7f9164a-6f76-4a51-b246-855018e7893c",
    "principalAddressId": "25fb7462-7e3d-4f3b-8ca4-e8fc88ba96fb",
    "name": "Gabriel de Andrade Soares Franco",
    "birthDate": "12/09/1996",
    "address": [
        {
            "id": "25fb7462-7e3d-4f3b-8ca4-e8fc88ba96fb",
            "street": "Rua da Represa",
            "number": "153",
            "city": "Florianópolis",
            "cep": "88030-000"
        }
    ]
}'
```


RETURN: 
```
{
    "id": "dbda943e-7ad5-4091-a6af-c44044862b41",
    "principalAddressId": "11c7f39c-a651-4c8a-ba01-7178682ed139",
    "name": "Gabriel de Andrade Soares Franco",
    "birthDate": "12/09/1996",
    "address": [
        {
            "id": "11c7f39c-a651-4c8a-ba01-7178682ed139",
            "street": "Rua da Represa",
            "number": "153",
            "city": "Florianópolis",
            "cep": "88030-000"
        }
    ]
```

* GET - Listar Pessoa

REQUEST:
```
curl --location --request GET 'localhost:8080/person'
```

RETURN: 
```
[
    {
        "id": "c7f9164a-6f76-4a51-b246-855018e7893c",
        "principalAddressId": "25fb7462-7e3d-4f3b-8ca4-e8fc88ba96fb",
        "name": "Gabriel Franco",
        "birthDate": "11/09/1996",
        "address": [
            {
                "id": "25fb7462-7e3d-4f3b-8ca4-e8fc88ba96fb",
                "street": "Rua da Represa",
                "number": "153",
                "city": "Florianópolis",
                "cep": "88030-000"
            }
        ]
    }
]
```
* POST - Criar Endereço

REQUEST:
```
curl --location --request POST 'localhost:8080/address' \
--header 'Content-Type: application/json' \
--data-raw '{
    "street": "Pastor William Richard Filho",
    "number": "868",
    "city": "Florianópolis",
    "cep": "88034-100"
}'
```

RETURN: 
```
{
    "id": "d486650e-296d-4780-b76d-912913c270d0",
    "street": "Pastor William Richard Filho",
    "number": "868",
    "city": "Florianópolis",
    "cep": "88034-100"
}
```

* PUT - Add Endereço para pessoa

REQUEST:
```
curl --location --request PUT 'localhost:8080/person/c7f9164a-6f76-4a51-b246-855018e7893c/address/d486650e-296d-4780-b76d-912913c270d0'
````

RETURN: 
```
{
    "id": "c7f9164a-6f76-4a51-b246-855018e7893c",
    "principalAddressId": "25fb7462-7e3d-4f3b-8ca4-e8fc88ba96fb",
    "name": "Gabriel Franco",
    "birthDate": "11/09/1996",
    "address": [
        {
            "id": "25fb7462-7e3d-4f3b-8ca4-e8fc88ba96fb",
            "street": "Rua da Represa",
            "number": "153",
            "city": "Florianópolis",
            "cep": "88030-000"
        },
        {
            "id": "d486650e-296d-4780-b76d-912913c270d0",
            "street": "Pastor William Richard Filho",
            "number": "868",
            "city": "Florianópolis",
            "cep": "88034-100"
        }
    ]
}
```
