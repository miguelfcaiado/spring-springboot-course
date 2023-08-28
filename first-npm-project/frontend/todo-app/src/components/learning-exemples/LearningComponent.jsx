import FirstComponent from './FirstComponent';
import SecondComponent from './SecondComponent';
import ThirdComponent from './ThirdComponent';
import LearningJavaScript from './LearningJavaScript';

export default function LearningComponent() {
    return (
      <div className="App">
        My Todo App
        <FirstComponent />
        <SecondComponent />
        <ThirdComponent />
        <LearningJavaScript />
      </div>
    );
}