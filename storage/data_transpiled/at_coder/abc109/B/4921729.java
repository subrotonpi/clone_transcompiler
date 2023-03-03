public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < W . length ;
  i ++ ) {
    W [ i ] = input . charAt ( i ) ;
  }
  boolean f = true ;
  for ( int i = 0 ;
  i < W . length - 1 ;
  i ++ ) {
    if ( W [ i ] - 1 != W [ i + 1 ] ) {
      f = false ;
      break ;
    }
  }
  if ( f && N == new HashSet < Integer > ( Arrays . asList ( W ) ) . size ( ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
