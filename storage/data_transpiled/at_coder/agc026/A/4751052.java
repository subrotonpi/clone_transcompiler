public static void main ( String input ) {
  n = Integer . parseInt ( input ) ;
  a = new LinkedList < Integer > ( ) ;
  int c = 1 , ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a . get ( i ) == a . get ( i + 1 ) ) c ++ ;
    else {
      if ( c >= 2 ) ans += c / 2 ;
      c = 1 ;
    }
  }
  System . out . println ( ans ) ;
}
