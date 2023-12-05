public static void print ( String s ) {
  s = list ( input ) ;
  int ans = 0 ;
  int b = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'W' ) {
      ans += i - b ;
      b ++ ;
    }
  }
  System . out . println ( ans ) ;
}
