public static int N ( int T ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int i = 0 ;
  int j = 1 ;
  int a = 0 ;
  int b = 0 ;
  while ( i <= N - 1 ) {
    if ( j == N ) {
      i = N ;
    }
    else if ( A [ i ] > A [ j ] ) {
      i = j ;
      j ++ ;
    }
    else {
      if ( A [ j ] - A [ i ] > a ) {
        a = A [ j ] - A [ i ] ;
        b = 1 ;
        j ++ ;
      }
      else if ( A [ j ] - A [ i ] == a ) {
        b ++ ;
        j ++ ;
      }
      else if ( A [ j ] - A [ i ] < a ) {
        j ++ ;
      }
    }
  }
  System . out . println ( b ) ;
  return i ;
}
