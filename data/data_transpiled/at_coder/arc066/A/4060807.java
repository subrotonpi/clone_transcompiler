public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) ) ;
  }
  if ( n % 2 == 0 && Integer . parseInt ( a . get ( 0 ) ) == n * n / 2 || n % 2 == 1 && Integer . parseInt ( a . get ( 1 ) ) == ( n + 1 ) * ( n / 2 ) ) {
    System . out . println ( 2 * ( n / 2 ) % ( 10 * 9 + 7 ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
}
