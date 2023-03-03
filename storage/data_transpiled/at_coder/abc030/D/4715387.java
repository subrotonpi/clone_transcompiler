public static void print ( int n , String a ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > b = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b . add ( i ) ;
  }
  List < Integer > history = new ArrayList < > ( ) ;
  while ( ! a . equals ( b . get ( a ) ) ) {
    history . add ( a ) ;
    a = b . get ( a - 1 ) ;
  }
  int p = history . indexOf ( a ) ;
  if ( k < p ) {
    print ( history . get ( k ) ) ;
  }
  else {
    int q = history . size ( ) - p ;
    print ( history . get ( ( k - p ) % q + p ) ) ;
  }
}
