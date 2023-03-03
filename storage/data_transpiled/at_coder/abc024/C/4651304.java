public static int n ( ) {
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> infoSide = new ArrayList < > ( ) ;
  List < List < Integer >> tribe = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) {
    infoSide . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    for ( int j = 0 ;
    j < d ;
    j ++ ) {
      if ( infoSide . get ( j ) . intValue ( ) <= tribe . get ( i ) . intValue ( ) && infoSide . get ( j ) . intValue ( ) <= tribe . get ( i ) . intValue ( ) ) {
        if ( tribe . get ( i ) . intValue ( ) < tribe . get ( i ) . intValue ( ) ) {
          tribe . set ( i , infoSide . get ( j ) . intValue ( ) ) ;
          if ( tribe . get ( i ) . intValue ( ) >= tribe . get ( i ) . intValue ( ) ) {
            System . out . println ( j + 1 ) ;
            break ;
          }
        }
        else {
          tribe . set ( i , infoSide . get ( j ) . intValue ( ) ) ;
          if ( tribe . get ( i ) . intValue ( ) <= tribe . get ( i ) . intValue ( ) ) {
            System . out . println ( j + 1 ) ;
            break ;
          }
        }
      }
    }
  }
  return d ;
}
