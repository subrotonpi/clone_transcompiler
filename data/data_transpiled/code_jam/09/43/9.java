static boolean calc ( int [ ] a , int [ ] b ) {
  if ( a [ 0 ] > b [ 0 ] ) return calc ( b , a ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( ( a [ i ] >= b [ i ] ) && ( a [ i ] <= b [ i ] ) ) return false ;
  }
  return true ;
}
