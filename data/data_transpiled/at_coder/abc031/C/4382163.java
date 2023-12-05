public static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int takahasi = - 10 * 5 ;
  int tTmp ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int aoki = - ( 10 * 10 ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int tmp1 = 0 ;
      int tmp2 = 0 ;
      if ( i < j ) {
        for ( int k = i ;
        k <= j ;
        k ++ ) {
          if ( ( i - k ) % 2 == 0 ) tmp1 += A [ k ] ;
          else tmp2 += A [ k ] ;
        }
        if ( aoki < tmp2 ) {
          aoki = tmp2 ;
          tTmp = tmp1 ;
        }
      }
    }
    takahasi = Math . max ( takahasi , tTmp ) ;
  }
  System . out . println ( takahasi ) ;
  return A ;
}
