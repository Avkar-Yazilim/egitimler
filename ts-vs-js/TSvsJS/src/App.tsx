import './App.css';
import { case1Js } from './exampleJavaScript';
import { case1Ts, user } from './exampleTypeScript';
import TestComponent, { IOrder } from './components/TestComponent';

function App() {
  
  case1Ts();
  case1Js()

  console.log(user.name);
  user.walk();
  user.speak("What's up?");

  const order: IOrder = {
    orderId: 1,
    orderName: "Hamburger",
    orderType: 'meal',
    orderRequestIds: ['1']
  }

  const onSelect = () => {
    console.log("onSelect")
  }

  const onDelete = () => {
    console.log("onDelete")
  }

  return (
    <div className="App">
      <TestComponent order={order} onSelect={onSelect} onDelete={onDelete} />
    </div>
  );
}

export default App;
