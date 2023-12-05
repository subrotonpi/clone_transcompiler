public static int N ( ) {
  String S = input ( ) ;
  int [ ] X = new int [ 26 ] ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    X [ ( int ) s - 97 ] ++ ;
  }
  int ret = 1 ;
  for ( int x : X ) {
    ret *= x + 1 ;
  }
  System . out . println ( ( ret - 1 ) % ( 10 * 9 + 7 ) ) ;
  return ret ;
}
