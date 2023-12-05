public static List < Integer > l = new ArrayList < > ( ) {
  for ( int i = 0 ;
  i < Integer . parseInt ( input . nextLine ( ) ) ;
  i ++ ) {
    int [ ] a = new int [ input . nextInt ( ) ] ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      a [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    l . add ( Integer . valueOf ( a [ a . length - 1 ] ) + 110 * a [ a . length - 1 ] / 900 ) ;
  }
  System . out . println ( max ( l ) ) ;
}
