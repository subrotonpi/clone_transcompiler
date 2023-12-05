public static int [ ] getLevels ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ n ] ;
  int [ ] R = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) L [ i ] = 1 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) R [ i ] = R [ i + 1 ] + 1 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ans = Math . max ( ans , L [ i ] + R [ i ] ) ;
  System . out . println ( ans - 1 ) ;
  return L ;
}
