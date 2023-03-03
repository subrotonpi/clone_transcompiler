static final String inputInts ( ) {
  final String input = "Enter a number of integers: " ;
  final int x = Integer . parseInt ( input ) ;
  final int a = x * x ;
  final int b = ( x + 1 ) * x ;
  for ( int i = 0 ;
  i < 1010 ;
  i ++ ) {
    final int d = 10 * ( 2 * i ) ;
    final int c = ( a + d - 1 ) / d ;
    if ( a <= c * ( 10 * ( 2 * i ) ) && c < b ) {
      ans = c ;
    }
  }
  System . out . println ( ans ) ;
  if ( getClass ( ) . isEnum ( ) ) {
    solve ( ) ;
  }
  return input ;
}
