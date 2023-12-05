static private String bruteForce ( int R , int C , String [ ] [ ] grid ) {
  Set < BeamShooter > beamShooters = new HashSet < BeamShooter > ( ) ;
  Set < BeamShooter > unoccupiedSquares = new HashSet < BeamShooter > ( ) ;
  for ( int r : xrange ( R ) ) {
    for ( int c : xrange ( C ) ) {
      if ( grid [ r ] [ c ] . contains ( "|-" ) ) {
        beamShooters . add ( new BeamShooter ( r , c ) ) ;
      }
    }
    if ( possible ) {
      possibleOrientations . put ( new BeamShooter ( r , c ) , possibleOrientations . get ( new BeamShooter ( r , c ) , "" ) . join ( Splitter . on ( "|-" ) . limit ( 2 ) ) ) ;
    }
    if ( possibleOrientations . get ( new BeamShooter ( r , c ) ) . length == 0 ) {
      possibleOrientations . put ( new BeamShooter ( r , c ) , "IMPOSSIBLE" ) ;
    }
  }
  Map < BeamShooter , String > possibleOrientations = new HashMap < BeamShooter , String > ( ) ;
  Set < BeamShooter > occupiedSquares = new HashSet < BeamShooter > ( ) ;
  for ( int i = 0 ;
  i < beamShooters . size ( ) ;
  i ++ ) {
    for ( int square : occupiedSquares . get ( new BeamShooter ( 0 , i ) ) ) {
      possibleOrientations . put ( new BeamShooter ( r , c ) , "" ) ;
    }
    Set < BeamShooter > squares = new HashSet < BeamShooter > ( ) ;
    boolean possible = true ;
    for ( int [ ] velocity : new int [ ] {
      0 , 1 , - 1 }
      ) {
        int beamR = r ;
        int beamC = c ;
        do {
          beamR = beamR + velocity [ 0 ] ;
          beamC = beamC + velocity [ 1 ] ;
        }
        while ( beamR < 0 || beamR >= R || beamC >= C || grid [ beamR ] [ beamC ] . contains ( "#" ) ) ;
      }
      return "\n" . join ( Arrays . asList ( possibleOrientations . get ( new BeamShooter ( r , c ) ,