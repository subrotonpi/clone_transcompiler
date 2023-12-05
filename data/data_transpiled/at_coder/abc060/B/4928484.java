public static int gcd ( int x , int y ) {
  while ( y > 0 ) {
    x = y ;
    y = x % y ;
  }
  return x ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( C % gcd ( A , B ) == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return A ;
}
