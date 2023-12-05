@ Produces @ Named ( "fractions" ) public static String isDeg2 ( @ Named ( "n" ) int n ) {
  int k = 0 ;
  while ( n % 2 == 0 ) {
    n /= 2 ;
    k ++ ;
  }
  return n == 1 ;
}
