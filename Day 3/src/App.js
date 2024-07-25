import React from 'react';
import './App.css';
import '@fortawesome/fontawesome-free/css/all.min.css';

function App() {
  return (
    <div className="App">
      <Header />
      <MainContent />
      <Newsletter />
      <Footer />
    </div>
  );
}

function Header() {
  return (
    <header className="App-header">
      <nav className="nav-container">
        <div className="nav-left">
        <img src="C:\Users\USER\Downloads\fab-fable-high-resolution-logo-black.png " className="logo" alt="FAB FABLE" />
        </div>
        <ul className="nav-links">
          <li><a href="#home">Home</a></li>
          <li><a href="#personalized-book">Personalized Book</a></li>
          <li><a href="#free-book">Free Book</a></li>
          <li><a href="#must-try-books">Must Try Books</a></li>
        </ul>
        <div className="nav-actions">
          <button className="login-button">Login</button>
          <button className="cart-button"><i className="fas fa-shopping-cart"></i></button>
        </div>
      </nav>
    </header>
  );
}

function MainContent() {
  return (
    <div className="Main-content">
      <div className="sections">
        <section className="section-item" id="personalized-book">
          <h2>Personalized Book</h2>
          <p>Find books tailored to your taste.</p>
        </section>
        <section className="section-item" id="free-book">
          <h2>Free Book</h2>
          <p>Discover books available for free.</p>
        </section>
        <section className="section-item" id="must-try-books">
          <h2>Must Try Books</h2>
          <p>Check out these highly recommended books.</p>
        </section>
      </div>
    </div>
  );
}

function Newsletter() {
  return (
    <div className="Newsletter">
      <h2>Newsletter</h2>
      <p>Subscribe to our newsletter to receive free books every week.</p>
      <form>
        <input type="email" placeholder="Enter your email" required />
        <button type="submit">Subscribe</button>
      </form>
    </div>
  );
}

function Footer() {
  return (
    <footer className="App-footer">
      <div className="footer-section">
        <h3>HELP?</h3>
        <ul>
          <li><a href="#why-choose-us">Why Choose Us</a></li>
          <li><a href="#how-it-works">How It Works</a></li>
          <li><a href="#photoadvice">Photo Advice</a></li>
          <li><a href="#delivery">Delivery</a></li>
          <li><a href="#change-order-refund-policy">Change Order/Refund Policy</a></li>
          <li><a href="#contact-us">Contact Us</a></li>
        </ul>
      </div>
      <div className="footer-section">
        <h3>USEFUL LINKS</h3>
        <ul>
          <li><a href="#about-us">About Us</a></li>
          <li><a href="#blog">Blog</a></li>
          <li><a href="#terms-and-conditions">Terms and Conditions</a></li>
          <li><a href="#cookies-policy">Cookies Policy</a></li>
          <li><a href="#privacy-policy">Privacy Policy</a></li>
          <li><a href="#terms-of-service">Terms of Service</a></li>
        </ul>
      </div>
      <div className="footer-section">
        <h3>CONTACT US</h3>
        <ul>
          <li>Phone: +919848300663</li>
          <li>Address: 112 Bramshill Close, Coimbatore, India</li>
        </ul>
      </div>
      <div className="footer-social">
        <a href="https://www.facebook.com" className="fab fa-facebook-f"></a>
        <a href="https://www.twitter.com" className="fab fa-twitter"></a>
        <a href="https://www.pinterest.com" className="fab fa-pinterest"></a>
        <a href="https://www.instagram.com" className="fab fa-instagram"></a>
        <a href="https://www.youtube.com" className="fab fa-youtube"></a>
      </div>
    </footer>
  );
}

export default App;