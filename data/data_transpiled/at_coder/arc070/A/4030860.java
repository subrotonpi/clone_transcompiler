public static int a ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    if ( i * ( i + 1 ) / 2 <= a && a <= ( i + 1 ) * ( i + 2 ) / 2 ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
  }
  return a ;
}
