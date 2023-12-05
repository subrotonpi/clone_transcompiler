public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  int right = 1 ;
  int left = 0 ;
  int ans = 0 ;
  {
    int n = 0 ;
    for ( int i = n ;
    i > 0 ;
    i -- ) {
      a [ left ] += i ;
    }
    return a [ left ] ;
  }
  if ( N == 1 ) {
    System . out . println ( 1 ) ;
  }
  while ( right < N ) {
    n = 0 ;
    while ( a [ right - 1 ] < a [ right ] ) {
      n ++ ;
      right ++ ;
      if ( right >= N ) {
        break ;
      }
    }
    ans += n ;
    right ++ ;
  }
  return ans + N ;
}
