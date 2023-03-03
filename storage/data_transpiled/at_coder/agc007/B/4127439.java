public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] p = new int [ n ] ;
  for ( int m = 0 ;
  m < n ;
  m ++ ) p [ m ] = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n + 1 ] ;
  int [ ] b = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) a [ i * n + ( i - 1 ) ] = i * n + ( i - 1 ) ;
  for ( int i = n ;
  i > 0 ;
  i -- ) b [ i * n + ( i - 1 ) ] = i * n + ( i - 1 ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ p [ i ] - 1 ] += i + 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) System . out . print ( a [ i ] + "" ) ;
  System . out . println ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) System . out . print ( b [ i ] + "" ) ;
}
