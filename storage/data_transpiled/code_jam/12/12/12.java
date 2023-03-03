static String compute ( int N , int [ ] [ ] x ) {
  final int [ ] state = new int [ x . length ] ;
  int stars = 0 ;
  int steps = 0 ;
  boolean modified = true ;
  while ( modified ) {
    modified = false ;
    for ( int i : xrange ( x . length ) ) {
      if ( state [ i ] == 2 ) continue ;
      if ( x [ i ] [ 1 ] <= stars ) {
        steps ++ ;
        stars += 2 - state [ i ] ;
        state [ i ] = 2 ;
        modified = true ;
      }
    }
    if ( modified ) continue ;
    int tmax = - 1 ;
    Integer ti = null ;
    for ( int i : xrange ( x . length ) ) {
      if ( state [ i ] != 0 ) continue ;
      if ( x [ i ] [ 0 ] <= stars && x [ i ] [ 1 ] > tmax ) {
        tmax = x [ i ] [ 1 ] ;
        ti = i ;
      }
    }
    if ( ti != null ) {
      state [ ti ] = 1 ;
      stars ++ ;
      steps ++ ;
      modified = true ;
    }
  }
  if ( stars == 2 * x . length ) return "" + steps ;
  else return "Too Bad" ;
}
