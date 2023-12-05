public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    while ( A [ i ] % 2 == 0 ) {
      A [ i ] /= 2 ;
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
