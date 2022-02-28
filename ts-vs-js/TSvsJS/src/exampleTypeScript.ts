export const case1Ts = () => {
    
    let productAmount: number = 20;
    productAmount *= 2;
    //productAmount = "40"; Derleme sırasında hata verecek

    return productAmount;
};

export const case2Ts = () => {
    
    let productAmount = 20;

    //productAmount.toUpperCase(); Derleme sırasında hata verecek

    return productAmount;
};

interface Person {
    name: string,
    age: number,
    hasJob: boolean,
    walk: () => void,
    run: () => void,
    speak: (something: string) => void
}

export const user: Person = {
    name: "ismail",
    age: 23,
    hasJob: true,
    walk: () => console.log("I'm walking."),
    run: () => console.log("I'm runing."),
    speak: (word: string) => console.log("I'm saying: " + word)
};

