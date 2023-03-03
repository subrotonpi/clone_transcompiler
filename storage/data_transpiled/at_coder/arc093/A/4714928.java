public static int [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] dist = new int [ N ] ;
  int tmp = 0 ;
  int alldist = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    dist [ i ] = A [ i ] - tmp ;
    tmp = A [ i ] ;
  }
  for ( int i = 0 ;
  i < dist . length ;
  i ++ ) {
    alldist += Math . abs ( dist [ i ] ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( alldist - ( Math . abs ( dist [ i ] ) + Math . abs ( dist [ i + 1 ] ) - Math . abs ( dist [ i ] + dist [ i + 1 ] ) ) ) ;
  }
  return dist ;
}
