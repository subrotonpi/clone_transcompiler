public static int maxP ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int maxP = 2025 ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= 10 ;
    j ++ ) {
      if ( i * j + n == maxP ) {
        System . out . println ( i + " x " + j ) ;
      }
    }
  }
  return maxP ;
}
