💬 Real-Time Chat | Spring Boot + WebSocket

Aplicação de chat em tempo real desenvolvida com Java 8 e Spring Boot, utilizando WebSocket (STOMP) para comunicação bidirecional entre cliente e servidor.
Projeto criado para aprofundar conhecimentos em comunicação assíncrona e arquitetura orientada a eventos no ecossistema Spring.

🚀 Demonstração
Aplicação permite:

✅ Conexão via WebSocket
✅ Envio de mensagens em tempo real
✅ Broadcast para múltiplos usuários
✅ Atualização dinâmica sem refresh da página

🏗️ Arquitetura do Projeto

O backend foi estruturado seguindo boas práticas de organização e separação de responsabilidades:

chat
 ├── frontend
 │   └── index.html
 ├── src/main/java/br/com/danieldev/chat
 │   ├── ChatApplication
 │   ├── ChatController
 │   ├── ChatMessage
 │   └── WebSocketConfig
 └── pom.xml

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

 
