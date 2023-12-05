public static List < Integer > convert ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = 0 ;
  int c = 0 ;
  for ( int i : a ) {
    switch ( i ) {
      case 7 : b ++ ;
      break ;
      case 5 : c ++ ;
    }
  }
  if ( b == 1 && c == 2 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return a ;
}
