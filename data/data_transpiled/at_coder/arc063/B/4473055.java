, n = Integer . MAX_VALUE ) public static void input ( ) {
  int [ ] a = input . split ( " " ) ;
  int minv = a [ 0 ] ;
  int [ ] value = new int [ n ] ;
  for ( int i = 1 ;
  i < a . length ;
  i ++ ) {
    if ( minv >= a [ i ] ) {
      value [ i ] = 0 ;
      minv = a [ i ] ;
    }
    else {
      value [ i ] = a [ i ] - minv ;
    }
  }
}
