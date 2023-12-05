public static int check ( int n , int [ ] a ) {
  int cnt = 0 ;
  int [ ] b = new int [ 1010 ] ;
  int [ ] f = new int [ 1010 ] ;
  int [ ] len = new int [ 1010 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int j = 0 ;
    for ( int k = 1 ;
    k <= cnt ;
    k ++ ) {
      if ( ( b [ k ] + 1 == a [ i ] ) && ( j == 0 || len [ k ] < len [ j ] ) ) {
        j = k ;
      }
    }
    if ( j == 0 ) {
      cnt ++ ;
      j = cnt ;
    }
    b [ j ] = a [ i ] ;
    len [ j ] ++ ;
  }
  int ans = 100000000 ;
  for ( int i = 1 ;
  i <= cnt ;
  i ++ ) {
    ans = Math . min ( ans , len [ i ] ) ;
  }
  return ans ;
  for ( int c = 0 ;
  c < input . nextInt ( ) ;
  c ++ ) {
    a = ArrayUtil . parseInt ( input . nextLine ( ) , input . substring ( 0 , c ) ) ;
    n = a [ 0 ] ;
    a = a . clone ( ) ;
    b = new int [ n ] ;
    Arrays . sort ( a ) ;
    b . addAll ( a ) ;
    ans = check ( n , b ) ;
    if ( ans == 100000000 ) ans = 0 ;
    System . out . println ( "Case #" + ( c + 1 ) + ": " + ans ) ;
  }
  return ans ;
}
