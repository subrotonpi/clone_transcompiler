public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dis = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < dis . length ;
  i ++ ) dis [ i ] = 0 ;
  dis [ 0 ] = D ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) dis [ i + 1 ] = Math . min ( dis [ i ] , Math . abs ( dis [ i ] - d [ i ] ) ) ;
  int [ ] dp = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) dp [ i ] = 0 ;
  dp [ N ] = 1 ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    if ( d [ i ] / 2 >= dp [ i + 1 ] ) dp [ i ] = dp [ i + 1 ] ;
    else dp [ i ] = dp [ i + 1 ] + d [ i ] ;
  }
  for ( int qi = 0 ;
  qi < Q ;
  qi ++ ) System . out . println ( Arrays . toString ( dis [ q [ qi ] ] ) ) ;
  return dis ;
}
