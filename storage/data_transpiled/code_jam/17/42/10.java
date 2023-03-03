static String optimalResult ( int N , int C , Map < Integer , List < Integer >> positionsByPerson ) {
  int fewestRides = 0 ;
  for ( int position : xrange ( 1 , N + 1 ) ) {
    int totalRides = 0 ;
    for ( int B : positionsByPerson . keySet ( ) ) {
      int rides = 0 ;
      for ( int P : positionsByPerson . get ( B ) ) {
        if ( P <= position ) rides ++ ;
      }
      fewestRides = Math . max ( rides , fewestRides ) ;
      totalRides += rides ;
    }
    fewestRides = Math . max ( fewestRides , ( totalRides + position - 1 ) / position ) ;
  }
  int upgrades = 0 ;
  for ( int position : xrange ( 1 , N + 1 ) ) {
    int frequency = 0 ;
    for ( int B : positionsByPerson . keySet ( ) ) {
      for ( int P : positionsByPerson . get ( B ) ) {
        if ( P == position ) frequency ++ ;
      }
    }
    upgrades += Math . max ( 0 , frequency - fewestRides ) ;
  }
  return Joiner . on ( " " ) . join ( Arrays . asList ( fewestRides , upgrades ) ) ;
}
