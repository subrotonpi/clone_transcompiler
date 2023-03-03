public static void input ( Scanner s ) {
  char tmp = s . next ( ) ;
  int cnt = 0 ;
  for ( char x : s ) {
    if ( tmp == x ) {
      cnt ++ ;
    }
    else {
      System . out . print ( tmp + cnt ) ;
      cnt = 1 ;
    }
    tmp = x ;
  }
  if ( cnt != 0 ) {
    System . out . println ( tmp + cnt ) ;
  }
}
