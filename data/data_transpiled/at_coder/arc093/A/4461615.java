public static int [ ] getDistance ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = i ;
  a [ n + 1 ] = 0 ;
  a [ n + 2 ] = 0 ;
  int cost = 0 ;
  int pre = 0 ;
  for ( int i = 0 ;
  i < n + 2 ;
  i ++ ) {
    cost += Math . abs ( a [ i ] - pre ) ;
    pre = a [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( a [ i ] - a [ i + 1 ] ) * ( a [ i + 1 ] - a [ i + 2 ] ) < 0 ) System . out . println ( cost - 2 * ( Math . min ( Math . abs ( a [ i ] - a [ i + 1 ] ) , Math . abs ( a [ i + 1 ] - a [ i + 2 ] ) ) ) ) ;
    else System . out . println ( cost ) ;
  }
  return a ;
}
