import React,{Component} from "react";

export default class Header extends Component {
    render() {
        return(
            <ul class="nav justify-content-end">
                <li class="nav-item">
                    <a class="nav-link" href="#" style={{color:"white"}}>Active</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" style={{color:"white"}}>Link</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" style={{color:"white"}}>Link</a>
                </li>
            </ul>
        )
    }
}