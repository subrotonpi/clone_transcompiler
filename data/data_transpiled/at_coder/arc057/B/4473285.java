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
  if ( sum ( A ) == K ) {
    System . out . println ( 1 ) ;
    exit ( 0 ) ;
  }
  final int inf = 10 * 18 ;
  final int [ ] dp = new int [ N + 1 ] ;
  dp [ 0 ] = inf ;
  int asum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = A [ i ] ;
    for ( int j = N - 1 ;
    j >= 0 ;
    j -- ) {
      if ( dp [ j ] == inf ) {
        continue ;
      }
      final int k = asum > 0 ? ( a * dp [ j ] / asum + 1 ) : 1 ;
      if ( k <= a ) {
        dp [ j + 1 ] = Math . min ( dp [ j + 1 ] , dp [ j ] + k ) ;
      }
    }
    asum += a ;
  }
  if ( sum ( A ) != K ) {
    System . out . println ( sum ( A ) - 1 ) ;
  }
  return null ;
}
