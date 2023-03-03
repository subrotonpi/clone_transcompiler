public static int N = Integer . parseInt ( input ) {
  int [ ] array = new int [ N ] ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    array [ i ] = i * 100 + i * 10 + i ;
  }
  for ( int i = 0 ;
  i < array . length ;
  i ++ ) {
    if ( array [ i ] >= N ) {
      System . out . println ( array [ i ] ) ;
      break ;
    }
  }
  return array [ 0 ] ;
}
