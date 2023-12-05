public static void main ( String input ) {
  int w = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] lo = {
    0 , 0 }
    ;
    int [ ] hi = {
      w , h }
      ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int a = Integer . parseInt ( input ) ;
        int b = Integer . parseInt ( input ) ;
        int x = Integer . parseInt ( input ) ;
        if ( x == 1 ) {
          if ( a >= lo [ 0 ] ) lo [ 0 ] = a ;
        }
        if ( x == 2 ) {
          if ( a <= hi [ 0 ] ) hi [ 0 ] = a ;
        }
        if ( x == 3 ) {
          if ( b >= lo [ 1 ] ) lo [ 1 ] = b ;
        }
        if ( x == 4 ) {
          if ( b <= hi [ 1 ] ) hi [ 1 ] = b ;
        }
      }
      if ( hi [ 0 ] >= lo [ 0 ] && hi [ 1 ] >= lo [ 1 ] ) {
        System . out . println ( ( hi [ 0 ] - lo [ 0 ] ) * ( hi [ 1 ] - lo [ 1 ] ) ) ;
      }
      else {
        System . out . println ( 0 ) ;
      }
    }
    