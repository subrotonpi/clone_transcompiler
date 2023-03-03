static final int input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int tPrev = 1 , aPrev = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = Integer . parseInt ( input ( ) ) ;
    int a = Integer . parseInt ( input ( ) ) ;
    int nKoho1 = tPrev / t ;
    int nKoho2 = aPrev / a ;
    if ( tPrev % t != 0 ) nKoho1 ++ ;
    if ( aPrev % a != 0 ) nKoho2 ++ ;
    n = Math . max ( nKoho1 , nKoho2 ) ;
    t = n * t ;
    a = n * a ;
    tPrev = t ;
    aPrev = a ;
  }
  System . out . println ( tPrev + aPrev ) ;
}
