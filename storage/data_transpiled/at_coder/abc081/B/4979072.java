public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > list = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < max ( list . size ( ) ) ;
  i ++ ) {
    List < Integer > evenData = Lists . newArrayList ( ) ;
    evenData . add ( i ) ;
    if ( evenData . size ( ) < n ) {
      System . out . println ( i ) ;
      break ;
    }
    list . clear ( ) ;
  }
}
