@ VisibleForTesting static void input ( Scanner in ) {
  int n = in . nextInt ( ) ;
  int tPrev = 1 , aPrev = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = in . nextInt ( ) , a = in . nextInt ( ) ;
    int nKoho1 = Math . ceil ( new BigDecimal ( tPrev ) . divide ( new BigDecimal ( t ) ) ) ;
    int nKoho2 = Math . ceil ( new BigDecimal ( aPrev ) . divide ( new BigDecimal ( a ) ) ) ;
    n = Math . max ( nKoho1 , nKoho2 ) ;
    t = n * t ;
    a = n * a ;
    tPrev = t ;
    aPrev = a ;
  }
  System . out . println ( tPrev + aPrev ) ;
}
