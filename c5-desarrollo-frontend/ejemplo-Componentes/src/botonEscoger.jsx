import { useState } from "react";
import "./Perfil.css";
import ProfileShakira from "./Shakira";
import ProfileTopuria from "./Topuria";

export default function SelectorDePerfil() {
  const [perfilActivo, setPerfilActivo] = useState(null); // null, 'shakira' o 'topuria'

  let content;
  if (perfilActivo === "shakira") {
    content = <ProfileShakira />;
  } else if (perfilActivo === "topuria") {
    content = <ProfileTopuria />;
  } else {
    content = <p>Selecciona un perfil para mostrar</p>;
  }

  return (
    <div>
      <button
        className=".boton-shakira"
        onClick={() => setPerfilActivo("shakira")}
      >
        Mostrar Shakira
      </button>
      <button
        className=".boton-topuria"
        onClick={() => setPerfilActivo("topuria")}
      >
        Mostrar Topuria
      </button>
      {content}
    </div>
  );
}
