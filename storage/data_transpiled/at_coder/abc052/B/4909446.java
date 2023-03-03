@ MoreIO public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > S = Collections . singletonList ( "I" ) ;
  for ( String s : input ) {
    if ( s . equals ( "I" ) ) {
      x ++ ;
    }
    else if ( s . equals ( "D" ) ) {
      x += - 1 ;
    }
    maxX = Math . max ( x , maxX ) ;
  }
  System . out . println ( maxX ) ;
  if ( getClass ( ) . equals ( String . class ) ) {
    System . out . println ( "Hello World!" ) ;
  }
}
