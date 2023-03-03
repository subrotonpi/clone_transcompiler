@ Sys public static void main ( String [ ] args ) {
  for ( int cn : xrange ( 1 , 1 + Integer . parseInt ( stdin . readLine ( ) ) ) ) {
    final int D = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int N = Integer . parseInt ( stdin . readLine ( ) ) ;
    double slowest = 0 ;
    for ( int h : xrange ( N ) ) {
      final int K = Integer . parseInt ( stdin . readLine ( ) ) ;
      final int S = Integer . parseInt ( stdin . readLine ( ) ) ;
      final double time = ( double ) ( D - K ) / S ;
      slowest = Math . max ( slowest , time ) ;
    }
    final double speed = D / slowest ;
    System . out . println ( "Case #" + cn + ": " + speed ) ;
  }
}
