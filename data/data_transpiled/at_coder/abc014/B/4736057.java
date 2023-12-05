public static void print ( String input ) {
  int n = Integer . parseInt ( input ) , m = Integer . parseInt ( input ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  l . add ( n ) ;
  int sum = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( 2 * ( n - i ) <= m ) {
      m -= 2 * ( n - i ) ;
      sum += l . get ( l . size ( ) - i ) ;
    }
  }
  System . out . println ( sum ) ;
}
