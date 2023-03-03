static final int [ ] [ ] resize ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < String > l = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    if ( ( i == 0 ) || ( s . length ( ) == 0 ) ) {
      l . add ( s ) ;
      continue ;
    }
    if ( ( s . length ( ) == 0 ) || ( s . charAt ( 0 ) != l . get ( i - 1 ) . charAt ( l . size ( ) - 1 ) ) ) {
      System . out . println ( "No" ) ;
      System . exit ( 0 ) ;
    }
    l . add ( s ) ;
  }
  System . out . println ( "Yes" ) ;
  return l . toArray ( new String [ l . size ( ) ] [ ] ) ;
}
