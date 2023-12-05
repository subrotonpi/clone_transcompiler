public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int [ ] list = new int [ 100 ] ;
  for ( int i = 0 ;
  i < a * b ;
  i ++ ) {
    list [ a * i % b ] ++ ;
  }
  if ( list [ c ] >= 1 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
