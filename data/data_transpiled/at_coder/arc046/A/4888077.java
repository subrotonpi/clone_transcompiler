public static boolean same ( int i ) {
  return new HashSet < > ( ) . stream ( ) . map ( c -> c . toString ( ) ) . count ( ) == 1 ;
  /* main program */
  int n = Integer . parseInt ( input ( ) ) ;
  i = 0 ;
  while ( n > 0 ) {
    i ++ ;
    if ( same ( i ) ) {
      n -- ;
    }
  }
  System . out . println ( i ) ;
}
