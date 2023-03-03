public static void main ( String [ ] args ) {
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int D = Integer . parseInt ( input ( ) ) ;
    int N = Integer . parseInt ( input ( ) ) ;
    double time = - 1 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int K = Integer . parseInt ( input ( ) ) ;
      int S = Integer . parseInt ( input ( ) ) ;
      time = Math . max ( time , ( D - K ) / S ) ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ( D / time ) ) ;
  }
}
