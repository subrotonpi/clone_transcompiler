public static int n ( ) {
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] info = new String [ l ] [ l ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    info [ i ] = input . nextLine ( ) . split ( "\\|" ) ;
  }
  String goal = input . nextLine ( ) ;
  for ( int i = 0 ;
  i < goal . length ( ) ;
  i ++ ) {
    if ( goal . charAt ( i ) == 'o' ) {
      goalN = i / 2 ;
    }
  }
  return goalN + 1 ;
}
