🔹 Componentes

ChatApplication → Inicialização da aplicação Spring Boot

WebSocketConfig → Configuração do Message Broker

ChatController → Gerenciamento das mensagens

ChatMessage → Modelo de dados da mensagem

index.html → Interface Web para testes

⚙️ Tecnologias Utilizadas

☕ Java 8

🌱 Spring Boot

🔌 WebSocket

📡 STOMP

📦 Maven

🎨 HTML5 + JavaScript

🔄 Como Funciona

O cliente se conecta ao endpoint WebSocket.

As mensagens são enviadas via protocolo STOMP.

O backend recebe usando @MessageMapping.

O servidor publica no broker.

Todos os clientes inscritos no tópico recebem a mensagem instantaneamente.

Arquitetura baseada no padrão Publish/Subscribe (Pub/Sub).

🧠 Conceitos Aplicados

Comunicação assíncrona

Programação orientada a eventos

Configuração de Message Broker

Integração Frontend + Backend

WebSocket Handshake

Organização em camadas
