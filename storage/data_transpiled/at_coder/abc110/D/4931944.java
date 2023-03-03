static final long MOD = 1000000007 ;
{
  int N ;
  int M ;
  {
    if ( n == 1 ) {
      return new long [ ] {
      }
      ;
    }
    List < Integer > factors = null ;
    for ( int i = 2 ;
    i <= Math . ceil ( Math . sqrt ( n ) ) ;
    i ++ ) {
      if ( n % i == 0 ) {
        factors = new ArrayList < > ( ) ;
        factors . add ( i ) ;
        factors . add ( factorization ( n / i ) ) ;
        break ;
      }
    }
    if ( factors == null ) {
      return new long [ ] {
        n }
        ;
      }
      else {
        return factors . size ( ) ;
      }
    }
    {
      int i ;
      int j ;
      int mul ;
      {
        if ( j > i - j ) {
          return comb ( i , i - j ) ;
        }
        mul = 1 ;
        for ( k = i - j + 1 ;
        k <= i ;
        k ++ ) {
          mul *= k ;
        }
        for ( k = 2 ;
        k <= j ;
        k ++ ) {
          mul /= k ;
        }
        return mul ;
      }
    }
    {
      int N ;
      int M ;
      int [ ] factor = factorization ( M ) ;
      HashMap < Integer , Integer > factorMap = new HashMap < > ( ) ;
      for ( int f = 0 ;
      f < factor . length ;
      f ++ ) {
        if ( ! factorMap . containsKey ( factor [ f ] ) ) {
          factorMap . put ( factor [ f ] , 0 ) ;
        }
        factorMap . put ( factor [ f ] , ++ M ) ;
      }
      mul = 1 ;
      for ( int k = 0 ;
      k < factorMap . size ( ) ;
      k ++ ) {
        mul = ( mul * comb ( factorMap . get ( k ) + N - 1 , factorMap . get ( k ) ) ) % MOD ;
      }
      System . out . println ( mul ) ;
      return M ;
    }
    public static void main ( String [ ] args ) {
      {
        StringTokenizer tokenizer = new StringTokenizer ( args [ 0 ] ) ;
        while ( tokenizer . hasMoreTokens ( ) ) {
          String line = tokenizer . nextToken ( ) ;
          for ( String word : line . split ( " " ) ) {
            tokenizer . nextToken ( ) ;
          }
        }
      }
    }
    