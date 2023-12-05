public static void N ( ) {
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    N ( i ) ;
  }
  ArrayList < Integer > RList = new ArrayList < Integer > ( Arrays . asList ( input . length ( ) ) ) ;
  RList . sort ( Collections . reverseOrder ( ) ) ;
  int ans = 0 ;
  for ( int i = RList . size ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    ans = ( RList . get ( i ) + ans ) / 2 ;
  }
  System . out . println ( ans ) ;
}
