public static int n ( ) {
  int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
  int min = 10 * 10 ;
  int max = - 100 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( ( min >= A [ i ] ) && ( max <= A [ i ] ) ) min = A [ i ] ;
    if ( ( max <= A [ i ] ) && ( max <= A [ i ] ) ) max = A [ i ] ;
  }
  return max - min ;
}
