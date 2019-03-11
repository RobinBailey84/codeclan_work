import React from 'react';

const CountryDetail = (props) => {
  if(!props.country) {
    return <p>Waiting for selection...</p>
  }
  return (
    <div>
    <h3>{props.country.name}</h3>
    <h3>{props.country.population}</h3>

    </div>
  )
}

export default CountryDetail;
