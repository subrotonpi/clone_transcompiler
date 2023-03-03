public static void seatPressure ( int N , @ Nonnull int [ ] A ) {
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    map . put ( A [ i ] , i ) ;
  }
  for ( int a : A ) {
    System . out . println ( map . get ( a ) ) ;
  }
  if ( getClass ( ) . isClassPresent ( "java.util.concurrent.Scanner" ) ) {
    N = Integer . parseInt ( input ( ) ) ;
    A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input ( ) ) ;
    }
  }
  seatPressure ( N , A ) ;
}
