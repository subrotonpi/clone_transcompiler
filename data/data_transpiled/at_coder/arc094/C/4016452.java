public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = 10 * 10 ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    s += a ;
    if ( a > b ) {
      m = Math . min ( m , b ) ;
    }
  }
  if ( m == 10 * 10 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( s - m ) ;
  }
}
