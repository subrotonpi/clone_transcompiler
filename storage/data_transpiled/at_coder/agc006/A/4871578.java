public static void print ( int N ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int ans = 2 * N ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    if ( s . substring ( s . length ( ) - i ) . equals ( t . substring ( 0 , i ) ) ) {
      ans = 2 * N - i ;
      break ;
    }
  }
  System . out . println ( ans ) ;
}
