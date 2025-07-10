import MOH from "./assets/MOH.jpg";
import "./estilo.css";

const Header = () => {
  return (
    <>
      <h1>Esto es el Header</h1>
      <img src={MOH} alt="MastersOfHardcore" />
      <p>
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Non maxime
        inventore, nemo dolorium autem omnis. <strong>nombre</strong> Dolorem,
        magni eligendi beatae sapiente sunt molestias! Cum fuga quibusdam quam
        quidem distinctio vel fugit!
      </p>
      <p>{20 / 5}</p>
    </>
  );
};

export default Header;
