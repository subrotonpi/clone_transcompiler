public static void main ( String input ) {
  n = Integer . parseInt ( input ) ;
  a = list ( Integer . parseInt ( input ) ) ;
  b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = b [ b . length - 1 ] + i ;
  b = b [ 1 ] ;
  s = b [ n - 1 ] ;
  mi = Math . abs ( b [ 0 ] - ( b [ n - 1 ] - b [ 0 ] ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    mi = Math . min ( Math . abs ( b [ i ] - ( b [ i ] - b [ i ] ) ) , mi ) ;
  }
  System . out . println ( mi ) ;
}
