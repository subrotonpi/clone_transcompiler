public static int N = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] B = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List < Integer > m = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    if ( B [ i ] [ 1 ] <= T ) {
      m . add ( B [ i ] [ 0 ] ) ;
    }
  }
  if ( m . size ( ) == 0 ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( Collections . min ( m ) ) ;
  }
  return m . size ( ) ;
}
