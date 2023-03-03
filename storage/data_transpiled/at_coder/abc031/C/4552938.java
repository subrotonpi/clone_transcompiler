public static double max ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = - Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double maxAoki = - Double . MAX_VALUE ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i != j ) {
        int num1 = i ;
        int num2 = j ;
        if ( j < i ) {
          num2 = i ;
          num1 = j ;
        }
        int aoki = Arrays . binarySearch ( a , num1 , num2 + 1 , 1 , 2 ) ;
        int takahashi = Arrays . binarySearch ( a , num1 , num2 + 1 , 0 , 2 ) ;
        if ( aoki > maxAoki ) {
          maxAoki = aoki ;
          maxAoki = takahashi ;
        }
      }
    }
    ans = Math . max ( ans , maxAoki ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
