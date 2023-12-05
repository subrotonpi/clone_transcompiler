public static int input ( ) {
  int S = input ( ) ;
  int d = 10 * 4 ;
  for ( int i = 0 ;
  i < S . length ( ) - 2 ;
  i ++ ) {
    int dd = Math . abs ( 753 - Integer . parseInt ( S . substring ( i , i + 3 ) ) ) ;
    d = Math . min ( d , dd ) ;
  }
  return d ;
}
