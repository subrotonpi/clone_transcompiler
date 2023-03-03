public static final int [ ] getSortingPairs ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = i ;
  int [ ] selectLeft = new int [ n + 1 ] , selectRight = new int [ n + 1 ] ;
  int [ ] leftScore = new int [ n + 1 ] , rightScore = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) heapSort ( selectLeft , a [ i ] ) ;
  leftScore [ 0 ] = Integer . MAX_VALUE ;
  for ( int i = n + 1 ;
  i <= 2 * n ;
  i ++ ) {
    heapSort ( selectLeft , a [ i ] ) ;
    int tmpScore = leftScore [ leftScore . length - 1 ] + a [ i ] ;
    int poped = heapSort ( selectRight , a [ i ] ) ;
    tmpScore -= poped ;
    rightScore [ i ] = tmpScore ;
  }
  Collections . reverse ( rightScore ) ;
  System . out . println ( Collections . max ( leftScore , rightScore ) ) ;
  return leftScore ;
}
