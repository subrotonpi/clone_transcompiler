public static void print ( ) {
  int s = Integer . parseInt ( input ( ) ) ;
  ArrayList < Integer > S = new ArrayList < Integer > ( ) ;
  int ans = 1 ;
  while ( ! S . contains ( s ) ) {
    S . add ( s ) ;
    ans ++ ;
    if ( s % 2 == 0 ) s = s / 2 ;
    else s = 3 * s + 1 ;
  }
  System . out . println ( ans ) ;
}
