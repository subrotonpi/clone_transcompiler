public static int solve ( int N , List < Integer > A ) {
  int count = 0 ;
  while ( A . size ( ) > 0 ) {
    int size = A . size ( ) ;
    if ( size == 1 ) break ;
    int m = Collections . min ( A ) ;
    int i = A . indexOf ( m ) ;
    if ( i < size - i - 1 ) count += i ;
    else count += size - i - 1 ;
    A . remove ( i ) ;
  }
  {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    A = Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  {
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      int [ ] params = parse ( ) ;
      int result = solve ( ( int [ ] ) params ) ;
      System . out . println ( "Case #" + t + ": " + result ) ;
    }
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    return 0 ;
  }
  return count ;
}
