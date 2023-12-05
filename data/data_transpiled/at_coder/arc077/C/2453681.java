public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] a = list ( Integer . parseInt ( input ) ) ;
  int [ ] bitween = new int [ 2 * m + 10 ] ;
  int [ ] [ ] edge = new int [ m + 1 ] [ n ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int l = a [ i ] , r = a [ i + 1 ] ;
    if ( l >= r ) r += m ;
    bitween [ l + 2 ] ++ ;
    bitween [ r + 1 ] -- ;
    edge [ a [ i + 1 ] ] [ i ] = i ;
  }
  for ( int i = 0 ;
  i < 2 * m + 1 ;
  i ++ ) bitween [ i + 1 ] += bitween [ i ] ;
  ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) ans += Math . min ( ( a [ i + 1 ] - a [ i ] + m ) % m , ( a [ i + 1 ] - 1 + m ) % m + 1 ) ;
  int prv = ans ;
  for ( int i = 2 ;
  i <= m ;
  i ++ ) {
    int crt = prv - bitween [ i ] - bitween [ i + m ] ;
    for ( int j = 0 ;
    j < edge [ i - 1 ] ;
    j ++ ) {
      crt -= Math . min ( ( a [ j + 1 ] - a [ j ] + m ) % m , ( a [ j + 1 ] - ( i - 1 ) + m ) % m + 1 ) ;
      crt += Math . min ( ( a [ j + 1 ] - a [ j ] + m ) % m , ( a [ j + 1 ] - i + m ) % m + 1 ) ;
    }
    ans = Math . min ( ans , crt ) ;
    prv = crt ;
  }
  System . out . println ( ans ) ;
}
