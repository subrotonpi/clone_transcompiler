static int N ( int N , int v1 , int v2 , int L ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L = L / v1 * v2 ;
  }
  System . out . println ( L ) ;
}
