public static int N = Integer . parseInt ( input ) {
  int [ ] aArray = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) aArray [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  /*gcd*/
  if ( aArray . length == 0 ) {
    return aArray [ 0 ] ;
  }
  /*lcm*/
  int s = aArray [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    s = lcm ( s , aArray [ i ] ) ;
  }
  /*f*/
  return s ;
}
