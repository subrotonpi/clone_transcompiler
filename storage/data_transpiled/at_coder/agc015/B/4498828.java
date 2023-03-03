public static void input ( ) {
  s = input ;
  int ls = s . length ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= ls ;
  i ++ ) {
    if ( s . charAt ( i - 1 ) == 'U' ) {
      ans += ls - i + ( i - 1 ) * 2 ;
    }
    else {
      ans += ( ls - i ) * 2 + i - 1 ;
    }
  }
  System . out . println ( ans ) ;
}
