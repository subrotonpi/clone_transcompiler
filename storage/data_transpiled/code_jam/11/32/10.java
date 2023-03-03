@ GwtIncompatible ( "java.util.concurrent.atomic.Scanner" ) public static double doCase ( int l , int t , int n , int c , int [ ] _as ) throws IOException {
  List < int [ ] > distances = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    distances . add ( Arrays . copyOf ( _as , i ) ) ;
  }
  double total = distances . size ( ) ;
  if ( total * 2 <= t || l == 0 ) {
    return total * 2 ;
  }
  double traveled = t * .5 ;
  double left = 0 ;
  int index = 0 ;
  for ( int i = 0 ;
  i < distances . size ( ) ;
  ++ i ) {
    double dist = distances . get ( i ) [ left ] ;
    if ( traveled >= dist ) {
      traveled -= dist ;
    }
    else {
      index = i + 1 ;
      left = dist - traveled ;
      break ;
    }
  }
  int [ ] remaining = new int [ distances . size ( ) ] ;
  Arrays . fill ( remaining , left ) ;
  return t + Arrays . stream ( remaining ) . mapToDouble ( i -> i * 2 ) . sum ( ) * 2 - Arrays . stream ( Arrays . copyOf ( remaining , i ) ) . mapToDouble ( i -> i * 2 ) . sum ( ) ;
}
