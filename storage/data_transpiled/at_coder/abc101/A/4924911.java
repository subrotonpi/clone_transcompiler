public static void input ( ) {
  String s = input ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) ans ++ ;
    else ans -- ;
  }
  System . out . println ( ans ) ;
}
