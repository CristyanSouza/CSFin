import icon from "../../assets/img/notification-icon.svg"
import axios from "axios"


import "./styles.css"
import { BASE_URL } from "../util/util";


type Props = {
    saleId: number;
}

function handleClick (id :Props) {
    axios.get(`${BASE_URL}/${id.saleId}/notification`)
        .then(response => {
            console.log(response)
        });
}

function NotificationButton(saleId : Props) {




    return (
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)} >
            <img src={icon} alt="Notificar" />
        </div>
    );
}

export default NotificationButton;