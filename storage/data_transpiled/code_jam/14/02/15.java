static String bestCookieTime ( int c , int f , int x ) {
  long zeroTime = cookieTime ( c , f , x , 0 ) ;
  long bestTime = zeroTime ;
  long totalFarMs = 1000 ;
  long newTime = cookieTime ( c , f , x , totalFarMs ) ;
  while ( newTime < bestTime ) {
    totalFarMs += 1000 ;
    bestTime = newTime ;
    newTime = cookieTime ( c , f , x , totalFarMs ) ;
  }
  totalFarMs -= 1900 ;
  if ( totalFarMs < 10 ) {
    totalFarMs = 10 ;
  }
  bestTime = zeroTime ;
  newTime = cookieTime ( c , f , x , totalFarMs ) ;
  while ( newTime < bestTime ) {
    totalFarMs += 100 ;
    bestTime = newTime ;
    newTime = cookieTime ( c , f , x , totalFarMs ) ;
  }
  totalFarMs -= 190 ;
  if ( totalFarMs < 10 ) {
    totalFarMs = 10 ;
  }
  bestTime = zeroTime ;
  newTime = cookieTime ( c , f , x , totalFarMs ) ;
  while ( newTime < bestTime ) {
    totalFarMs += 10 ;
    bestTime = newTime ;
    newTime = cookieTime ( c , f , x , totalFarMs ) ;
  }
  totalFarMs -= 19 ;
  if ( totalFarMs < 1 ) {
    totalFarMs = 1 ;
  }
  bestTime = zeroTime ;
  newTime = cookieTime ( c , f , x , totalFarMs ) ;
  while ( newTime < bestTime ) {
    totalFarMs ++ ;
    bestTime = newTime ;
    newTime = cookieTime ( c , f , x , totalFarMs ) ;
  }
  return String . valueOf ( bestTime ) ;
  /* if (x < c){
  return x/2;
  }*/
  long farMs = 0 ;
  long time = 0 ;
  long cookieRate = 2 ;
  while ( farMs < totalFarMs ) {
    time += c / cookieRate ;
    cookieRate += f ;
    farMs ++ ;
  }
  return time + x / cookieRate ;
}
