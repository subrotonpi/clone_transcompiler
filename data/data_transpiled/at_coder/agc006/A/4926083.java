public static int N = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( s . substring ( i ) . equals ( t . substring ( 0 , N - i ) ) ) {
      System . out . println ( N + i ) ;
      break ;
    }
  }
  return N ;
}
