static final int n = Integer . parseInt ( input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( b > d || b > a ) System . out . println ( "No" ) ;
    else if ( b <= c ) System . out . println ( "Yes" ) ;
    else {
      int num = MathUtils . gcd ( b , d ) ;
      if ( b - num + ( a % num ) > c ) System . out . println ( "No" ) ;
      else System . out . println ( "Yes" ) ;
    }
  }
  return n ;
}
