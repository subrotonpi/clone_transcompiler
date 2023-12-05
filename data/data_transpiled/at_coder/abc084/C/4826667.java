public static final Scanner getScanner ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int [ ] [ ] train = new int [ N - 1 ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    train [ i ] [ 0 ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int ans = 0 ;
    for ( int j = i ;
    j < N - 1 ;
    j ++ ) {
      if ( ans <= train [ j ] [ 1 ] ) {
        ans = train [ j ] [ 1 ] ;
      }
      else if ( ans % train [ j ] [ 2 ] != 0 ) {
        ans += train [ j ] [ 2 ] - ( ans % train [ j ] [ 2 ] ) ;
      }
      ans += train [ j ] [ 0 ] ;
    }
    System . out . println ( ans ) ;
  }
  System . out . println ( 0 ) ;
}
