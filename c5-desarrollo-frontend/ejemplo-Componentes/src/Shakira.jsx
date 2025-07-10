import "./Perfil.css";

const shakira = {
  name: "Shakira",
  imageUrl:
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzU4JiWFJ-Pf9SXOdMljBcC88Hjfi087Eftw&s",
  imageSize: 90,
};

function ProfileShakira() {
  return (
    <>
      <h2>{shakira.name}</h2>
      <img
        className="avatar"
        src={shakira.imageUrl}
        alt={"Foto de " + shakira.name}
        style={{
          width: shakira.imageSize,
          height: shakira.imageSize,
        }}
      />
    </>
  );
}

export default ProfileShakira;
