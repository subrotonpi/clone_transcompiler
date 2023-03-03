public static String N = Integer . parseInt ( input ) {
  int [ ] [ ] tmp = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tmp [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  tmp [ 0 ] [ 0 ] = 0 ;
  tmp [ 1 ] [ 1 ] = 0 ;
  tmp [ 2 ] [ 2 ] = 0 ;
  String ans = "Yes" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = tmp [ i + 1 ] [ 0 ] - tmp [ i ] [ 0 ] ;
    int dx = Math . abs ( tmp [ i + 1 ] [ 1 ] - tmp [ i ] [ 1 ] ) ;
    int dy = Math . abs ( tmp [ i + 1 ] [ 2 ] - tmp [ i ] [ 2 ] ) ;
    int d = dx + dy ;
    if ( t < d || t % 2 != d % 2 ) ans = "No" ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
