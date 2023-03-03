public static double [ ] [ ] getSums ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Double >> scores = new ArrayList < > ( ) ;
  for ( int idx = 0 ;
  idx <= N ;
  ++ idx ) {
    scores . add ( Collections . singletonList ( new Double ( input . nextLine ( ) ) ) ) ;
  }
  List < Double > sums = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < scores . size ( ) ;
  ++ i ) {
    double sum = scores . get ( i ) . doubleValue ( ) + scores . get ( i ) . doubleValue ( ) * 11 / 90.0 ;
    sums . add ( sum ) ;
  }
  System . out . println ( Collections . max ( sums ) ) ;
  return sums . toArray ( ) ;
}
