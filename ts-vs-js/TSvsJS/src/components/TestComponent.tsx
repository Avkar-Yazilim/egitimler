export interface IOrder {
    orderId: number;
    orderName?: string; // soru işareti optional anlamına geliyor
    orderType: 'meal' | 'drink'; // enum gibi düşünebiliriz
    orderRequestIds: string[];
}

interface IOrderCard {
    order: IOrder;
    onSelect: () => void;
    onDelete: () => void;
}

const OrderCard: React.FC<IOrderCard> = ({ order, onDelete, onSelect }) => {
    return (
        <div>
            <div>{order.orderName}</div>
            <button onClick={onDelete}>Delete Order</button>
            <button onClick={onSelect}>Select Order</button>
        </div>
    )
}

export default OrderCard;