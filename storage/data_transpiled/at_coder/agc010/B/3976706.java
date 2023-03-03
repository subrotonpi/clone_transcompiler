public static int [ ] getStones ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) A [ a ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int RejectStones = N * ( N + 1 ) / 2 ;
  if ( Arrays . binarySearch ( A , N ) % RejectStones != 0 ) System . out . println ( "NO" ) ;
  else {
    int TotalOperation = Arrays . binarySearch ( A , N ) / RejectStones ;
    int sumcheck = 0 ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      if ( ( TotalOperation - A [ i + 1 ] + A [ i ] ) % N != 0 || TotalOperation < A [ i + 1 ] - A [ i ] ) {
        System . out . println ( "NO" ) ;
        break ;
      }
      else {
        sumcheck += ( TotalOperation - A [ i + 1 ] + A [ i ] ) / N ;
      }
    }
    else {
      if ( ( TotalOperation - A [ 0 ] + A [ N - 1 ] ) % N != 0 || TotalOperation < A [ 0 ] - A [ N - 1 ] ) System . out . println ( "NO" ) ;
      else {
        sumcheck += ( TotalOperation - A [ 0 ] + A [ N - 1 ] ) / N ;
        if ( sumcheck == TotalOperation ) System . out . println ( "YES" ) ;
        else System . out . println ( "NO" ) ;
      }
    }
  }
  return A ;
}
