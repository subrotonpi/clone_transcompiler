public static void input ( ) {
  int ans = 0 ;
  int b = 0 ;
  for ( char ss : s ) {
    if ( ss == 'W' ) {
      ans += b ;
    }
    else {
      b ++ ;
    }
  }
  System . out . println ( ans ) ;
}
