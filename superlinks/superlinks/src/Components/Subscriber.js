import React from 'react'

//function classNames(...classes) {
//  return classes.filter(Boolean).join(' ')
//}

export default function Header() {
    const followers= 4.2
  return (
        <div className='py-5 px-10'>
          <div className=' grid grid-cols-4'>
              <div className='margin text-gray-600'><span style={{fontWeight:'bold', fontSize:'2rem', color:'white'}}> {followers}M </span>Youtube Subscribers </div>    
              <div className='margin text-gray-600'> <span style={{fontWeight:'bold', fontSize:'2rem', color:'white'}}> {followers}M </span> Twittwer Followers </div>    
              <div className='margin text-gray-600'> <span style={{fontWeight:'bold', fontSize:'2rem', color:'white'}}> {followers}M </span> Facebook Followers </div>   
              <div className='margin text-gray-600'> <span style={{fontWeight:'bold', fontSize:'2rem', color:'white'}}> {followers}M </span> Instagram Followers </div>    
          </div>
        </div>

  )
}

