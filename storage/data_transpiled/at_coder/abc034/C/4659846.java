public static int w = Integer . parseInt ( input ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  /* extgcd */
  int [ ] r = {
    1 , 0 , a }
    ;
    int [ ] w = {
      0 , 1 , b }
      ;
      while ( w [ 2 ] != 1 ) {
        int q = r [ 2 ] / w [ 2 ] ;
        int [ ] r2 = w ;
        int [ ] w2 = {
          r [ 0 ] - q * w [ 0 ] , r [ 1 ] - q * w [ 1 ] , r [ 2 ] - q * w [ 2 ] }
          ;
          r = r2 ;
          w = w2 ;
        }
        /* mod inv */
        int x = extgcd ( w , h ) [ 0 ] ;
        return ( x + x % m ) % m ;
      }
      