public static void input ( ) {
  String s = input ( ) ;
  int n = s . length ( ) ;
  int d = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == 'U' ) {
      d += n + i - 1 ;
    }
    else {
      d += n * 2 - i - 2 ;
    }
  }
  System . out . println ( d ) ;
}
