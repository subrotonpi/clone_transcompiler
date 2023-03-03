public static int solve ( ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  int k = Integer . parseInt ( readLine ( ) ) ;
  int [ ] s = new int [ n ] ;
  int [ ] sizes = new int [ k ] ;
  int summin = 0 ;
  for ( int i : xrange ( k ) ) {
    int a = i != k - 1 ? 0 : s [ 0 ] ;
    List < Integer > list = new ArrayList < Integer > ( ) ;
    list . add ( a ) ;
    for ( int j : xrange ( i , n - k , k ) ) {
      a += s [ j + 1 ] - s [ j ] ;
      list . add ( a ) ;
    }
    int m = Collections . min ( list ) ;
    sizes [ i ] = Collections . max ( list ) - m ;
    summin += m ;
  }
  Collections . sort ( sizes ) ;
  int left = summin % k ;
  int res = sizes [ sizes . length - 1 ] ;
  for ( int i : xrange ( k ) ) left -= res - sizes [ i ] ;
  if ( left > 0 ) res ++ ;
  return res ;
}
