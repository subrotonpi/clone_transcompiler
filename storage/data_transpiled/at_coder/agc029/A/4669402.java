public static void input ( ) {
  s = input ( ) ;
  int n = s . length ( ) ;
  int count = 0 ;
  int m = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == 'W' ) {
      count += i - m ;
      m ++ ;
    }
  }
  System . out . println ( count ) ;
}
