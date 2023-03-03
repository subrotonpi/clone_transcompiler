public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i + 1 ] += A [ i ] ;
  }
  for ( int a : A ) {
    if ( mp . contains ( a ) ) mp [ a ] ++ ;
    else mp [ a ] = 1 ;
  }
  int res = 0 ;
  for ( int v : mp . values ( ) ) res += v * ( v - 1 ) / 2 ;
  System . out . println ( res ) ;
  return A ;
}
