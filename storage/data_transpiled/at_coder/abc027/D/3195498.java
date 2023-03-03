public static int input ( ) {
  int t = 0 ;
  int [ ] arr = new int [ S . length ( ) ] ;
  for ( int i = S . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    switch ( S . charAt ( i ) ) {
      case '+' : t ++ ;
      break ;
      case '-' : t -- ;
      break ;
      default : arr [ i ] = t ;
    }
  }
  Arrays . sort ( arr ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < arr . length ;
  i ++ ) {
    if ( arr [ i ] == '-' ) {
      ans ++ ;
    }
    else {
      ans ++ ;
    }
  }
  return ans ;
}
