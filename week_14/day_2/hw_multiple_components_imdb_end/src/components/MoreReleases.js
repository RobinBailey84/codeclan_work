import React, { Component } from 'react';
import './MoreReleases.css';

class MoreButton extends Component {

  render() {
    return (
      <div className='more-releases'>
        <a href={'http://www.imdb.com/calendar/?region=gb'}>
          View more upcoming releases for {this.props.country} >>
        </a>
      </div>
    );
  }

}


export default MoreButton;
