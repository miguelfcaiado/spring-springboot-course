const person = {
    name: 'Miguel',
    address: {
        country: 'Portugal',
        city: 'Lisbon'
    },
    profiles: ['Linkedin', 'GitHub'],
    printProfile: () => {
        person.profiles.map(
            profile => console.log(profile)
        )
    }
}

export default function LearningJavaScript() {
    return (
        <>
            <div>{person.name}</div>
            <div>{person.address.country}</div>
            <div>{person.profiles[0]}</div>
            <div>{person.printProfile()}</div>
        </>
    )
}