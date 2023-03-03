public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  class FactMod {
    int n ;
    int mod ;
    public FactMod ( int n , int mod ) {
      this . mod = mod ;
      this . f = new int [ n + 1 ] ;
      for ( int i = 1 ;
      i <= n ;
      i ++ ) {
        this . f [ i ] = this . f [ i - 1 ] * i % mod ;
      }
      this . inv = new double [ n + 1 ] ;
      for ( int i = 1 ;
      i <= n ;
      i ++ ) {
        this . inv [ i ] = Math . pow ( this . f [ i - 1 ] , mod - 2 , mod ) ;
      }
      this . inv . reverse ( ) ;
    }
  }
  FactMod factMod = new FactMod ( N + K , mod ) ;
  System . out . println ( factMod . comb ( N + K - 1 , K ) ) ;
  return K ;
}
