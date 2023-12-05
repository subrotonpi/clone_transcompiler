public static int n ( ) {
  int max_x = 0 ;
  int x = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 'I' ) {
      x ++ ;
    }
    else {
      x -- ;
    }
    max_x = Math . max ( max_x , x ) ;
  }
  return max_x ;
}
