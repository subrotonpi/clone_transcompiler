public static void main ( String input , int n , int t ) {
  int [ ] [ ] ct = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ct [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  List < Integer > underT = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ct [ i ] [ 1 ] <= t ) {
      underT . add ( ct [ i ] [ 0 ] ) ;
    }
  }
  if ( underT . size ( ) == 0 ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( Collections . min ( underT ) ) ;
  }
}
