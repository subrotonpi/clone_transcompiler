public static int t = Integer . parseInt ( input ) {
  int a , b , c , d ;
  int i ;
  int t = input . nextInt ( ) ;
  for ( i = 0 ;
  i < t ;
  i ++ ) {
    a = Integer . parseInt ( input . nextLine ( ) ) ;
    b = Integer . parseInt ( input . nextLine ( ) ) ;
    c = Integer . parseInt ( input . nextLine ( ) ) ;
    d = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( a < b ) System . out . println ( "No" ) ;
    else if ( b > d ) System . out . println ( "No" ) ;
    else if ( c > b ) System . out . println ( "Yes" ) ;
    else {
      if ( b - gcd ( b , d ) + a % gcd ( b , d ) > c ) System . out . println ( "No" ) ;
      else System . out . println ( "Yes" ) ;
    }
  }
  return t ;
}
