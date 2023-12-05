public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  String [ ] w = input ( ) . substring ( 0 , N - 1 ) . split ( " " ) ;
  int ans = Arrays . stream ( w ) . count ( "takahashikun" ) ;
  return ans ;
}
