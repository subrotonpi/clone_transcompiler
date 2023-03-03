public static int [ ] getA ( ) {
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List < Integer > Data = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      Data . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    A [ i ] = Data . get ( 0 ) ;
    B [ i ] = Data . get ( 1 ) ;
  }
  int ma = 10e10 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] > B [ i ] ) {
      if ( B [ i ] < ma ) {
        ma = B [ i ] ;
      }
    }
  }
  if ( ma == 10e10 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Arrays . toString ( A ) - ma ) ;
  }
  return A ;
}
