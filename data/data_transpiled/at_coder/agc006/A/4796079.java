public static void print ( int N ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int dup = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( s . substring ( N - i - 1 ) . equals ( t . substring ( 0 , i + 1 ) ) ) {
      dup = i + 1 ;
    }
  }
  System . out . println ( 2 * N - dup ) ;
}
