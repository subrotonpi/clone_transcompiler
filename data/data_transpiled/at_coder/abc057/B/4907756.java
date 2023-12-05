public static int [ ] [ ] getStdIn ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = 0 ;
    b [ i ] = 0 ;
  }
  int [ ] c = new int [ M ] ;
  int [ ] d = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    c [ i ] = 0 ;
    d [ i ] = 0 ;
  }
  int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      if ( Math . abs ( a [ i ] - c [ j ] ) + Math . abs ( b [ i ] - d [ j ] ) < Math . abs ( a [ i ] - c [ ans [ i ] - 1 ] ) + Math . abs ( b [ i ] - d [ ans [ i ] - 1 ] ) ) {
        ans [ i ] = j + 1 ;
      }
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
