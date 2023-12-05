public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int flag = 0 ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    int total = t [ i ] + t [ i + 1 ] + t [ i + 2 ] ;
    if ( total < K ) {
      System . out . println ( i + 3 ) ;
      flag = 1 ;
      break ;
    }
  }
  if ( flag == 0 ) {
    System . out . println ( - 1 ) ;
  }
  return flag ;
}
