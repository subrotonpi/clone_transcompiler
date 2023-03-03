public static String input ( ) {
  String s = input ( ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    s = s . substring ( 0 , a - 1 ) + s . substring ( a - 1 , b ) . substring ( 0 , b ) + s . substring ( b ) ;
  }
  return s ;
}
