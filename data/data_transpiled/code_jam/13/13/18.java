@ VisibleForTesting static LinkedHashMap < String , Double > solve ( ) {
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  {
    int [ ] bn = new int [ T ] ;
    while ( n > 0 ) {
      if ( n % 2 != 0 ) bn [ n ] = 1 ;
      else bn [ n ] = 0 ;
      n = n / 2 ;
    }
    return bn ;
  }
  private static double [ ] pdProb ( String st ) {
    HashMap < String , Double > pb = new HashMap < > ( ) ;
    int totp = 2 * st . length ( ) ;
    double probone = 1.0 / totp ;
    for ( int i = 0 ;
    i < totp ;
    i ++ ) {
      int [ ] bn = toBin ( i ) ;
      double pd = 1 ;
      for ( int j = 0 ;
      j < bn . length ;
      j ++ ) {
        if ( bn [ j ] == 1 ) pd = pd * st . charAt ( j ) ;
      }
      if ( pb . containsKey ( pd ) ) pb . put ( pd , pb . get ( pd ) + probone ) ;
      else pb . put ( pd , probone ) ;
    }
    return pb ;
  }
  private static double [ ] solve ( String st ) {
    HashMap < String , Double > pb = new HashMap < > ( ) ;
    int R = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int M = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int K = Integer . parseInt ( scanner . nextLine ( ) ) ;
    HashMap < String , int [ ] > psets = new HashMap < > ( ) ;
    HashMap < String , double [ ] > pdp = new HashMap < > ( ) ;
    int nposs = ( M - 1 ) * 3 ;
    for ( int p1 = 2 ;
    p1 <= M ;
    p1 ++ ) {
      for ( int p2 = p1 ;
      p2 <= M ;
      p2 ++ ) {
        for ( int p3 = p2 ;
        p3 <= M ;
        p3 ++ ) {
          String st = new String ( p1 , p2 , p3 ) ;
          psets . put ( st , new double [ ] {
            1 , 3 , 6 }
            [ Integer . parseInt ( st . length ( ) ) - 1 ] * 1.0 / nposs ) ;
            pdp . put ( st , pdProb ( st ) ) ;
          }
        }
      }
      System . out . println ( "Case #1: " ) ;
      for ( int i = 0 ;
      i