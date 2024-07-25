import React from 'react'

//function classNames(...classes) {
//  return classes.filter(Boolean).join(' ')
//}

export default function Bottom() {

  return (
        <div className='grid grid-cols-3 gap-10'> 
           
           <div>
              <h2 className='flex text-1xl font-bold text-white justify-center  break-normal px-40 '> Pages</h2>
              <div> 
                <ul></ul>
                <ul></ul>
              </div>
           </div>

           <div>
              <h2 className='flex text-1xl font-bold text-white justify-center  break-normal px-40 '> Utility Pages</h2>
                <div> 
                  <ul> 
                    <li></li>
                  </ul>
                  <ul></ul>
              </div>

           </div>

           <div>
              <h2 className='flex text-1xl font-bold text-white justify-center  break-normal px-40 '> Follow me On Instagram </h2>
              

           </div>
        </div>
        
      
  )
}
