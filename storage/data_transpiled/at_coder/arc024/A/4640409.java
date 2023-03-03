public static void print ( int l , int r ) {
  List < Integer > L = new ArrayList < Integer > ( ) ;
  List < Integer > R = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) L . add ( i ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) R . add ( i ) ;
  int ans = 0 ;
  if ( Math . min ( r , l ) == r ) {
    for ( int i = 0 ;
    i < r ;
    i ++ ) if ( R . contains ( L . get ( i ) ) ) {
      L . remove ( L . indexOf ( R . get ( i ) ) ) ;
      ans ++ ;
    }
  }
  else {
    for ( int i = 0 ;
    i < l ;
    i ++ ) if ( R . contains ( L . get ( i ) ) ) R . remove ( R . get ( i ) ) ;
    ans ++ ;
  }
}
