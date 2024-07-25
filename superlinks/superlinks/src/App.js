import './App.css';
import React from 'react'
import Header from './Components/Header';
import Subscribers from './Components/Subscriber';
import Bottom from './Components/Bottom';


function App() {
  
  return (
    <div className="contain App bg-black ">
      <Header />
      
      <div className='scroll-smooth'>
        <div className="py-20 ">
          <img className='flex mx-auto pl-50 ' src="logo192.png" alt='profile'/>
          <h1 className= "flex text-3xl font-bold text-white justify-center  break-normal px-40 "> My Name is John. I'm 26 and I enjoy making videos </h1>
          <p className='flex text-white font-thin justify-center break-normal px-40 '> Lorem ipsum dolor sit amet consectetur adipiscing elit sit enim sed non nisi, ut ultrices molestie null purus ut pellentesque quam urna.</p>
        </div>

        <div className="py-5 ">
          <button className="btn btn-default bg-red-500 hover:bg-red-900 text-white rounded-full px-5 py-5"> Subscribe to my channel</button>  
        </div>

        <Subscribers/> 

        <div className=' w-full py-16 px-4'>
           <div className='max-w-[1240px] mx-auto grid md:grid-cols-2 ' >
                <div className='flex flex-col justify-center'> 
                  <h1 className='flex text-3xl font-bold text-white justify-center  break-normal pl-20 pr-5'>Trying and reviewing technology products is my #1 passion</h1>
                  <p className='flex text-white font-thin justify-center break-normal pl-20 pr-5'>Lorem ipsum dolor sit amet consectetur adipiscing elit massa consectetur in molestie augue sed sed augue nibh et quis nibh. Faucibus sem non cursus lectus nibh volutpat aliquam sed est nibh adipiscing hendrerit rhoncus, sed dolor tortor pellentesque quis molestie volutpat volutpat euismod sit non sit sed.</p>
                </div>
                <img src='CallOfDuty.jpg' alt='Vertical Right' className='container mx-auto my-4 w-96 h-96 object-contain'></img>
           </div>
           <div className='max-w-[1240px] mx-auto grid md:grid-cols-2 '>
                <img src='CallOfDuty.jpg' alt='Vertical Left' className='h-96 md:object-scale-down'></img>
                <div className='flex flex-col justify-center'> 
                  <h1 className='flex text-3xl font-bold text-white justify-center pr-20 pl-5'>Along 6 years, I had produced over 200 tech videos </h1>
                  <p className='flex text-white font-thin justify-center break-normal pr-20 pl-5'>Lorem ipsum dolor sit amet consectetur adipiscing elit massa consectetur in molestie augue sed sed augue nibh et quis nibh. Faucibus sem non cursus lectus nibh volutpat aliquam sed est nibh adipiscing hendrerit rhoncus, sed dolor tortor pellentesque quis molestie volutpat volutpat euismod sit non sit sed.</p>
                </div>
           </div>
        </div>

        <div className='pl-20 aspect-w-16 aspect-h-9 py-9'> 
            <h1 className='flex text-3xl font-bold text-white justify-center pr-20 pl-5'> Watch my Channel Intro</h1>
            <iframe src="https://www.youtube.com/embed/a4YoRazp2Uo" frameborder="0" width="640" height="360" allow="autoplay; fullscreen; picture-in-picture" title='Channel Video' className='flex container px-4'></iframe>
        </div>
        
        <div className='py-7'>
            <div className='grid grid-cols-4 '>
              <img src='logo192.png' alt='Random pic'></img>
              <img src='logo192.png' alt='Random pic'></img>
              <img src='logo192.png' alt='Random pic'></img>
              <img src='logo192.png' alt='Random pic'></img>
            </div>
        </div>

        <div className='grid grid-cols-2 gap-10'> 
           <img src='logo.png' alt='Company Logo' className='block h-8 w-auto '></img>
           <div> 
             <p className='flex text-white font-thin justify-center break-all pl-5'> Want to stay tuned about all videos released every week? Subscribe to my YouTube channel today. </p>
             <button className="btn btn-default bg-red-500 hover:bg-red-900 text-white rounded-full px-5 py-5"> Subscribe</button>  
           </div>
        </div>

        <Bottom/>      
      </div>

      

      <footer> 
        <p className='flex font-light text-white justify-left  break-normal '> Copyright © Video X | Designed by BRIX Templates - Powered by Webflow </p>
         <p className='flex text-white justify-center  break-normal px-40 justify-end'> Icons</p>
      </footer>

    </div>

    
  );
}

export default App;
