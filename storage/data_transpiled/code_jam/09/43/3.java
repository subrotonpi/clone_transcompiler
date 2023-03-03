@ org . python . Method ( __doc__ = "" ) public static org . python . Object [ ] [ ] solve ( ) {
  org . python . Object [ ] [ ] kraw = new org . python . Object [ 3 ] [ 2 ] ;
  Class < gcj > cls = gcj . getClass ( ) ;
  IN = new In ( ) ;
  int number = 0 ;
  @ org . python . Object [ ] [ ] result = new org . python . Object [ 3 ] [ 2 ] ;
  @ org . python . Object [ ] [ ] result = new org . python . Object [ 3 ] [ 2 ] ;
  for ( int i = 0 ;
  i < result . length ;
  ++ i ) {
    result [ i ] = new org . python . Object [ ] {
      IN , number ++ , "Case #" + i + ":" }
      ;
    }
    @ org . python . Object [ ] [ ] result = new org . python . Object [ ] [ ] {
      IN , number ++ , "Case #" + i + ":" }
      ;
      @ org . python . Object [ ] [ ] result = new org . python . Object [ ] [ ] {
        IN , number ++ , "Case #" + i + ":" }
        ;
        @ org . python . Object [ ] [ ] result = new org . python . Object [ ] [ ] {
          IN , number ++ , "Case #" + i + ":" }
          ;
          /* go through */
          int T = gcj . line ( int . class ) ;
          for ( int i = 0 ;
          i < T ;
          ++ i ) {
            int n = gcj . splitline ( i ) ;
            int k = gcj . splitline ( i ) ;
            List < Integer > list = new ArrayList < Integer > ( ) ;
            for ( int j = 0 ;
            j < n ;
            ++ j ) {
              list . add ( gcj . splitline ( j ) ) ;
              assert list . get ( list . size ( ) - 1 ) == k ;
            }
            System . out . println ( gcj . case ( ) + " " + solve ( list ) ) ;
          }
          /* max matching */
          int n = kraw . length ;
          mat [ 0 ] = null ;
          int res = 0 ;
          do {
            boolean [ ] vis = new boolean [ 2 * n ] ;
            boolean ok = false ;
            for ( int i = 0 ;
            i < n ;
            ++ i ) {
              if ( Arrays .