public static void input ( ) {
  int b = 0 ;
  int ans = 0 ;
  for ( char c : S ) {
    if ( c == 'B' ) {
      b ++ ;
    }
    else {
      ans += b ;
    }
  }
  System . out . println ( ans ) ;
}
