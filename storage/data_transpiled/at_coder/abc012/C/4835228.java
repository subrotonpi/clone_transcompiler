static final int N = Integer . parseInt ( input ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int product = 45 * 45 - N ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= 10 ;
    j ++ ) {
      if ( i * j == product ) {
        System . out . println ( i + " x " + j ) ;
      }
    }
  }
  return N ;
}
