public static int bitCount ( int n ) {
  if ( n == 0 ) {
    return 0 ;
  }
  return bitCount ( n >>> 1 ) + ( n & 1 ) ;
  /* ent */
  int l = Integer . parseInt ( input . nextLine ( ) , 2 ) ;
  /* uf */
  if ( input . length ( ) < l ) {
    return "0" + input . charAt ( 0 ) ;
  }
  /* ff */
  for ( int xx : input ) {
    /* ff */
    for ( int i = 0 ;
    i < l ;
    i ++ ) {
      /* ff */
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        /* ff */
        for ( int j = 0 ;
        j < i ;
        j ++ ) {
          /* ff */
          for ( int j = 0 ;
          j < i ;
          j ++ ) {
            /* ff */
            for ( int k = 0 ;
            k < i ;
            k ++ ) {
              /* ff */
            }
          }
          /* ff */
        }
      }
    }
    /* attempt */
    if ( xz . length ( ) == 1 || i == l ) {
      int mask = xz [ 0 ] ^ yz [ 0 ] ;
      TreeSet < Integer > xm = new TreeSet < Integer > ( ) ;
      for ( int i = 0 ;
      i < xs . length ;
      i ++ ) {
        /* ff */
        for ( int j = 0 ;
        j < ys . length ;
        j ++ ) {
          /* ff */
          for ( int k = 0 ;
          k < i ;
          k ++ ) {
            /* ff */
            for ( int j = 0 ;
            j < ys . length ;
            j ++ ) {
              /* ff */
              for ( int k = 0 ;
              k < i ;
              k ++ ) {
                /* ff */
                for ( int k = 0 ;
                k < i ;
                k ++ ) {
                  /* ff */
                  for ( int k = 0 ;
                  k < i ;
                  k ++ ) {
                    /* ff */
                  }
                }
              }
            }
          }
        }
        /* ff */
      }
    }
    /* ff */
    return 0 ;
  }
  