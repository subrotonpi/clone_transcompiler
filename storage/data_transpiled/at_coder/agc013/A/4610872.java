public static int N ( ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 1 ;
  int sumDiff = 0 ;
  for ( int i = 1 ;
  i < A . length ;
  i ++ ) {
    int diff = A [ i ] - A [ i - 1 ] ;
    if ( sumDiff * diff < 0 ) {
      ans ++ ;
      sumDiff = 0 ;
    }
    else {
      sumDiff += diff ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
