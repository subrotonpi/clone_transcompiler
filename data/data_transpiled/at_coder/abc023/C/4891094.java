@ Function public static void solve ( ) {
  int r , c , k ;
  int n = ( Integer ) input . nextInt ( ) ;
  ArrayList rc = new ArrayList ( ) ;
  int [ ] rowquery = new int [ r ] ;
  int [ ] columnquery = new int [ c ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    r = ( Integer ) input . nextInt ( ) ;
    c = ( Integer ) input . nextInt ( ) ;
    rowquery [ r - 1 ] ++ ;
    columnquery [ c - 1 ] ++ ;
    rc . add ( new Integer ( r ) ) ;
  }
  Map < Integer , Integer > R = new HashMap < Integer , Integer > ( ) ;
  Map < Integer , Integer > C = new HashMap < Integer , Integer > ( ) ;
  C . putAll ( rowquery ) ;
  C . putAll ( columnquery ) ;
  int ans = 0 ;
  for ( Integer i : R . keySet ( ) ) ans += R . get ( i ) * C . get ( k - i ) ;
  for ( int i : rc ) {
    if ( rowquery [ i - 1 ] + columnquery [ j - 1 ] == k ) ans -- ;
    else if ( rowquery [ i - 1 ] + columnquery [ j - 1 ] == k + 1 ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
