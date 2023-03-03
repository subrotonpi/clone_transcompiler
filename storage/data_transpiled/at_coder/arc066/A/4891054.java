public static void print ( int N ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  boolean flag ;
  if ( N % 2 == 1 ) {
    B = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      B [ i ] = ( ( i + 1 ) / 2 ) * 2 ;
    }
    int [ ] C = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      C [ i ] = A [ i ] ;
    }
    flag = C . length == 0 ? true : false ;
  }
  System . out . println ( flag ? ( 2 * ( N / 2 ) ) % ( 10 * 9 + 7 ) : 0 ) ;
}
