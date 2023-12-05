public static int input ( ) {
  String s = input ( ) ;
  int r = 1000 ;
  for ( int i = 0 ;
  i < s . length ( ) - 2 ;
  i ++ ) {
    int n = Integer . parseInt ( s . substring ( i , i + 3 ) ) ;
    int tmp = Math . abs ( 753 - n ) ;
    if ( tmp < r ) {
      r = tmp ;
    }
  }
  return r ;
}
