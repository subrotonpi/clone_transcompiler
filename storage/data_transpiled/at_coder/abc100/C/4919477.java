public static int N ( ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int two_num = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    while ( A [ i ] % 2 == 0 ) {
      two_num ++ ;
      A [ i ] = A [ i ] / 2 ;
    }
  }
  return two_num ;
}
