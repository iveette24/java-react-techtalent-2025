// import { Fragment } from "react";
import MOH from './assets/MOH.jpg';
const nombre = 'Ivette';
const nuevoMensaje = {
    mensaje: 'Hola Mundo',
    nombre: 'Maria'
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
            <img src={MOH} alt="MastersOfHardcore" />
            <p>Segundo componente</p>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Non maxime inventore, nemo dolorium autem omnis. <strong>nombre</strong> Dolorem, magni eligendi beatae sapiente sunt molestias! Cum fuga quibusdam quam quidem distinctio vel fugit!</p>
            <p>{ 1+2 }</p>
            <p>{ nombre }</p>
            {/* <p>{nuevoMensaje}</p> */}
            <p>{ nuevoMensaje.mensaje }</p>
            <p>{booleano}</p>
            <code>{ JSON.stringify(nuevoMensaje) }</code>
            
        </>

    );
};

export default SegundoComponente;