@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int factorial ( int a , int b ) {
  if ( b == 0 ) {
    return 1 ;
  }
  if ( b > a ) {
    return 0 ;
  }
  int c = Math . min ( b , a - b ) ;
  int s = 1 ;
  for ( int i = a ;
  i > a - c ;
  i -- ) {
    s *= i ;
  }
  for ( int i = 2 ;
  i <= c ;
  i ++ ) {
    s /= i ;
  }
  return s ;
}
