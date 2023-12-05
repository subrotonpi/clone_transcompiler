public static void input ( ) {
  s = input ;
  int ls = s . length ( ) ;
  int c = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < ls ;
  i ++ ) {
    if ( s . charAt ( i ) == 'S' ) {
      c ++ ;
    }
    else if ( c > 0 ) {
      ans += 2 ;
      c -- ;
    }
  }
  System . out . println ( ls - ans ) ;
}
