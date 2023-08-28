import { useState } from 'react'
import './Counter.css'
import CounterButton from './CounterButton'

export default function Counter() {
    
    const [count, setCount] = useState(0)

    function incrementTotalCounter(by) {
        setCount(count + by)
    }

    function decrementTotalCounter(by) {
        setCount(count - by)
    }

    function resetCounter() {
        setCount(0)
    }

    return (
        <>
            <CounterButton by={1} incrementMethod={incrementTotalCounter} decrementMethod={decrementTotalCounter}/>
            <CounterButton by={2} incrementMethod={incrementTotalCounter} decrementMethod={decrementTotalCounter}/>
            <CounterButton by={5} incrementMethod={incrementTotalCounter} decrementMethod={decrementTotalCounter}/>
            <span className="count">{count}</span>
            <div>
                <button className="resetButton" onClick={resetCounter}>Reset</button>
            </div>
        </>
    )
}
