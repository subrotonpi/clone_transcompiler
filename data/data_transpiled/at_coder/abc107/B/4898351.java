public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] data = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    data [ i ] = String . valueOf ( input . nextLine ( ) ) ;
  }
  List < String > newData = new ArrayList < String > ( ) ;
  int [ ] row = new int [ W ] ;
  for ( String d : data ) {
    if ( d . indexOf ( '.' ) == W ) continue ;
    newData . add ( d ) ;
    for ( int i = 0 ;
    i < W ;
    i ++ ) {
      if ( d . charAt ( i ) == '.' ) row [ i ] ++ ;
    }
  }
  int num = newData . size ( ) ;
  for ( String d : newData ) {
    for ( int i = 0 ;
    i < W ;
    i ++ ) {
      if ( row [ i ] != num ) System . out . print ( d . charAt ( i ) ) ;
    }
  }
  System . out . println ( ) ;
  return num ;
}
