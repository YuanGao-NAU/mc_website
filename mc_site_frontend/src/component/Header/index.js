import React,{Component} from "react";

export default class Header extends Component {
    render() {
        return(
            <div>
  
                <ul class="nav justify-content-end">
                    <li class="nav-item">
                        <a class="nav-link" href="#" style={{color:"white",fontSize:"30px"}}>HelloWorldMC</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" style={{color:"white",fontSize:"30px"}}>加入</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" style={{color:"white",fontSize:"30px"}}>服规</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" style={{color:"white",fontSize:"30px"}}>帮助</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" style={{color:"white",fontSize:"30px"}}>近期活动</a>
                    </li>
                </ul>

            </div>

        )
    }
}