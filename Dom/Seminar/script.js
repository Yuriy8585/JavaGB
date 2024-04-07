// Get reference to the first paragraph inside the div with id "block"
var firstParagraph = document.querySelector('#block p');
console.log(firstParagraph.textContent);

// Get reference to the first paragraph with class "www"
var firstParagraphWithClassWww = document.querySelector('.www');
console.log(firstParagraphWithClassWww.textContent);



//Задание 2
const linkDev = document.querySelector('.link');
linkDev.textContent = 'link text js';
linkDev.href = 'https://developer.mozilla.org/ru/'; 

// Select all image tags with class 'photo'
const images = document.querySelectorAll('.photo');
// Loop through each image
images.forEach((image) => {
  // Set the src attribute to a new image URL
  image.src = 'https://example.com/new-image.jpg';
});



//Задание 4
// Создаем элемент button
//var button = document.createElement('button');
//button.innerHTML = 'Нажми на меня';

// Функция для обработки клика
//var clickCount = 0;
//button.onclick = function() {
 //clickCount++;
 //console.log('Вы нажали на кнопку ' + clickCount + ' раз(а)');
//};

// Добавляем кнопку в блок <div class="content"></div>
//var content = document.querySelector('.content');
//content.appendChild(button);


//
const button = document.createElement('button');
button.textContent = 'Send Text';
button.id = 'myButton';

let clickCount = 0;

button.addEventListener('click', () => {
  clickCount++;
  console.log(`Button clicked ${clickCount} times.`);
  button.textContent = 'Text sent';
});
const contentDiv = document.querySelector('.content');
contentDiv.appendChild(button);

