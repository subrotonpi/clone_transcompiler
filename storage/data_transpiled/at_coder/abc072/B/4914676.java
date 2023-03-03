public static String input ( ) {
  int n = s . length ( ) ;
  String a = "" ;
  if ( n % 2 == 0 ) {
    for ( int i = 0 ;
    i < n ;
    i += 2 ) {
      a += s . charAt ( i ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < n + 1 ;
    i += 2 ) {
      a += s . charAt ( i ) ;
    }
  }
  return a ;
}
