public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = input . nextInt ( ) ;
  int t = input . nextInt ( ) ;
  /* if (b == 0) {
  return a;
  } else {
  return gcd(b, a%b);
  }*/
  int k = gcd ( Math . max ( N , M ) , Math . min ( N , M ) ) ;
  int lcm = N * M / gcd ( Math . max ( N , M ) , Math . min ( N , M ) ) ;
  int n = N / k ;
  int m = M / k ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    if ( ! s [ n * i ] . equals ( t [ m * i ] ) ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  System . out . println ( lcm ) ;
  return lcm ;
}
