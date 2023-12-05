public static int input ( ) {
  int S = input ( ) ;
  int prev = S [ 0 ] ;
  int T = S . length ;
  for ( int i = 1 ;
  i < S . length ;
  i ++ ) {
    if ( S [ i ] != prev ) {
      T = Math . min ( T , Math . max ( i , S . length - i ) ) ;
      prev = S [ i ] ;
    }
  }
  System . out . println ( T ) ;
  return T ;
}
