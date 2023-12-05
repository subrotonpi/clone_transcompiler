public static final int [ ] getFactrical ( int N ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final Function < String , Integer > ns = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return stdin . readLine ( ) ;
    }
  }
  ;
  final Function < Integer , Integer > ni = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return Integer . parseInt ( ns . apply ( input ) ) ;
    }
  }
  ;
  final Function < List < Integer > , Integer > na = new Function < List < Integer > , Integer > ( ) {
    @ Override public Integer apply ( List < Integer > input ) {
      return Collections . singletonList ( input ) ;
    }
  }
  ;
  final int MOD = 10 * 9 + 7 ;
  class Comb implements Comb {
    int [ ] fact = new int [ N + 1 ] ;
    int [ ] invFact = new int [ N + 1 ] ;
    @ Override public int [ ] factrical ( int size ) {
      return fact ;
    }
    @ Override public int nCr ( int n , int r ) {
      int ret = fact [ n ] ;
      ret *= invFact [ n - r ] ;
      ret %= MOD ;
      ret *= invFact [ r ] ;
      ret %= MOD ;
      return ret ;
    }
    @ Override public void factrical ( int N ) {
      fact [ 0 ] = 1 ;
      invFact [ 0 ] = 1 ;
      for ( int i = 1 ;
      i <= N ;
      i ++ ) {
        fact [ i ] = i * fact [ i - 1 ] % MOD ;
        invFact [ i ] = inv ( fact [ i ] ) % MOD ;
      }
    }
    @ Override public int [ ] inv ( int a ) {
      return Math . pow ( a , MOD - 2 , MOD ) ;
    }
  }
  ;
  final int N = ni . apply ( ) ;
  final int [ ] a = na . apply ( a ) ;
  int [ ] c = new int [ N + 1 ] ;
  int [ ] index = {
    - 1 , - 1 }
    ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      if ( ( c [ i - 1 ] != - 1 ) && ( c [ i ] != - 1 ) ) {
        index [ 0 ] = c [ i - 1 ] ;
        index [ 1 ] = i ;
        break ;
      }
      c [ i - 1 ] = i ;
    }
    Comb co =