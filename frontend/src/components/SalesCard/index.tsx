import NotificationButton from "../NotificationButton";
import DatePicker from "react-datepicker";
import "./styles.css";
import "react-datepicker/dist/react-datepicker.css";
import { useState, useEffect } from "react";
import axios from "axios";
import { Sale } from "../model/Sale";
import { BASE_URL } from "../util/util";


function SalesCard() {

    const min = new Date(new Date().setDate(new Date().getDate() - 365));
    const max = new Date();
    
    const [dataMin, setDataMin] = useState(min);
    const [dataMax, setDataMax] = useState(max);
    const [sales, setSales] = useState<Sale[]>([])

    useEffect(() => {
        axios.get(`${BASE_URL}/sale`)
        .then(response => {
            setSales(response.data.content);
        })
    }, []);


    return (
        <div className="dsmeta-card">
            <h2 className="dsmeta-sales-title">Vendas</h2>
            <div>
                <div className="dsmeta-form-control-container">
                    <DatePicker
                        selected={dataMin}
                        onChange={(date: Date) => {setDataMin(date)}}
                        className="dsmeta-form-control"
                        dateFormat="dd/MM/yyyy"
                    />                </div>
                <div className="dsmeta-form-control-container">
                    <DatePicker
                        selected={dataMax}
                        onChange={(date: Date) => {setDataMax(date)}}
                        className="dsmeta-form-control"
                        dateFormat="dd/MM/yyyy"
                    />                </div>
            </div>

            <div>
                <table className="dsmeta-sales-table">
                    <thead>
                        <tr>
                            <th className="show992">ID</th>
                            <th className="show576">Data</th>
                            <th>Vendedor</th>
                            <th className="show992">Visitas</th>
                            <th className="show992">Vendas</th>
                            <th>Total</th>
                            <th>Notificar</th>
                        </tr>
                    </thead>
                    <tbody>
                        { sales.map(sale => {
                            return(
                                <tr key={sale.id}>
                                <td className="show992">{sale.id}</td>
                                <td className="show576">{new Date(sale.date).toLocaleDateString()}</td>
                                <td>{sale.sellerName}</td>
                                <td className="show992">{sale.visited}</td>
                                <td className="show992">{sale.deals}</td>
                                <td>R$ {sale.amount.toFixed(2)}</td>
                                <td>
                                    <div className="dsmeta-red-btn-container">
                                        <NotificationButton />
                                    </div>
                                </td>
                                 </tr>
                            )

                        })

                        }

                       
                    </tbody>

                </table>
            </div>
        </div>

    );
}


export default SalesCard;