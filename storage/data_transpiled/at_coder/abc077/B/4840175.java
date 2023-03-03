@ System . exit public static void exit ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int anss = 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( ( i * i ) > N ) {
      anss = i - 1 ;
      break ;
    }
  }
  System . out . println ( anss * anss ) ;
}
