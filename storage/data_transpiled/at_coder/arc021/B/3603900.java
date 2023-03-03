public static int [ ] getBinaryInt ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = new int [ L ] ;
  int a = 0 ;
  int an = 0 ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( i != L - 1 ) {
      an = an ^ b [ i ] ;
    }
    else {
      if ( an != b [ i ] ^ 0 ) {
        System . out . println ( - 1 ) ;
      }
      else {
        System . out . println ( 0 ) ;
        for ( int j = 0 ;
        j < L - 1 ;
        j ++ ) {
          a = a ^ b [ j ] ;
          System . out . println ( a ) ;
        }
      }
    }
  }
  return b ;
}
