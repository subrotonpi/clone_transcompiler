public static void print ( int n ) {
  char [ ] a = Character . parseChars ( input ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == a [ i - 1 ] ) {
      ans ++ ;
      a [ i ] = 'x' ;
    }
  }
  System . out . println ( ans ) ;
}
