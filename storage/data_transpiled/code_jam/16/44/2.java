static private boolean check ( List < List < String >> d , List < Integer > order , List < String > soFar ) {
  final int n = d . size ( ) ;
  if ( order . size ( ) == 0 ) {
    return true ;
  }
  if ( Arrays . equals ( d . get ( order . get ( 0 ) ) . get ( ) , "0" ) || soFar . contains ( j ) ) {
    return false ;
  }
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( d . get ( order . get ( 0 ) ) . get ( j ) . equals ( "1" ) && ! soFar . contains ( j ) ) {
      if ( ! check ( d , order . subList ( 1 , order . size ( ) ) , soFar . toArray ( new String [ soFar . size ( ) ] ) ) ) {
        return false ;
      }
    }
  }
  return true ;
}
