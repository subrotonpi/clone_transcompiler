public static int N = Integer . parseInt ( input ) {
  int d ;
  int dmin ;
  int dmax ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( i == 0 ) ) dmin = d ;
    else dmax = d ;
  }
  return dmax ;
}
