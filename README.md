# 💬 Chat em Tempo Real  
**Chat em tempo real com Spring Boot + WebSocket**

Esse é um projeto de chat em tempo real construído com **Java 8**, **Spring Boot** e **WebSocket (STOMP)**, que demonstra comunicação bidirecional instantânea entre cliente e servidor.

---

## ✨ Features

✅ Conexão WebSocket com backend  
✅ Envio e recebimento de mensagens em tempo real  
✅ Exibição dinâmica sem atualização da página  
✅ Arquitetura organizada e escalável

---

## 📱 Demonstração (Frontend)

O frontend é uma interface web simples feita com **HTML, CSS e JavaScript**, conectando ao backend via **WebSocket + STOMP** para troca de mensagens em tempo real.

📌 Elementos da interface:
- Campo para nome do usuário  
- Campo para mensagem  
- Área para visualizar mensagens em tempo real  

---

## 🏗️ Backend (Spring Boot)

A lógica do servidor é baseada em eventos com suporte WebSocket configurado via Spring:


🔹 Usa STOMP para publicar/assinar tópicos  
🔹 Recebe mensagens dos clientes e distribui para todos conectados

---

## 🛠️ Tecnologias Utilizadas

| Frontend             | Backend                   | Build             |
|----------------------|---------------------------|-------------------|
| HTML5                | Java 8                    | Maven             |
| CSS3                 | Spring Boot               |                   |
| JavaScript           | WebSocket + STOMP         |                   |

---

## 🚀 Como Rodar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/DanloxBR/chat.git
cd chat
