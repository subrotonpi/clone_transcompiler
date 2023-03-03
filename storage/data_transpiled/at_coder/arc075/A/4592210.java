public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int b = 200 ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    s += a ;
    if ( a % 10 != 0 ) {
      b = Math . min ( b , a ) ;
    }
  }
  if ( s % 10 != 0 ) {
    System . out . println ( s ) ;
  }
  else if ( b < 200 ) {
    System . out . println ( s - b ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
}
