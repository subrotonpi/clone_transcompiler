public static void input ( ) {
  int ans = A . length ( ) * ( A . length ( ) - 1 ) / 2 + 1 ;
  for ( int i = Character . MIN_VALUE ;
  i <= Character . MAX_VALUE ;
  i ++ ) {
    char s = ( char ) i ;
    int c = A . indexOf ( s ) ;
    ans -= c * ( c - 1 ) / 2 ;
  }
  System . out . println ( ans ) ;
}
