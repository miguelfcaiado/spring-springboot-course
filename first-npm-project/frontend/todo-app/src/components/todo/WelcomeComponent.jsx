import { useParams, Link } from "react-router-dom"
import axios from "axios"

function WelcomeComponent() {
    
    const {username} = useParams()

    function callHelloWorldRestApi() {
        axios.get('http://localhost:8080/hello-world').then(
            (response) => successfullResponse())
        .catch((error) => errorResponse(error))
        .finally(() => console.log('cleanup'))

    }

    function successfullResponse(response) {
        console.log(response)
    }

    function errorResponse(error) {
        console.log(error)
    }

    return (
        <div>
            <h1>Welcome {username}</h1>
            <div className="WelcomeComponent">
                Manage your todos - <Link to="/todos">Go here</Link>
            </div>
            <div>
                <button className="btn btn-success m-5"  onClick={callHelloWorldRestApi}>Call Hello World</button>
            </div>
        </div>
    )
}

export default WelcomeComponent
