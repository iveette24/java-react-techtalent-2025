// import { Fragment } from "react";
import MyButton from "./button";
// import ProfileShakira from "./Shakira";
// import ProfileTopuria from "./Topuria";
import SelectorDePerfil from "./botonEscoger";
import ShoppingList from "./Arrays";
import MouseExample from "./ContrEvenMouse";
import PointerExample from "./ContrEvenPuntero";
import FocusExample from "./FocusExample";
import KeyboardExample from "./KeyboardExample";
import Counter from "./HookContador";
import ContadorBotones from "./HookContadores";

const nombre = "Ivette";
const nuevoMensaje = {
  mensaje: "Hola Mundo",
  nombre: "Maria",
};
const booleano = true;

const SegundoComponente = () => {
  // const nombre = 'Ivette';

  return (
    // <div>
    // <h2>Segundo Componente</h2>
    // <p>Un párrafo</p>
    // </div>

    // <Fragment>
    // <h2>Segundo Componente</h2>
    // <p>Un párrafo</p>
    // </Fragment>

    <>
      <p>Segundo componente</p>
      <p>
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Non maxime
        inventore, nemo dolorium autem omnis. <strong>nombre</strong> Dolorem,
        magni eligendi beatae sapiente sunt molestias! Cum fuga quibusdam quam
        quidem distinctio vel fugit!
      </p>
      <p>{1 + 2}</p>
      <MouseExample />
      <br />
      <br />
      <PointerExample />
      <br />
      <br />
      <FocusExample />
      <br />
      <br />
      <KeyboardExample />
      <br />
      <br />
      <h1>Contador con un botón</h1>
      <Counter />
      <br />
      <br />
      <ContadorBotones />
      <br />
      <br />
      <MyButton />
      <br />
      <br />
      <SelectorDePerfil />
      {/* <ProfileShakira/>
            <ProfileTopuria/> */}
      <p>{nombre}</p>
      {/* <p>{nuevoMensaje}</p> */}
      <ShoppingList />
      <p>{nuevoMensaje.mensaje}</p>
      <p>{booleano}</p>
      <code>{JSON.stringify(nuevoMensaje)}</code>
    </>
  );
};

export default SegundoComponente;
