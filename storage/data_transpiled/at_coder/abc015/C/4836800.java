public static boolean func ( int N , int K ) {
  int [ ] [ ] T = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      T [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  return true ;
}
