import React  from 'react';

const Pirate = (props) => {

  return (
    <div className="component">
        <p className="name">
          {props.pirate.firstName} {props.pirate.lastName}
        </p>
      <p>Age: {props.pirate.age}</p>
      <p>Ship: {props.pirate.ship.name}</p>
    </div>
  )
}

export default Pirate;
