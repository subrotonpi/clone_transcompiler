public static void print ( int n ) {
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  System . out . println ( Arrays . toString ( d ) ) ;
  int dMax = max ( d ) ;
  int others = Arrays . binarySearch ( d , dMax ) ;
  if ( dMax <= others ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( dMax - others ) ;
  }
}
