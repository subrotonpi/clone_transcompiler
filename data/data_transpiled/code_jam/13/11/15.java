public static boolean check ( int R , int t , int n ) {
  int a1 = R * 2 - 1 ;
  int an = a1 + 4 * ( n - 1 ) ;
  return ( a1 + an ) * n <= t * 2 ;
  /* solve */
  R = Integer . parseInt ( input . nextLine ( ) ) ;
  t = Integer . parseInt ( input . nextLine ( ) ) ;
  R ++ ;
  int l = 1 ;
  int r = 10 * 18 ;
  while ( l + 1 < r ) {
    int m = ( l + r ) / 2 ;
    if ( check ( R , t , m ) ) l = m ;
    else r = m ;
  }
  return l == r ;
}
