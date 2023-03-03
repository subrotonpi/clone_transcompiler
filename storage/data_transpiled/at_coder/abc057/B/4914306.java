public static int [ ] [ ] getM ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] , b = new int [ N ] , c = new int [ M ] , d = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = x ;
    b [ i ] = y ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    c [ i ] = x ;
    d [ i ] = y ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ans = 0 ;
    int tmp = 10 * 10 ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      if ( Math . abs ( a [ i ] - c [ j ] ) + Math . abs ( b [ i ] - d [ j ] ) < tmp ) {
        tmp = Math . abs ( a [ i ] - c [ j ] ) + Math . abs ( b [ i ] - d [ j ] ) ;
        ans = j + 1 ;
      }
    }
    System . out . println ( ans ) ;
  }
  return a ;
}
