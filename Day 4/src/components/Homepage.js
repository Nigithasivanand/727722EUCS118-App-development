import React from 'react';
import { useNavigate } from 'react-router-dom';

const HomePage = () => {
  const navigate = useNavigate();

  const handleLoginClick = () => {
    navigate('/login');
  };

  return (
    <div>
      <h1>Welcome to Free Books</h1>
      <p>Get access to a wide variety of free books.</p>
      <button onClick={handleLoginClick}>Login</button>
    </div>
  );
};

export default HomePage;
