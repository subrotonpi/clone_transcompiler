public static void print ( String s ) {
  s = list ( input ( ) ) ;
  long ans = 0 ;
  for ( int i = 0 ;
  i < 1 << s . length ( ) - 1 ;
  i ++ ) {
    ans += eval ( s . charAt ( 0 ) + "" . charAt ( ( i >> j & 1 ) + 1 ) + s . charAt ( i ) ) ;
  }
  System . out . println ( ans ) ;
}
