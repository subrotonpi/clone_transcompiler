public static int [ ] max ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    List < Integer > a = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == j ) {
        a . add ( - 10 * 9 + 7 ) ;
      }
      else {
        a . add ( Integer . parseInt ( A . get ( Math . min ( i + 1 , j + 1 ) , Math . max ( i + 1 , j + 1 ) ) ) ) ;
      }
    }
    int m = a . indexOf ( max ( a ) ) ;
    t [ i ] = Math . max ( a , m ) ;
  }
  return t ;
}
