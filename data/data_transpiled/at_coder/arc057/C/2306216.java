public static void input ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = a * ( 10 * * 1000 ) * a * ( 10 * * 1000 ) ;
  int c = ( a * ( 10 * * 1000 ) + ( 10 * * 1000 - 1 ) ) * ( a * ( 10 * * 1000 ) + ( 10 * * 1000 - 1 ) ) ;
  int ans = b ;
  int s = 2 ;
  do {
    if ( s > Integer . toString ( b ) . length ( ) ) {
      break ;
    }
    int d = 10 * s ;
    int k1 = b / d ;
    int k2 = b % d ;
    if ( k2 == 0 ) {
      int z = k1 * d ;
      if ( z <= c ) {
        ans = z / d ;
      }
    }
    else {
      int z = ( k1 + 1 ) * d ;
      if ( z <= c ) {
        ans = z / d ;
      }
    }
    s = s + 2 ;
  }
  while ( true ) ;
  System . out . println ( ans ) ;
}
