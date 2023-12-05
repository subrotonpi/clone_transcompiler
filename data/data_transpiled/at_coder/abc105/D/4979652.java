@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  int M = Integer . parseInt ( input ( args [ 1 ] ) ) ;
  int [ ] A = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] sums = new int [ N + 1 ] ;
  Arrays . fill ( sums , 0 ) ;
  int ans = 0 ;
  Map < Integer , Integer > mod = new HashMap < > ( ) ;
  mod . put ( 0 , 1 ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    sums [ i ] = ( sums [ i - 1 ] + A [ i - 1 ] ) % M ;
    ans += mod . get ( sums [ i ] ) ;
    mod . put ( sums [ i ] , 1 ) ;
  }
  System . out . println ( ans ) ;
}
