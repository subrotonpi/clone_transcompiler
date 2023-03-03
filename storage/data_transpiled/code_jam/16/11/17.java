public static int Q = Integer . parseInt ( input ) {
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    String s = input . next ( ) ;
    String ns = s . substring ( 0 , 1 ) ;
    for ( int i = 1 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( s . charAt ( i ) >= ns . charAt ( 0 ) ) ns = s . charAt ( i ) + ns ;
      else ns = ns + s . charAt ( i ) ;
    }
    System . out . println ( "Case #" + ( q + 1 ) + ": " + ns ) ;
  }
  return Q ;
}
