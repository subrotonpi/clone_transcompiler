static final int [ ] [ ] getDistance ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < String >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    s . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
  }
  Point st = new Point ( - 1 , - 1 ) ;
  Point gl = new Point ( - 1 , - 1 ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( s . get ( i ) . get ( j ) . equals ( "S" ) ) {
        st = new Point ( i , j ) ;
      }
      if ( s . get ( i ) . get ( j ) . equals ( "G" ) ) {
        gl = new Point ( i , j ) ;
      }
    }
  }
  int [ ] dx = {
    0 , 1 , 0 , - 1 }
    ;
    int [ ] dy = {
      1 , 0 , - 1 , 0 }
      ;
      /* check */
      if ( in <= 1 ) {
        return true ;
      }
      PriorityQueue < Integer > q = new PriorityQueue < > ( ) ;
      HeapSort . sort ( q , new Comparator < Integer > ( ) {
        @ Override public int compare ( Integer in , Integer out ) {
          int [ ] dist = new int [ W ] ;
          for ( int j = 0 ;
          j < H ;
          j ++ ) {
            for ( int i = 0 ;
            i < W ;
            i ++ ) {
              dist [ j ] = new int [ W ] ;
              for ( int j = 0 ;
              j < H ;
              j ++ ) {
                for ( int i = 0 ;
                i < W ;
                i ++ ) {
                  dist [ j ] [ i ] = - 1 ;
                }
              }
            }
            int x = r . x ;
            int y = r . y ;
            for ( int k = 0 ;
            k < 4 ;
            k ++ ) {
              int nx = x + dx [ k ] ;
              int ny = y + dy [ k ] ;
              if ( ! ( 0 <= nx && nx < H && 0 <= ny && ny < W ) ) {
                continue ;
              }
              if ( dist [ nx ] [ ny ] != - 1 ) {
                continue ;
              }
              if ( s . get ( nx )