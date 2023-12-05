public static int N = Integer . parseInt ( input ) {
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) As . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  if ( min ( As ) >= 0 ) {
    System . out . println ( As . size ( ) - 1 ) ;
    for ( int j = 0 ;
    j < As . size ( ) - 1 ;
    j ++ ) System . out . println ( j + 1 + 2 ) ;
  }
  else if ( max ( As ) <= 0 ) {
    System . out . println ( As . size ( ) - 1 ) ;
    for ( int j = As . size ( ) - 1 ;
    j > 0 ;
    j -- ) System . out . println ( j + 1 + 1 ) ;
  }
  else if ( Math . abs ( max ( As ) ) >= Math . abs ( min ( As ) ) ) {
    int maxIndex = As . indexOf ( max ( As ) ) ;
    System . out . println ( As . size ( ) * 2 - 1 ) ;
    for ( int j = 0 ;
    j < As . size ( ) ;
    j ++ ) System . out . println ( maxIndex + 1 + 1 + 1 ) ;
    for ( int j = As . size ( ) - 1 ;
    j > 0 ;
    j -- ) System . out . println ( j + 1 + 2 ) ;
  }
  else {
    int minIndex = As . indexOf ( min ( As ) ) ;
    System . out . println ( As . size ( ) * 2 - 1 ) ;
    for ( int j = 0 ;
    j < As . size ( ) ;
    j ++ ) System . out . println ( minIndex + 1 + 1 + 1 ) ;
    for ( int j = As . size ( ) - 1 ;
    j > 0 ;
    j -- ) System . out . println ( j + 1 + 1 + 1 ) ;
  }
  return N ;
}
