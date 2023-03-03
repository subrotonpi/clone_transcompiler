public static int [ ] getStdOut ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] x = new int [ n + 2 ] ;
  int [ ] v = new int [ n + 2 ] ;
  int [ ] rf = new int [ n + 2 ] ;
  int [ ] rg = new int [ n + 2 ] ;
  int [ ] lf = new int [ n + 2 ] ;
  int [ ] lg = new int [ n + 2 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int X = Integer . parseInt ( input . readLine ( ) ) ;
    int V = Integer . parseInt ( input . readLine ( ) ) ;
    x [ i ] = X ;
    v [ i ] = V ;
  }
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    rf [ i + 1 ] = rf [ i ] + v [ i + 1 ] ;
    rg [ i + 1 ] = Math . max ( rg [ i ] , rf [ i + 1 ] - x [ i + 1 ] ) ;
  }
  for ( int i = n + 1 ;
  i >= 1 ;
  i -- ) {
    lf [ i - 1 ] = lf [ i ] + v [ i - 1 ] ;
    lg [ i - 1 ] = Math . max ( lg [ i ] , lf [ i - 1 ] - ( c - x [ i - 1 ] ) ) ;
  }
  int ans = Math . max ( rg [ n ] , lg [ n ] ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    ans = Math . max ( ans , rg [ i ] + lg [ i + 1 ] - x [ i ] , rg [ i ] + lg [ i + 1 ] - ( c - x [ i + 1 ] ) ) ;
  }
  System . out . println ( ans ) ;
  return x ;
}
