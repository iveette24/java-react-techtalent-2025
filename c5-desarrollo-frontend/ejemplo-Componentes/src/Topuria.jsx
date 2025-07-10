import "./Perfil.css";

const topuria = {
  name: "Topuria",
  imageUrl:
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQd7tQ4yr9vWTqBx1plSEKCQTx1Ln7X7ujQAw&s",
  imageSize: 90,
};

function ProfileTopuria() {
  return (
    <>
      <h2>{topuria.name}</h2>
      <img
        className="avatar"
        src={topuria.imageUrl}
        alt={"Foto de " + topuria.name}
        style={{
          width: topuria.imageSize,
          height: topuria.imageSize,
        }}
      />
    </>
  );
}

export default ProfileTopuria;
