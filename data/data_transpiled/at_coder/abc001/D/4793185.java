public static int N = Integer . parseInt ( input ) {
  /* delete the list of integers */
  List < int [ ] > listX = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < listX . size ( ) ;
  i ++ ) {
    listX . add ( new int [ ] {
      i }
      ) ;
    }
    listX = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < set . size ( ) ;
    i ++ ) {
      listX . add ( new int [ ] {
        i }
        ) ;
      }
      /* sort the list of integers */
      List < Integer > listOrder = new ArrayList < > ( ) ;
      Map < Integer , Integer > mapX = new HashMap < > ( ) ;
      for ( int i = 0 ;
      i < listX . size ( ) ;
      i ++ ) {
        listOrder . add ( listX . get ( i ) . intValue ( ) ) ;
      }
      Collections . sort ( listOrder ) ;
      int ct = 0 ;
      for ( int i : listOrder ) {
        listX . set ( ct , mapX . get ( i ) ) ;
        ct ++ ;
      }
      /* list of integers */
      List < int [ ] > listSE = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        String s = Integer . toString ( input . nextLine ( ) . trim ( ) ) ;
        String e = Integer . toString ( i ) ;
        StringBuilder sb = new StringBuilder ( s ) ;
        sb . append ( s ) ;
        sb . append ( e ) ;
        int s_hh = Integer . parseInt ( s . substring ( 0 , 1 ) ) ;
        int s_h = Integer . parseInt ( s . substring ( 1 , 2 ) ) ;
        int s_mm = Integer . parseInt ( s . substring ( 2 , 3 ) ) ;
        int s_m = Integer . parseInt ( s . substring ( 3 , 4 ) ) ;
        int e_hh = Integer . parseInt ( e . substring ( 0 , 4 ) ) ;
        int e_h = Integer . parseInt ( e . substring ( 4 , 6 ) ) ;
        int e_mm = Integer . parseInt ( e . substring ( 5 , 6 ) ) ;
        int e_m = Integer . parseInt ( e . substring ( 6 , 7 ) ) ;
        if ( s_m < 5 ) {
          sb . append ( '0' ) ;
        }
        else if ( s_m >= 5 ) {
          sb . append ( '5' )