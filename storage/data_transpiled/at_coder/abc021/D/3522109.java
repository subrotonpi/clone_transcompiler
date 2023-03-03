public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  BigInteger [ ] INV = new BigInteger [ k + 1 ] ;
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    INV [ i ] = BigInteger . valueOf ( i ) . pow ( mod - 2 , mod ) ;
  }
  int N = n - 1 + k ;
  BigInteger [ ] Combi = new BigInteger [ N + 1 ] ;
  Combi [ 0 ] = BigInteger . ONE ;
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    Combi [ i ] = Combi [ i - 1 ] . multiply ( BigInteger . valueOf ( N - i + 1 ) ) . multiply ( INV [ i ] ) . mod ( mod ) ;
  }
  System . out . println ( Combi [ k ] ) ;
}
