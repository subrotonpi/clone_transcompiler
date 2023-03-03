public static int N = Integer . parseInt ( input ) {
  int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  HashMap < String , Integer > dic = new HashMap < String , Integer > ( ) ;
  int max1 = 0 , max2 = 0 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( A [ i ] >= 0 ) && ( dic . containsKey ( A [ i ] ) ) ) {
      dic . put ( A [ i ] , ++ count ) ;
      if ( ( dic . get ( A [ i ] ) % 2 ) == 0 ) {
        count ++ ;
        if ( ( max1 < A [ i ] ) && ( max2 < A [ i ] ) ) {
          max2 = max1 ;
          max1 = A [ i ] ;
        }
        if ( ( A [ i ] < max1 ) && ( max2 < A [ i ] ) ) {
          max2 = Math . max ( max2 , A [ i ] ) ;
        }
      }
    }
    else {
      dic . put ( A [ i ] , ++ count ) ;
    }
  }
  int ans = 0 ;
  if ( ( count >= 2 ) && ( dic . get ( max1 ) >= 4 ) ) {
    ans = max1 * max1 ;
  }
  else {
    ans = max1 * max2 ;
  }
  return ans ;
}
