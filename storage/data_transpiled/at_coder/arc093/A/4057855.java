public static int [ ] getSums ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  a [ n ] = 0 ;
  int sums = Math . abs ( a [ 0 ] ) ;
  int [ ] flags = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) flags [ i ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    sums += Math . abs ( a [ i ] - a [ i - 1 ] ) ;
  }
  a [ n ] = 0 ;
  for ( int i = 1 ;
  i <= a . length - 1 ;
  i ++ ) System . out . println ( sums + Math . abs ( a [ i + 1 ] - a [ i - 1 ] ) - ( Math . abs ( a [ i + 1 ] - a [ i ] ) + Math . abs ( a [ i ] - a [ i - 1 ] ) ) ) ;
  return flags ;
}
