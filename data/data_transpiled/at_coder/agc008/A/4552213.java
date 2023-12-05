public static double getDoubleInRange ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = Double . MAX_VALUE ;
  for ( int i = 1 ;
  i <= a ;
  i ++ ) {
    for ( int j = 1 ;
    j <= b ;
    j ++ ) {
      if ( b * i >= a * j ) {
        int tmp = b * i - a * j ;
        if ( i == - 1 ) tmp ++ ;
        if ( j == - 1 ) tmp ++ ;
        ans = Math . min ( ans , tmp ) ;
      }
    }
  }
  return ans ;
}
