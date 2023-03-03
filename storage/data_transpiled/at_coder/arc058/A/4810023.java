public static int n = Integer . parseInt ( input ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > D = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    D . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  for ( int i = n ;
  i < 88889 ;
  i ++ ) {
    for ( String j : String . valueOf ( i ) . split ( " " ) ) {
      if ( D . contains ( Integer . parseInt ( j ) ) ) {
        break ;
      }
    }
  }
  else {
    System . out . println ( i ) ;
    exit ( ) ;
  }
  return k ;
}
