public static int N = Integer . parseInt ( input ) {
  List < List < Double >> L = new ArrayList < > ( ) ;
  int ans [ ] = {
    0 , 0 , 0 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      L . add ( Collections . singletonList ( Double . parseDouble ( input . nextLine ( ) ) ) ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( L . get ( i ) . get ( ) >= 35 ) {
        ans [ 0 ] ++ ;
      }
      else if ( L . get ( i ) . get ( ) >= 30 ) {
        ans [ 1 ] ++ ;
      }
    }
    return ans [ 0 ] ;
  }
  