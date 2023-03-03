@ Sys public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( args [ 0 ] ) ;
  List < List < Integer >> SE = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    SE . add ( Collections . singletonList ( Integer . parseInt ( args [ 1 ] ) ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    SE . get ( i ) . set ( 0 , SE . get ( i ) . get ( 0 ) - SE . get ( i ) . get ( 0 ) % 5 ) ;
    if ( ( SE . get ( i ) . get ( 1 ) % 5 != 0 ) ) {
      SE . set ( i , SE . get ( i ) . get ( 1 ) - SE . get ( i ) . get ( 1 ) % 5 + 5 ) ;
    }
    double tmp2 = SE . get ( i ) . get ( 1 ) / 100 ;
    if ( ( tmp2 - ( int ) tmp2 ) > 0.59999 ) {
      SE . set ( i , ( ( int ) tmp2 + 1 ) * 100 ) ;
    }
    if ( ( SE . get ( i ) . get ( 1 ) >= 2360 ) ) {
      SE . set ( i , 2400 ) ;
    }
  }
  int [ ] state = new int [ 2401 ] ;
  for ( List < Integer > before : SE ) {
    int bf = before . get ( 0 ) ;
    int af = after . get ( 0 ) ;
    state [ bf ] = 1 ;
  }
  List < Integer > startEnd = new ArrayList < > ( ) ;
  int flag = 0 ;
  for ( int i = 0 ;
  i < state . size ( ) ;
  i ++ ) {
    if ( flag == 0 && state . get ( i ) ) {
      startEnd . add ( i ) ;
      flag = 1 ;
    }
    if ( flag == 1 && ! state . get ( i ) ) {
      startEnd . add ( i - 1 ) ;
      flag = 0 ;
    }
    if ( i == 2400 && flag == 1 ) {
      startEnd . add ( 2400 ) ;
    }
  }
  for ( int i = 0 ;
  i < ( int ) ( startEnd . size ( ) / 2 ) ;
  i ++ ) {
    System . out . println ( startEnd . remove ( 0 ) . toString ( ) + "-" + startEnd . remove ( 0 ) . toString ( ) ) ;
  }
}
