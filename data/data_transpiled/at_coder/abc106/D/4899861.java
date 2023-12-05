public static int [ ] [ ] [ ] count ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] count = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int l = Integer . parseInt ( input . readLine ( ) ) ;
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    count [ l ] [ r ] ++ ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for ( int j = 1 ;
    j <= N ;
    j ++ ) {
      count [ i ] [ j ] += count [ i ] [ j - 1 ] ;
    }
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for ( int j = 1 ;
    j <= N ;
    j ++ ) {
      count [ i ] [ j ] += count [ i - 1 ] [ j ] ;
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input . readLine ( ) ) ;
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    System . out . println ( count [ r ] [ r ] + count [ l - 1 ] [ l - 1 ] - count [ l - 1 ] [ r ] - count [ r ] [ l - 1 ] ) ;
  }
  return count ;
}
