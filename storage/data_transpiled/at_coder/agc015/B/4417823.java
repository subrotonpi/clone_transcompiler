public static void print ( String s ) {
  s = input ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'U' ) {
      ans += s . length ( ) - 1 - i ;
      ans += 2 * i ;
    }
    else {
      ans += i ;
      ans += 2 * ( s . length ( ) - 1 - i ) ;
    }
  }
  System . out . println ( ans ) ;
}
