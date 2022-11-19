import icon from "../../assets/img/notification-icon.svg"
import axios from "axios"


import "./styles.css"
import { BASE_URL } from "../util/util";
import { toast } from "react-toastify";


type Props = {
    saleId: number;
}

function handleClick (id :Props) {
    axios.get(`${BASE_URL}/sale/${id.saleId}/notification`)
        .then(response => {
            toast.success("SMS enviado com sucesso");
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