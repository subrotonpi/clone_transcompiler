public static int [ ] input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  int [ ] Y = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Y [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  int SX = 0 ;
  int SY = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    SX = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  return X ;
}
