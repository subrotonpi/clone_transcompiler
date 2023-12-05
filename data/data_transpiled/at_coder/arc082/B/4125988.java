public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int r = 0 ;
  int i = 0 ;
  while ( i < N ) {
    if ( p [ i ] == i + 1 ) {
      r ++ ;
      i ++ ;
    }
    i ++ ;
  }
  System . out . println ( r ) ;
}
