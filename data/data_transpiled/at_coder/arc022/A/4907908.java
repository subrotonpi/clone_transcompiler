public static void main ( String [ ] args ) {
  String s = input ( ) ;
  int state = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char c = s . charAt ( i ) ;
    if ( c == 'i' && state == 0 ) {
      state = 1 ;
    }
    else if ( c == 'c' && state == 1 ) {
      state = 2 ;
    }
    else if ( c == 't' && state == 2 ) {
      state = 3 ;
    }
  }
  if ( state == 3 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
