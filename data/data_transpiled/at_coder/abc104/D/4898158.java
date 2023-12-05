static final String [ ] getStrings ( ) {
  final String S ;
  final double INF = Double . MAX_VALUE ;
  final double MOD = 1000000007 ;
  final HashMap < String , Double > map = new HashMap < String , Double > ( ) ;
  {
    final double thpow = INF ;
    {
      if ( q < 0 ) {
        return 0 ;
      }
      if ( q == 0 ) {
        return 1 ;
      }
      if ( map . containsKey ( q ) ) {
        return map . get ( q ) ;
      }
      else {
        map . put ( q , ( 3 * thpow ( q - 1 ) ) % MOD ) ;
        return map . get ( q ) ;
      }
    }
  }
  ;
  {
    final int [ ] dp = {
      0 , 0 , 0 }
      ;
      int q = 0 ;
      for ( int i = 0 ;
      i < S . length ( ) ;
      i ++ ) {
        final char ch = S . charAt ( i ) ;
        final double a = dp [ 0 ] ;
        final double b = dp [ 1 ] ;
        final double c = dp [ 2 ] ;
        switch ( ch ) {
          case 'A' : dp [ 0 ] = ( a + thpow ( q ) ) % MOD ;
          dp [ 1 ] = b ;
          dp [ 2 ] = c ;
          break ;
          case 'B' : dp [ 0 ] = a ;
          dp [ 1 ] = ( b + a ) % MOD ;
          dp [ 2 ] = c ;
          break ;
          case 'C' : dp [ 0 ] = a ;
          dp [ 1 ] = b ;
          dp [ 2 ] = ( c + b ) % MOD ;
          break ;
          case '?' : dp [ 0 ] = ( ( a * 3 % MOD ) + thpow ( q ) ) % MOD ;
          dp [ 1 ] = ( ( b * 3 ) % MOD + a ) % MOD ;
          dp [ 2 ] = ( ( c * 3 ) + b ) % MOD ;
          q ++ ;
          break ;
        }
      }
      System . out . println ( dp [ 2 ] ) ;
      return dp ;
    }
    public static void main ( String [ ] args ) {
      /* Iterate through the input stream */
      final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
      String line ;
      while ( ( line = br . readLine ( ) ) != null ) {
        for ( String word : line . split ( " " ) ) {
          /* Print out the word */
          System . out . println ( word ) ;
        }
      }
    }
  }
  