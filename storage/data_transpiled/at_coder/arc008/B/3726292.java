public static int N = Integer . parseInt ( input ) {
  N = input . nextInt ( ) ;
  M = input . nextInt ( ) ;
  final String name = input . next ( ) ;
  final String kit = input . next ( ) ;
  final List < String > names = Lists . newArrayList ( name ) ;
  final List < String > kits = Lists . newArrayList ( kit ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( name . indexOf ( kit ) >= 0 ) == 0 ) {
      System . out . println ( - 1 ) ;
      quit ( ) ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < names . size ( ) ;
  i ++ ) {
    ans = Math . max ( ans , Math . ceil ( name . indexOf ( names . get ( i ) ) / kit . indexOf ( names . get ( i ) ) ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
