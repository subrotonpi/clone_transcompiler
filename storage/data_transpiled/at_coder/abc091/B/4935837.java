public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = input . nextLine ( ) ;
  m = Integer . parseInt ( input . nextLine ( ) ) ;
  t = new String [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) t [ i ] = input . nextLine ( ) ;
  c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a = 0 ;
    b = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) if ( s [ i ] == s [ j ] ) a ++ ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) if ( t [ j ] == t [ j ] ) b ++ ;
  }
  System . out . println ( c ) ;
}
