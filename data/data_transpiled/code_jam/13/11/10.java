public static int comp ( int x , int r ) {
  return 2 * x * x + ( 3 + 2 * r ) * x + 2 * r + 1 ;
  /* solve the number of digits */
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = 0 ;
  int r = T + 1 ;
  while ( l + 1 < r ) {
    int m = ( l + r ) / 2 ;
    if ( comp ( m - 1 , R ) <= T ) {
      l = m ;
    }
    else {
      r = m ;
    }
  }
  return l ;
}
