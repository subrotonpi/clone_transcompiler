public static void input ( ) {
  String s = input . toLowerCase ( ) ;
  int b = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'i' && b == 0 ) {
      b = 1 ;
    }
    if ( s . charAt ( i ) == 'c' && b == 1 ) {
      b = 2 ;
    }
    if ( s . charAt ( i ) == 't' && b == 2 ) {
      b = 3 ;
    }
  }
  if ( b == 3 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
