static final String print ( final String str , final int radix ) {
  final int inf = 10 * radix ;
  final int mod = 10 * radix + 7 ;
  /* LI */
  final int [ ] li = {
    Integer . parseInt ( str ) }
    ;
    /* LI_ */
    final int [ ] li = {
      Integer . parseInt ( str ) }
      ;
      /* LF */
      final int [ ] lf = {
        Float . parseFloat ( str ) }
        ;
        /* LS */
        final int [ ] ls = {
          Float . parseFloat ( str ) }
          ;
          /* I */
          final int [ ] i = {
            Integer . parseInt ( str ) }
            ;
            /* F */
            final int [ ] f = {
              Float . parseFloat ( str ) }
              ;
              /* S */
              final int n = input ( str ) ;
              final Map < Integer , Integer > e = new HashMap < Integer , Integer > ( ) ;
              for ( int a = 1 ;
              a < n ;
              a ++ ) {
                final Integer b = i [ a ] ;
                e . put ( a , b ) ;
                e . put ( b , a ) ;
              }
              final Map < Integer , Integer > m = new HashMap < Integer , Integer > ( ) ;
              /* s */
              final Integer key = new Integer ( i ) ;
              if ( m . containsKey ( key ) ) {
                return m . get ( key ) ;
              }
              if ( e . get ( i ) . size ( ) == 1 ) {
                m . put ( key , new Integer ( 1 ) ) ;
                return new Integer ( 1 ) ;
              }
              final int [ ] r = new int [ n ] ;
              for ( int j = 0 ;
              j < e . get ( i ) . size ( ) ;
              j ++ ) {
                final Integer k = e . get ( i ) . get ( j ) ;
                final int ma = e . get ( i ) . get ( ma ) ;
                r [ 0 ] = k ;
              }
              if ( r . length > 0 ) {
                m . put ( key , new Integer ( sum ( r ) + 1 ) , new Integer ( max ( r ) ) ) ;
              }
              else {
                m . put ( key , new Integer ( 1 ) ) ;
              }
              return m . get ( key ) ;
            }
            