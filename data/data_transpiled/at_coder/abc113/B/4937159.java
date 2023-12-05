public static int N = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < H . length ;
  i ++ ) {
    H [ i ] = Math . abs ( A - ( T - H [ i ] * 0.006 ) ) ;
  }
  return H [ i ] ;
}
