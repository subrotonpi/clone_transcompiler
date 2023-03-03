public static String input ( ) {
  String s = input ( ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    x -- ;
    y -- ;
    s = s . substring ( 0 , x ) + s . substring ( x , y + 1 ) . substring ( 0 , y + 1 ) + s . substring ( y + 1 ) ;
  }
  return s ;
}
