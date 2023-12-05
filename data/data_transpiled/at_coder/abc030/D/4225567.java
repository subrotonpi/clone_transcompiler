static final int binarySearch ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int a = Integer . parseInt ( input ) ;
  final int k = Integer . parseInt ( input ) ;
  final int [ ] bl = new int [ N + 1 ] ;
  Arrays . fill ( bl , 0 ) ;
  final int [ ] dp = new int [ N + 1 ] ;
  Arrays . fill ( dp , 0 ) ;
  dp [ N ] = bl [ a - 1 ] ;
  int ans = - 1 ;
  if ( k == 1 ) {
    ans = 1 ;
  }
  else {
    for ( int i = 2 ;
    i <= N ;
    i ++ ) {
      final int tmp = bl [ dp [ dp . length - 1 ] - 1 ] ;
      if ( dp [ tmp ] != null ) {
        dp [ i ] = tmp ;
        int f = dp [ dp . length - 1 ] ;
        ans = f + ( k - i ) % ( i - f ) ;
        break ;
      }
      else {
        dp [ i ] = tmp ;
      }
    }
  }
  System . out . println ( dp [ ans ] ) ;
}
