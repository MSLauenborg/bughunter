/* Find fejlen i koden og ret den */

void main() {
    int age = Integer.parseInt(IO.readln("Indtast din alder: "));

    if (erVoksen(age)) {
        IO.println("Du er voksen.");
    } else {
        IO.println("Du er ikke voksen.");
    }
}

boolean erVoksen(int age) {
    return age >= 18;
}