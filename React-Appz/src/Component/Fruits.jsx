
function Fruits() {
    /*const Fruits = ["Apple", "Mango", "orange", "cherry"]*/
    const Fruits = [
        { id: 1, name: 'Apple' },
        { id: 2, name: 'Banana' },
        { id: 3, name: 'Orange' },
        { id: 4, name: 'Cherry' }
    ];
    console.log(`${Fruits}`);
    return (
        <div>
            <h1>Types of Fruits</h1>
            {Fruits.map((Fruits) => (
                <ul><li key={Fruits.id}>{Fruits.name}</li></ul>
            ))}

            <img src="https://th.bing.com/th?id=OIP.Vt_kADMJ4rzd_a1P_ZnoSwHaHa&w=250&h=250&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2" />
        </div>
    );
}
export default Fruits;