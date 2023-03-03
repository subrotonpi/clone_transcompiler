public static int a = 2025 - Integer . parseInt ( input ) {
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    if ( a % i == 0 && a / i < 10 ) {
      System . out . println ( i + "x" + a / i ) ;
    }
  }
  return a ;
}
