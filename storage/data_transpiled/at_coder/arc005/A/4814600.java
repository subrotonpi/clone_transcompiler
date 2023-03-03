public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] W = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    W [ i ] = input . substring ( i , i + 1 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( W [ i ] . equals ( "TAKAHASHIKUN" ) || W [ i ] . equals ( "Takahashikun" ) || W [ i ] . equals ( "takahashikun" ) ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
