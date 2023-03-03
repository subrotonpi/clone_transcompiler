public static int [ ] find ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( a ) ;
  int [ ] s = new int [ n ] ;
  s [ 0 ] = a [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) s [ i ] = s [ i - 1 ] + a [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] *= 2 ;
  /* find the first occurrence */
  int u = a . length ;
  int l = - 1 ;
  while ( u > l + 1 ) {
    int md = ( u + l ) / 2 ;
    if ( a [ md ] >= a [ u ] ) l = md ;
    else u = md ;
  }
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ans [ i ] = 0 ;
  for ( int x : ans ) {
    if ( x == a . length - 1 ) count ++ ;
  }
  System . out . println ( count ) ;
  return ans ;
}
