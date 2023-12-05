public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    if ( Arrays . binarySearch ( t , i , i + 3 ) < K ) {
      System . out . println ( i + 3 ) ;
      break ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return N ;
}
