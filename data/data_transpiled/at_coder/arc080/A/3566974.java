public static String print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] L = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int p = 0 ;
  int q = 0 ;
  int r = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( L [ i ] % 4 == 0 ) {
      p ++ ;
    }
    else {
      if ( L [ i ] % 2 == 0 ) {
        q ++ ;
      }
      else {
        r ++ ;
      }
    }
  }
  String ans ;
  if ( q == 0 ) {
    if ( p >= r - 1 ) {
      ans = "Yes" ;
    }
    else {
      ans = "No" ;
    }
  }
  else {
    if ( p >= r ) {
      ans = "Yes" ;
    }
    else {
      ans = "No" ;
    }
  }
  return ans ;
}
