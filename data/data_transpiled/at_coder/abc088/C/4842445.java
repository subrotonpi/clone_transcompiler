public static List < List < Integer >> C_1 = new ArrayList < > ( ) {
  {
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      System . out . println ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
  }
  ;
  List < List < Integer >> C_2 = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    C_2 . add ( Arrays . asList ( C_1 . get ( 0 ) . get ( i ) , C_1 . get ( 1 ) . get ( i ) , C_1 . get ( 2 ) . get ( i ) ) ) ;
  }
  for ( List < Integer > C : C_1 , C_2 ) {
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      List < Integer > diff = new ArrayList < > ( ) ;
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        diff . add ( C_1 . get ( i ) . get ( j ) - C_1 . get ( ( i + 1 ) % 3 ) . get ( j ) ) ;
      }
      for ( Integer d : diff ) {
        if ( ! d . equals ( diff . get ( 0 ) ) ) {
          System . out . println ( "No" ) ;
          break ;
        }
      }
      else {
        continue ;
      }
      break ;
    }
    break ;
  }
  else {
    System . out . println ( "Yes" ) ;
  }
  return C_2 ;
}
