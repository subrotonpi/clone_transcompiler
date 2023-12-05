public static void print ( int l , int r ) {
  List < Integer > L = new LinkedList < Integer > ( ) ;
  List < Integer > R = new LinkedList < Integer > ( ) ;
  int ans = 0 ;
  if ( Math . min ( r , l ) == r ) {
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      if ( L . contains ( R . get ( i ) ) ) {
        L . remove ( L . indexOf ( R . get ( i ) ) ) ;
        ans ++ ;
      }
    }
  }
  else {
    for ( int i = 0 ;
    i < l ;
    i ++ ) {
      if ( R . contains ( L . get ( i ) ) ) {
        R . remove ( R . indexOf ( L . get ( i ) ) ) ;
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
