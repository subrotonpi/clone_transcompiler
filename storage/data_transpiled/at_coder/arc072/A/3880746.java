public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans1 = 0 ;
  int ans2 = 0 ;
  int sum1 = 0 ;
  int sum2 = 0 ;
  boolean flag = true ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    sum1 = sum1 + A [ i ] ;
    sum2 = sum2 + A [ i ] ;
    flag = ! ( flag ) ;
    if ( flag ) {
      if ( sum1 > 0 ) {
      }
      else {
        ans1 += Math . abs ( 1 - sum1 ) ;
        sum1 = 1 ;
      }
      if ( sum2 < 0 ) {
      }
      else {
        ans2 += Math . abs ( - 1 - sum2 ) ;
        sum2 = - 1 ;
      }
    }
    else {
      if ( sum2 > 0 ) {
      }
      else {
        ans2 += Math . abs ( 1 - sum2 ) ;
        sum2 = 1 ;
      }
      if ( sum1 < 0 ) {
      }
      else {
        ans1 += Math . abs ( - 1 - sum1 ) ;
        sum1 = - 1 ;
      }
    }
  }
  System . out . println ( Math . min ( ans1 , ans2 ) ) ;
  return ans1 ;
}
