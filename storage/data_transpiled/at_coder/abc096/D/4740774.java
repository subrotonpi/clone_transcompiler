public static void main ( String input ) {
  final int n = Integer . parseInt ( input ) ;
  final int [ ] sosu = new int [ 2 + 1 ] ;
  for ( int i = 0 ;
  i < sosu . length ;
  i ++ ) {
    if ( sosu [ i ] > Math . sqrt ( sosu . length ) ) break ;
    if ( sosu [ i ] > 0 ) {
      for ( int j = 2 ;
      j < sosu . length / i ;
      j ++ ) {
        sosu [ j * i ] = 0 ;
      }
    }
  }
  final ArrayList < Integer > sosuNum = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < sosu . length ;
  i ++ ) {
    if ( sosu [ i ] > 0 && i % 5 == 1 ) {
      sosuNum . add ( i ) ;
    }
  }
  final int [ ] ans = sosuNum . toArray ( new int [ n ] ) ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    System . out . print ( ans [ i ] + " " ) ;
  }
}
