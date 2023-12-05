static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L = L / A * B ;
  }
  System . out . println ( L > 10 * * ( - 6 ) ? L : 0 ) ;
}
