import Fail from "./Fail";
import Success from "./Success";

function Condition() {
    const display = true;
    if (display) {
        return <Success></Success>;
    } else {
        return <Fail></Fail>;
    }
}
export default Condition;