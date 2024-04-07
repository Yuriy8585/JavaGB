//1
var superLink = document.getElementById("super_link");
console.log(superLink);

//2
var cardLinks = document.getElementsByClassName("card-link");
for (var i = 0; i < cardLinks.length; i++) {
 cardLinks[i].innerHTML = "ссылка";
}

//3
var cardBody = document.getElementsByClassName("card-body")[0];
var cardLinksInsideCardBody = cardBody.getElementsByClassName("card-link");
console.log(cardLinksInsideCardBody);

//4
var firstElementWithDataNumber = document.querySelector('[data-number="50"]');
console.log(firstElementWithDataNumber);


//5
console.log(document.title);

//6
var cardTitle = document.getElementsByClassName("card-title")[0];
console.log(cardTitle.parentNode);

//7
var pTag = document.createElement("p");
pTag.innerHTML = "Привет";

var card = document.getElementsByClassName("card")[0];
card.insertBefore(pTag, card.firstChild);

//8
var h6Tag = document.getElementsByTagName("h6")[0];
h6Tag.parentNode.removeChild(h6Tag);