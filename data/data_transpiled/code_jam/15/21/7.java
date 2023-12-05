@ WorkerThread public static int minSteps ( String start , String goal ) {
  if ( start . equals ( goal ) ) return 0 ;
  int best = Integer . parseInt ( goal ) - Integer . parseInt ( start ) ;
  String bmedzi = "" ;
  int C = start . length ( ) ;
  for ( int cif = 0 ;
  cif < C ;
  cif ++ ) {
    String rgoal = goal . substring ( 0 , cif ) ;
    String medzi = start . substring ( 0 , C - cif ) + rgoal . substring ( C - cif ) ;
    if ( medzi . length ( ) > goal . length ( ) ) continue ;
    int toto = Integer . parseInt ( medzi ) - Integer . parseInt ( start ) + 1 ;
    toto += Integer . parseInt ( goal ) - Integer . parseInt ( medzi . substring ( 0 , medzi . length ( ) - 1 ) ) ;
    if ( toto < best ) {
      best = toto ;
      bmedzi = medzi ;
    }
  }
  return best ;
}
