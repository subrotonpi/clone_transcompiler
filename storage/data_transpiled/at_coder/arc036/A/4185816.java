public static int aGoodSleep ( int N , int K , int [ ] T ) {
  int sleepTime = Integer . valueOf ( T [ 0 ] ) ;
  if ( sleepTime < K ) {
    return 3 ;
  }
  int ans = - 1 ;
  for ( int day = 3 , t = 4 ;
  day < t ;
  day ++ ) {
    sleepTime -= T [ day - 3 - 1 ] ;
    sleepTime += T [ day - 1 ] ;
    if ( sleepTime < K ) {
      ans = day ;
      break ;
    }
  }
  return ans ;
}
