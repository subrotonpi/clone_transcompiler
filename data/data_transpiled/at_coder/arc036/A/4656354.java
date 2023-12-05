public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  boolean flag = false ;
  for ( int i = 2 ;
  i < N ;
  i ++ ) {
    int time = t [ i ] + t [ i - 1 ] ;
    if ( time < K ) {
      flag = true ;
      break ;
    }
  }
  return i + 1 ;
}
