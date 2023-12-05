public static int [ ] takaHashi ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  List < Integer > takaHashi = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    List < Integer > aoki = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == j ) {
        aoki . add ( - 10 * 9 + 7 ) ;
      }
      else if ( i < j ) {
        aoki . add ( Integer . parseInt ( A . get ( i + 1 ) ) ) ;
      }
      else {
        aoki . add ( Integer . parseInt ( A . get ( j + 1 ) ) ) ;
      }
    }
    int m = aoki . indexOf ( max ( aoki ) ) ;
    takaHashi . add ( Integer . parseInt ( A . get ( min ( i , m ) , max ( i + 1 , m + 1 ) ) ) - aoki . get ( m ) ) ;
  }
  System . out . println ( max ( takaHashi ) ) ;
  return takaHashi . toArray ( ) ;
}
