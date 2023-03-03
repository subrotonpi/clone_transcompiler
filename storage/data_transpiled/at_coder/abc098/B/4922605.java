public static void print ( int n ) {
  String s = input . nextLine ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    String x = s . substring ( 0 , i ) ;
    String y = s . substring ( i ) ;
    ans = Math . max ( ans , new HashSet ( x ) . intersection ( y ) . size ( ) ) ;
  }
  System . out . println ( ans ) ;
}
