public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  return M + ( M - sum ( L ) ) / min ( L ) ;
}
