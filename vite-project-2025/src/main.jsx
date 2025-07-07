// FETCH API
const apiKey = "vuIT3Mk786renTFwK69IlfK6NbkB09js";
const peticion = fetch(`http://api.giphy.com/v1/gifs/random?api_key=${apiKey}`);

// peticion.then( resp => console.log(resp))
// .catch (console.warn);

// peticion.then ( resp => {
//   resp.json().then( data => {
//     console.log(data);
//   })
// })
// .catch (console.warn);

peticion
  .then((resp) => resp.json())
  .then(({ data }) => {
    const { url } = data.images.original;
    const img = document.createElement("img");
    img.src = url;
    document.body.append(img);
  })
  .catch(console.warn);