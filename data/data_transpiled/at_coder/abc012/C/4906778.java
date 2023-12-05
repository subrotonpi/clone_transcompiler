public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= 10 ;
    j ++ ) {
      if ( i * j + n == 2025 ) {
        System . out . println ( i + " x " + j ) ;
      }
    }
  }
}
