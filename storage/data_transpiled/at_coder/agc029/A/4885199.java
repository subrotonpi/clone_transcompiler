public static void input ( String txt ) {
  char [ ] txtArray = txt . toCharArray ( ) ;
  int count = 0 ;
  int n_b = 0 ;
  int n_w = 0 ;
  int i ;
  for ( i = 0 ;
  i < txtArray . length ;
  i ++ ) {
    if ( txtArray [ i ] == 'W' ) {
      n_w ++ ;
    }
    if ( ( i >= 1 && txtArray [ i - 1 ] == 'W' && txtArray [ i ] == 'B' ) || ( i == txtArray . length - 1 && txtArray [ i ] == 'W' ) ) {
      count += n_b * n_w ;
      n_w = 0 ;
    }
    if ( txtArray [ i ] == 'B' ) {
      n_b ++ ;
    }
  }
  System . out . println ( count ) ;
}
