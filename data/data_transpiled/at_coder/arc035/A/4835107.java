public static void input ( ) {
  String s = input ( ) ;
  int x = s . length ( ) ;
  String a ;
  String b ;
  if ( x % 2 == 1 ) {
    a = s . substring ( 0 , x / 2 ) ;
    b = s . substring ( x / 2 + 1 ) . substring ( 0 , s . length ( ) - 1 ) ;
  }
  else {
    a = s . substring ( 0 , x / 2 ) ;
    b = s . substring ( 0 , x / 2 ) ;
  }
  for ( int i = 0 ;
  i < a . length ( ) ;
  i ++ ) {
    a = a + b ;
  }
}
