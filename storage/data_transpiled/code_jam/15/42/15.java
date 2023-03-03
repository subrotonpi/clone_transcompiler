public static boolean possible ( double v , double x , List < Pair < Integer , Integer >> rx , int t ) {
  double [ ] maxVol = new double [ rx . size ( ) ] ;
  for ( int ri = 0 ;
  ri < maxVol . length ;
  ri ++ ) {
    final double v = rx . get ( ri ) . value ;
    maxVol [ ri ] = v * t ;
  }
  if ( Double . compare ( maxVol [ 0 ] , v - 1e-12 ) < 0 ) return false ;
  double minT = 0 ;
  double filled = 0 ;
  Iterator < Pair < Integer , Integer >> it = rx . iterator ( ) ;
  for ( int ri = 0 ;
  ri < maxVol . length ;
  ri ++ ) {
    final double xi = maxVol [ ri ] ;
    final double mv = maxVol [ ri ] ;
    final double takenVol = Math . min ( mv , v - filled ) ;
    filled += takenVol ;
    minT += ( takenVol * xi ) / v ;
  }
  if ( minT > x + 1e-12 ) return false ;
  double maxT = 0 ;
  filled = 0 ;
  it = rx . iterator ( ) ;
  for ( int ri = 0 ;
  ri < maxVol . length ;
  ri ++ ) {
    final double xi = maxVol [ ri ] ;
    final double mv = maxVol [ ri ] ;
    final double takenVol = Math . min ( mv , v - filled ) ;
    filled += takenVol ;
    maxT += ( takenVol * xi ) / v ;
  }
  return ! maxT < x - 1e-12 ;
}
