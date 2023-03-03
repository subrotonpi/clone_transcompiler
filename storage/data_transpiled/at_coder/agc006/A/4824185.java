public static void print ( int n ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . substring ( n - 1 - i ) . equals ( t . substring ( 0 , i + 1 ) ) ) {
      cnt = Math . max ( cnt , i + 1 ) ;
    }
  }
  System . out . println ( 2 * n - cnt ) ;
}
