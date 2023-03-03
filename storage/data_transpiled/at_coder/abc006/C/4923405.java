public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int M2 = M - 3 * N ;
  if ( Math . abs ( M2 ) > N ) {
    System . out . println ( "-1 -1 -1" ) ;
  }
  else if ( M2 >= 0 ) {
    System . out . println ( 0 + " " + N - M2 + " " + M2 ) ;
  }
  else {
    System . out . println ( - M2 + " " + N + M2 + " " + 0 ) ;
  }
  return M2 ;
}
