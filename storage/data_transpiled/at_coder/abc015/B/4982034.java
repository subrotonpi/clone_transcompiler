public static void print ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  double s = sum ( l ) / ( n - l . indexOf ( 0 ) ) ;
  int ans = ( int ) s + ( ( s - Integer . MAX_VALUE ) > 0 ) ;
  System . out . println ( ans ) ;
}
