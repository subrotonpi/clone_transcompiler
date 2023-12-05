public static final int [ ] getDigits ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int K = Integer . parseInt ( input ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  if ( Integer . parseInt ( A [ 0 ] ) == K ) {
    System . out . println ( 1 ) ;
    exit ( 0 ) ;
  }
  final int big = K + 1 ;
  final int [ ] dp = new int [ N + 1 ] ;
  dp [ 0 ] = big ;
  dp [ 1 ] = 1 ;
  int asum = A [ 0 ] ;
  for ( int i = 2 ;
  i <= 1 + N ;
  i ++ ) {
    final int a = A [ i - 1 ] ;
    final int [ ] dpc = dp . clone ( ) ;
    for ( int j = 1 ;
    j <= 1 + i ;
    j ++ ) {
      final int k = a * dpc [ j - 1 ] / asum + 1 ;
      if ( k <= a ) dp [ j ] = Math . min ( dpc [ j - 1 ] + k , dp [ j ] ) ;
    }
    asum += a ;
  }
  if ( Integer . parseInt ( A [ 0 ] ) != K ) {
    int ans = 0 ;
    for ( int x : dp ) {
      if ( x <= K ) ans ++ ;
    }
    System . out . println ( ans - 1 ) ;
  }
  return dp ;
}
