public static void seatPressure ( int N , @ Nonnull int [ ] A ) {
  Map < Integer , Integer > m = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m . put ( A [ i ] , i ) ;
  }
  Arrays . sort ( A ) ;
  if ( getClass ( ) . isClassPresent ( "SeatPressure" ) ) {
    N = Integer . parseInt ( input ( ) ) ;
    A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input ( ) ) ;
    }
  }
  List < Integer > ans = seatPressure ( N , A ) ;
  for ( Integer a : ans ) {
    System . out . println ( a ) ;
  }
}
