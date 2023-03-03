public static int N = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = 1001 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ct = Integer . parseInt ( input . nextLine ( ) ) ;
    int tc = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( T >= tc ) {
      c = ct ;
    }
  }
  if ( c == 1001 ) {
    c = "TLE" ;
  }
  return c ;
}
