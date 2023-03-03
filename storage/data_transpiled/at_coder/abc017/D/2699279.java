public static int [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) , M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] f = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) f [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] shakutori = new int [ N ] ;
  int left = N - 1 ;
  Set < Integer > supplements = new HashSet < Integer > ( ) ;
  for ( int right = N ;
  right > 0 ;
  right -- ) {
    supplements . add ( f [ right ] ) ;
    while ( left > 0 && ! ( supplements . contains ( f [ left - 1 ] ) ) ) {
      supplements . add ( f [ left - 1 ] ) ;
      left += - 1 ;
    }
    shakutori [ right ] = left ;
    supplements . remove ( f [ right ] ) ;
    if ( right == left ) left += - 1 ;
  }
  long [ ] dp = new long [ N + 1 ] ;
  long [ ] accum = new long [ N + 1 ] ;
  dp [ N ] = 1 ;
  accum [ N + 1 ] = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    accum [ i ] = ( accum [ i - 1 ] + dp [ i - 1 ] ) % 1000000007 ;
    dp [ i ] = ( accum [ i ] - accum [ shakutori [ i - 1 ] ] ) % 1000000007 ;
  }
  System . out . println ( dp [ N ] ) ;
  return dp ;
}
