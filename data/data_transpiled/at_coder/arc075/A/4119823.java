public static int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( s ) ;
  int sum_point = sum ( s ) ;
  s = new int [ sum_point ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( s [ i ] % 10 != 0 ) {
    }
  }
  int ans = sum_point ;
  return s ;
}
