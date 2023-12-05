public static int [ ] readInput ( ) {
  s = input ( ) ;
  n = Integer . parseInt ( input ( ) ) ;
  int [ ] dic = new int [ 5 ] ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 5 ;
    j ++ ) {
      dic [ i ] = s . charAt ( i ) + s . charAt ( j ) ;
    }
  }
  System . out . println ( dic [ n - 1 ] ) ;
  return dic ;
}
