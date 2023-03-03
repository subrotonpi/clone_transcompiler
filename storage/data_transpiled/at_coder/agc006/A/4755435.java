public static int N = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  if ( s . equals ( t ) ) {
    System . out . println ( N ) ;
  }
  else {
    boolean flag = false ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( s . substring ( i ) . equals ( t . substring ( 0 , t . length ( ) - i ) ) ) {
        flag = true ;
        break ;
      }
    }
    System . out . println ( flag ? N + i : N + N ) ;
  }
  return N ;
}
