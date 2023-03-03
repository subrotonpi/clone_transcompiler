static final int [ ] [ ] resize ( ) {
  final int W = Integer . parseInt ( input . nextLine ( ) ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] widVal = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) widVal [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) widVal [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] dp = new int [ N + 1 ] [ W + 1 ] ;
  for ( int i = 1 , num = 1 ;
  i <= K ;
  i ++ ) {
    final int key = widVal [ i - 1 ] [ 0 ] ;
    dp [ i ] [ 0 ] = dp [ i - 1 ] [ key ] ;
    dp [ i ] [ 1 ] = Math . max ( dp [ i - 1 ] [ key ] , dp [ i - 1 ] [ num ] ) + widVal [ i - 1 ] [ 1 ] ;
  }
  System . out . println ( dp [ N ] [ W ] [ K ] ) ;
}
