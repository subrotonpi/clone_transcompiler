public static void input ( ) {
  int left = 0 ;
  int right = 0 ;
  boolean flag = true ;
  for ( int i = 0 ;
  i != s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'A' && flag ) {
      left = i ;
      flag = false ;
    }
    if ( s . charAt ( i ) == 'Z' ) {
      right = i ;
    }
  }
  System . out . println ( right - left + 1 ) ;
}
