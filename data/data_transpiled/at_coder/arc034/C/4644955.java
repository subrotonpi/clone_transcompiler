@ VisibleForTesting static Map < Integer , Long > map ( Scanner input ) {
  LinkedHashMap < Integer , Long > x = new LinkedHashMap < > ( ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = 10 * 9 + 7 ;
  long l = 1 ;
  for ( int i = b + 1 ;
  i <= a ;
  i ++ ) {
    long n = i ;
    for ( int j = 2 ;
    j <= ( int ) Math . sqrt ( i ) ;
    j ++ ) {
      while ( n % j == 0 ) {
        x . put ( j , 1 ) ;
        n = n / j ;
      }
      if ( n < 2 ) break ;
    }
  }
  for ( long s : x . values ( ) ) l = ( l * ( s + 1 ) ) % d ;
  return x ;
}
