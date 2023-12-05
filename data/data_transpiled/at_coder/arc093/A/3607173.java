public static int [ ] getSublist ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int [ ] a = new int [ N + 1 ] ;
  int [ ] b = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = b [ i ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = b [ i ] ;
  }
  a [ N ] = 0 ;
  int su = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    su += Math . abs ( a [ i + 1 ] - a [ i ] ) ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . println ( su - ( Math . abs ( a [ i + 1 ] - a [ i ] ) ) - Math . abs ( a [ i ] - a [ i - 1 ] ) + Math . abs ( a [ i + 1 ] - a [ i - 1 ] ) ) ;
  }
  return a ;
}
