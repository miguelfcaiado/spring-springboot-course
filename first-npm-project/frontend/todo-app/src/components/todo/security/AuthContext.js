import { createContext, useState, useContext } from "react";
import { executeBasicAuthenticationService } from "../api/HelloWorldApiService";

const AuthContext = createContext()

export const useAuth = () => useContext(AuthContext)

export default function AuthProvider({ children }) {

    const [isAuthenticated, setAuthenticated] = useState(false)
    const [username, setUsername] = useState(null)

    // function login(username, password) {
    //     if(username === 'in28minutes' && password === 'dummy') {
    //         setAuthenticated(true)
    //         setUsername(username)
    //         return true
    //     }
    //     else {
    //         setAuthenticated(false)
    //         setUsername(null)
    //         return false
    //     }
    // }

    function login(username, password) {

        const baToken = 'Basic ' + window.btoa(username + ":" + password)
        
        executeBasicAuthenticationService(baToken)
        .then(response => console.log(response))
        .catch(error => console.log(error))

        setAuthenticated(false)

        // if(executeBasicAuthenticationService) {
        //     setAuthenticated(true)
        //     setUsername(username)
        //     return true
        // }
        // else {
        //     setAuthenticated(false)
        //     setUsername(null)
        //     return false
        // }
    }

    function logout() {
        setAuthenticated(false)
    }

    return (
        <AuthContext.Provider value={ {isAuthenticated, login, logout, username} }>
            {children}
        </AuthContext.Provider>
    )
}