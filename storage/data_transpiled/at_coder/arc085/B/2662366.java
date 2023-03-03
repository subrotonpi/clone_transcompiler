public static int n = Integer . parseInt ( input ) {
  int z = input . readInt ( ) ;
  int w = input . readInt ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = input . readInt ( ) ;
  }
  if ( n == 1 ) {
    System . out . println ( Math . abs ( w - a [ 0 ] ) ) ;
  }
  else {
    System . out . println ( Math . max ( Math . abs ( w - a [ a . length - 1 ] ) , Math . abs ( a [ a . length - 1 ] - a [ a . length - 2 ] ) ) ) ;
  }
  return z ;
}
