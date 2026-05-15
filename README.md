# Forsa Microservices - Chapter 5

This project is the first implementation phase of the Forsa Platform using Spring Boot microservices.

## Implemented Microservices
- Craftsman Directory Service
- Service Request Service

## Communication Style
- REST over HTTP
- JSON message format

## Services Ports
- Craftsman Directory Service: 8081
- Service Request Service: 8082

## Implemented Flow
1. Add a craftsman using the Craftsman Directory Service
2. Submit a service request using the Service Request Service
3. The Service Request Service calls the Craftsman Directory Service
4. The request is created and a WhatsApp handoff URL is returned

## Example Endpoints

### Craftsman Directory Service
- `POST /api/craftsmen`
- `GET /api/craftsmen/{id}/contact-summary`

### Service Request Service
- `POST /api/requests`
- `GET /api/requests/{id}`

## Author
- Name: يارا حاتم مهدي
- ID: 220221483
