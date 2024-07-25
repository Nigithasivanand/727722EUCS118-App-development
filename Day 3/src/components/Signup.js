import React from 'react';
import { useNavigate } from 'react-router-dom';

const Signup = () => {
  const navigate = useNavigate();

  const handleSignup = (event) => {
    event.preventDefault();
    // Handle signup logic here
    navigate('/login'); // Redirect to login after successful signup
  };

  return (
    <div>
      <h2>Signup</h2>
      <form onSubmit={handleSignup}>
        <div>
          <label>Username:</label>
          <input type="text" name="username" required />
        </div>
        <div>
          <label>Password:</label>
          <input type="password" name="password" required />
        </div>
        <div>
          <label>Email:</label>
          <input type="email" name="email" required />
        </div>
        <div>
          <label>Phone Number:</label>
          <input type="tel" name="phone" required />
        </div>
        <button type="submit">Signup</button>
      </form>
    </div>
  );
};

export default Signup;
