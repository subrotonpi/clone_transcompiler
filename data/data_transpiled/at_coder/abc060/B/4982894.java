public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int i = 0 ;
  while ( true ) {
    if ( ( i * B + C ) % A == 0 ) {
      System . out . println ( "YES" ) ;
      break ;
    }
    else {
      if ( i > 0 && ( i * B ) % A == 0 ) {
        System . out . println ( "NO" ) ;
        break ;
      }
      i ++ ;
    }
  }
}
