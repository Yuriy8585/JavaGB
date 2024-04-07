const data = {
    image: 'https://fullhdoboi.ru/wp-content/uploads/_ph/31/315988009.jpg',
    imageWidth: 500, // set the desired width
    imageHeight: 300, // set the desired height
    header: 'Welcome to my website!',
    paragraph: 'This is an example paragraph.',
  };
  
  
const image = document.getElementById('image');
    image.src = data.image;
    image.width = data.imageWidth;
    image.height = data.imageHeight;

document.getElementById('image').src = data.image;
document.getElementById('header').textContent = data.header;
document.getElementById('paragraph').textContent = data.paragraph;