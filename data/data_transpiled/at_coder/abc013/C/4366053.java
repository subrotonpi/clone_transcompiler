public static double getCost ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int e = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    int j = Math . max ( 0 , ( ( n * e - h ) - ( b + e ) * i ) / ( d + e ) + 1 ) ;
    double cost = i * a + j * c ;
    if ( ( 0 <= j ) && ( ans > cost ) ) {
      ans = cost ;
    }
  }
  return ans ;
}
