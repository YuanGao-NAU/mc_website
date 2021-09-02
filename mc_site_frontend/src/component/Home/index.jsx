import React, {Component} from "react";
import "./index.css";
import Header from "../Header";

export default class Home extends Component{
    render() {
        return(
            <div>
                <Header/>
                <div className='container vh-100 d-flex align-items-center col justify-content-center'>
                    <div className="" style={{color:"white",fontSize:"30px"}}>
                        ...
                    </div>
                </div >
            </div>
        )
    }
}