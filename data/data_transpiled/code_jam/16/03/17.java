static final String print ( ) {
  final int PRIME_LIST [ ] = {
    2 , 3 , 5 }
    ;
    int i ;
    String ans ;
    for ( i = Math . max ( PRIME_LIST . length , 0 ) + 1 ;
    i <= upperBound ;
    i ++ ) {
      if ( findDivisor ( i ) == null ) {
        PRIME_LIST [ i ] = i ;
      }
    }
    if ( getClass ( ) . getName ( ) . equals ( "java.util.Arrays" ) ) {
      String msg = prework ( new int [ ] {
        16 }
        ) ;
        System . err . println ( "prework done with" + msg ) ;
        main ( ) ;
      }
      else {
        if ( i <= PRIME_LIST [ PRIME_LIST . length - 1 ] ) {
          if ( ( PRIME_LIST [ PRIME_LIST . length - 1 ] == 0 ) && ( PRIME_LIST [ PRIME_LIST . length - 1 ] == 0 ) ) {
            return true ;
          }
          return false ;
        }
        d = findDivisor ( i ) ;
        return ( d == null ) ? null : d ;
      }
      private int findDivisor ( int i ) {
        int isqrt = ( int ) ( i * 0.5 ) + 1 ;
        for ( i = 0 ;
        i < PRIME_LIST . length ;
        i ++ ) {
          int p = PRIME_LIST [ i ] ;
          if ( i % p == 0 ) {
            return p ;
          }
          if ( p > isqrt ) {
            break ;
          }
        }
        return 0 ;
      }
      /* prework with argv */
      int N = Integer . parseInt ( input ( ) ) ;
      int J = Integer . parseInt ( input ( ) ) ;
      int LIM = 2 * ( N - 2 ) ;
      String sMode = ( "1%" + ( N - 2 ) ) ;
      printerr ( sMode ) ;
      int nFound = 0 ;
      Map < String , List < Integer >> dAns = Maps . newHashMap ( ) ;
      for ( int n = 0 ;
      n < LIM ;
      n ++ ) {
        String sB = ( sMode . format ( Integer . valueOf ( n ) ) ) . replace ( " " , "0" ) ;
        boolean bSucc = true ;
        List < Integer > l = Lists . newArrayList ( ) ;
        for ( int base = 2 ;
        base < 11 ;
        base ++ ) {
          int m = Integer . parseInt ( sB , base ) ;
          boolean bP = isPrime ( m ) ;
          int divisor = m * 2 ;
          