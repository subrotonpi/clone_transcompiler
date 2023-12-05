static final String solve ( ) {
  final String B = "PRS" ;
  final int [ ] [ ] T = {
    {
      0 , 1 }
      , {
        1 , 2 }
        , {
          2 , 0 }
        }
        ;
        {
          if ( n == 0 ) {
            return new String [ ] {
              v }
              ;
            }
            n -- ;
          }
          final List < String > ret = new ArrayList < String > ( ) ;
          ret . add ( build ( T [ v ] [ 0 ] , n ) ) ;
          ret . add ( build ( T [ v ] [ 1 ] , n ) ) ;
          Collections . sort ( ret ) ;
          return ret . get ( 0 ) + ret . get ( 1 ) ;
        }
        