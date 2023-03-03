@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int [ ] growth ( int n ) {
  int [ ] x ;
  int n = 10 ;
  int [ ] y = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  }
  return y ;
}
