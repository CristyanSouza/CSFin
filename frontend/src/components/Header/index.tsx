import logo from '../../assets/img/logo.svg'
import "./styles.css"

function Header() {
    return (
        <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMeta" />
            <h1>DSMeta</h1>
            <p>
              Desenvolvido por
              <a href="https://www.linkedin.com/in/cristyan-de-souza-99a003183/">@cristyan</a>
            </p>
        </div>
    </header>
    );
}

export default Header;