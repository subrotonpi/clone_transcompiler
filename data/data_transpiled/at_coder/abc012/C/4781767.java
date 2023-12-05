public static int N = Integer . parseInt ( input ) {
  int x = ( 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 ) * 2 - N ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    if ( x % i == 0 && x / i <= 9 ) {
      System . out . println ( i + " x " + x / i ) ;
    }
  }
  return x ;
}
