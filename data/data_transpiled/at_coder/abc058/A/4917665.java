public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int [ ] A = new int [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( A [ 1 ] - A [ 0 ] == A [ 2 ] - A [ 1 ] ) {
    System . out . println ( Main . class . getName ( ) ) ;
  }
  else {
    System . out . println ( Main . class . getName ( ) ) ;
  }
}
