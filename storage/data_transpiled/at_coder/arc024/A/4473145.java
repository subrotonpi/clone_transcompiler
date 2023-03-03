public static void ans ( ) {
  int L , R ;
  L = Integer . parseInt ( input . nextLine ( ) ) ;
  R = Integer . parseInt ( input . nextLine ( ) ) ;
  l = Integer . parseInt ( input . nextLine ( ) ) ;
  r = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  for ( int ll : l ) {
    if ( ( ll >= r ) && ( ll <= r ) ) {
      cnt ++ ;
      r . remove ( ll ) ;
    }
  }
  System . out . println ( cnt ) ;
}
