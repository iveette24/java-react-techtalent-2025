import Counter from './HookContador';

function ContadorBotones() {
  return (
    <div>
      <h1>Contadores que se actualizan separadamente</h1>
      <Counter />
      <Counter />
    </div>
  );
}

export default ContadorBotones;