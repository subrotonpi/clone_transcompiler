public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  final int n = 10 * 9 ;
  System . setOut ( new PrintStream ( System . out ) ) ;
  class FactMod {
    int i ;
    public FactMod ( int n , int mod ) {
      this . mod = mod ;
      this . f = new int [ n + 1 ] ;
      for ( int i = 1 ;
      i <= n ;
      i ++ ) {
        this . f [ i ] = this . f [ i - 1 ] * i % mod ;
      }
      this . inv = new double [ n ] ;
      for ( int i = 1 ;
      i <= n ;
      i ++ ) {
        this . inv [ i ] = Math . pow ( this . inv [ i - 1 ] * i , mod ) ;
      }
    }
  }
  FactMod ( N + K , mod ) ;
  return n ;
}
