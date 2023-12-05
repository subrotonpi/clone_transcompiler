public static int [ ] getMath ( int n , int c ) {
  int [ ] x = new int [ n ] ;
  int [ ] v = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int xx = Integer . parseInt ( input . nextLine ( ) ) ;
    int vv = Integer . parseInt ( input . nextLine ( ) ) ;
    x [ i ] = xx ;
    v [ i ] = vv ;
  }
  int [ ] a = new int [ n ] ;
  a [ 0 ] = v [ 0 ] - x [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) a [ i ] = a [ n - 1 ] + v [ i ] - x [ i ] + x [ i - 1 ] ;
  int [ ] b = new int [ n ] ;
  b [ 0 ] = v [ n - 1 ] - c + x [ n - 1 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) b [ i ] = b [ n - 1 - i ] - x [ n - i ] + x [ n - 1 - i ] ;
  int [ ] maxa = new int [ n ] ;
  maxa [ 0 ] = a [ 0 ] ;
  int [ ] maxb = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    maxa [ i ] = Math . max ( maxa [ n - 1 - i ] , a [ i ] ) ;
    maxb [ i ] = Math . max ( maxb [ n - 1 - i ] , b [ i ] ) ;
  }
  int ass = 0 ;
  int [ ] res = new int [ n ] ;
  res [ 0 ] = ass ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i != n - 1 ) ass = a [ i ] + Math . max ( 0 , maxb [ n - 2 - i ] - ( c - x [ n - 1 - i ] ) ) ;
    else ass = b [ i ] ;
    res [ i ] = ass ;
  }
  System . out . println ( max ( res ) ) ;
  return res ;
}
