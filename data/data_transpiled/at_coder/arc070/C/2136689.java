public static void print ( int N ) {
  List < Integer > P = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  @ SuppressWarnings ( "unused" ) int l0 , r0 ;
  int [ ] L = {
    - l0 + 1 }
    ;
    int [ ] R = {
      l0 - 1 }
      ;
      int s = 0 ;
      int t = 0 ;
      int res = 0 ;
      for ( int i = 0 ;
      i < N - 1 ;
      i ++ ) {
        l0 = P [ i ] ;
        r0 = P [ i + 1 ] ;
        int l1 = P [ i + 1 ] ;
        int r1 = P [ i + 1 ] ;
        s += ( r1 - l1 ) ;
        t += ( r0 - l0 ) ;
        if ( - s - L [ 0 ] <= l1 - 1 && t + R [ 0 ] < l1 ) {
          System . arraycopy ( L , 0 , R , 0 , L . length ) ;
          System . arraycopy ( R , 0 , R , 0 , L . length ) ;
          System . arraycopy ( l1 , 0 , R , 0 , L . length ) ;
          int p = - Integer . MAX_VALUE - s ;
          System . arraycopy ( R , 0 , R , 0 , p - t ) ;
          res += ( p - ( l1 - 1 ) ) ;
        }
        else if ( t + R [ 0 ] < l1 - 1 ) {
          System . arraycopy ( R , 0 , R , 0 , L . length ) ;
          System . arraycopy ( l1 , 0 , R , 0 , L . length ) ;
          int p = Integer . MAX_VALUE + t ;
          System . arraycopy ( L , 0 , R , 0 , L . length ) ;
          res += ( ( l1 - 1 ) - p ) ;
        }
      }
      System . out . println ( res ) ;
    }
    