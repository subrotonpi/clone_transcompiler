public static int N = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int X [ ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Math . abs ( A - ( T - H [ i ] * 0.006 ) ) ;
  }
  return X [ i ] ;
}
