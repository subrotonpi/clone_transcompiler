public static void print ( String S ) {
  int B = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'B' ) {
      B ++ ;
    }
    else {
      ans += B ;
    }
  }
  System . out . println ( ans ) ;
}
