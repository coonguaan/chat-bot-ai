import React, { useState } from "react";

function Chatbot() {
  const [input, setInput] = useState("");
  const [messages, setMessages] = useState([{ text: "こんにちは、お助けできますか？", isUser: false }]);

  const handleSubmit = (event) => {
    event.preventDefault();
    setMessages([...messages, { text: input, isUser: true }]);
    // 以下に、APIからのレスポンスに応じたメッセージを追加するコードを記述する
    setInput("");
  };

  return (
    <div className="chatbot-container">
      <div className="chatbot-messages">
        {messages.map((message, index) => (
          <div key={index} className={`chatbot-message ${message.isUser ? "chatbot-message-user" : ""}`}>
            {message.text}
          </div>
        ))}
      </div>
      <form onSubmit={handleSubmit} className="chatbot-input-container">
        <input type="text" value={input} onChange={(event) => setInput(event.target.value)} className="chatbot-input" />
        <button type="submit">送信</button>
      </form>
    </div>
  );
}

export default Chatbot;
