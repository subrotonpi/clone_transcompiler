public static int input ( ) {
  int ans = 0 ;
  ArrayList < String > memo = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < 1 << S . length - 1 ;
  i ++ ) {
    String tmp = S . charAt ( 0 ) ;
    for ( int j = 0 ;
    j < S . length - 1 ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) == 1 ) tmp += "+" ;
      tmp += S . charAt ( j + 1 ) ;
    }
    if ( ! memo . contains ( tmp ) ) {
      ans += new Integer ( tmp ) ;
      memo . add ( tmp ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
