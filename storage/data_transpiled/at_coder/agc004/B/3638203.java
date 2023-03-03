@ VisibleForTesting static void copyAndPrint ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int a : input . nextLine ( ) . split ( " " ) ) {
    A [ a ] = Integer . parseInt ( a ) ;
  }
  int [ ] minA = new int [ N ] ;
  minA = A ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    minA [ i ] = minA [ i ] ;
  }
}
