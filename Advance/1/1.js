"use strict";

/*
###Задание 1
Создайте обычный объект "Музыкальная коллекция", который можно итерировать. 
Каждая итерация должна возвращать следующий альбом из коллекции. Коллекция 
альбомов - это массив внутри нашего объекта (создать несколько альбомов самому).
Каждый альбом имеет следующую структуру:
{
  title: "Название альбома",
  artist: "Исполнитель",
  year: "Год выпуска"
}
Используйте цикл for...of для перебора альбомов в музыкальной коллекции и 
вывода их в консоль в формате:
"Название альбома - Исполнитель (Год выпуска)"
*/
const musicCollection = {
  albums: [
    {
      title: "Blue",
      artist: "Joni Mitchell",
      year: 1971,
    },
    {
      title: "The Dark Side of the Moon",
      artist: "Pink Floyd",
      year: 1973,
    },
    {
      title: "OK Computer",
      artist: "Radiohead",
      year: 1997,
    },
  ],
  [Symbol.iterator]() {
    let index = 0;
    const length = this.albums.length;
    return {
      next: () => {
        if (index < length) {
          return {
            value: this.albums[index++],
            done: false,
          };
        } else {
          return {
            done: true,
          };
        }
      },
    };
  },
};

for (const album of musicCollection) {
  console.log(`${album.title} - ${album.artist} (${album.year})`);
}