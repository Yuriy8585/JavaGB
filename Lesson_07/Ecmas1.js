const min = Math.min(...arr);
const createCounter = () => {
    let count = 0;
    return {
      increment: () => count++,
      decrement: () => count--,
    };
  };
  const getElementsByClass = (rootElement, className) => {
    if (!rootElement) return [];
    const elements = rootElement.getElementsByClassName(className);
    return Array.from(elements);
  };
  
  class CounterApp extends React.Component {
    constructor(props) {
      super(props);
      
      this.counter1 = createCounter();
      this.counter2 = createCounter();
      
      this.state = {
        counter1Value: this.counter1.increment(),
        counter2Value: min, // Минимаальное значение счетчика - минимальное значение массива arr
        showResult: false,
      };
    }
  }
  
  const findElementByClass = (rootElement, className) => {
    if (!rootElement) return null;
    if (rootElement.classList.contains(className)) return rootElement;
    return rootElement.children.reduce(
      (acc, child) => acc || findElementByClass(child, className),
      null
    );
  };