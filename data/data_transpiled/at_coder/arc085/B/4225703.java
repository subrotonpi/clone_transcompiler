public static int n ( int z , int w ) {
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( n == 1 ) {
    System . out . println ( Math . abs ( A [ 0 ] - w ) ) ;
  }
  else {
    System . out . println ( Math . max ( Math . abs ( A [ n - 1 ] - w ) , Math . abs ( A [ n - 2 ] - A [ n - 1 ] ) ) ) ;
  }
  return z ;
}
