public static int N = Integer . parseInt ( input ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > monsters = A . stream ( ) . collect ( Collectors . toList ( ) ) ;
  while ( true ) {
    int aMin = Collections . min ( monsters ) ;
    monsters = monsters . stream ( ) . filter ( m -> m % aMin != 0 ) . collect ( Collectors . toList ( ) ) ;
    if ( monsters . size ( ) == 0 ) {
      System . out . println ( aMin ) ;
      break ;
    }
    else {
      monsters . add ( aMin ) ;
    }
  }
}
