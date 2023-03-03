public static int solve ( int n , String [ ] s ) {
  int ans = 0 ;
  int p = n ;
  for ( String si : s ) {
    int j = si . lastIndexOf ( '.' , p ) ;
    if ( j != - 1 ) {
      ans ++ ;
      p = j ;
    }
    else {
      p = n ;
    }
  }
  /* main program */
  n = input . nextInt ( ) ;
  n = Integer . parseInt ( n ) ;
  s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String si = input . next ( ) ;
    s [ i ] = si ;
  }
  System . out . println ( solve ( n , s ) ) ;
}
