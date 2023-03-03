public static int N = Integer . parseInt ( input ) {
  int [ ] As = map . get ( input ) . split ( " " ) ;
  int count = 0 ;
  for ( int A : As ) {
    if ( A % 2 == 1 ) {
      count ++ ;
    }
  }
  if ( count % 2 == 1 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  return count ;
}
