public static void print ( int a ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < ( int ) ( a / 2 ) ;
  i ++ ) {
    int x = i + 1 ;
    int m = x * ( a - x ) ;
    if ( ans < m ) {
      ans = m ;
    }
  }
  System . out . println ( ans ) ;
}
