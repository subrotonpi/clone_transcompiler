public static String input ( ) {
  String s = input ( ) ;
  int [ ] a = list ( map ( Integer . parseInt , input ( ) ) ) ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    s = s . substring ( 0 , i + a [ i ] ) + "\" " + s . substring ( i + a [ i ] ) ; } return s ; }