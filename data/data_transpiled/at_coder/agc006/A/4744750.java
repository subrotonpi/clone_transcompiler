static void print ( int n , String s , String t ) {
  int ans = 2 * n ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 0 && s . equals ( t ) ) ans = n ;
    else if ( s . substring ( i ) . equals ( t . substring ( 0 , t . length ( ) - i ) ) ) ans = Math . min ( ans , n + i ) ;
  }
  System . out . println ( ans ) ;
}
