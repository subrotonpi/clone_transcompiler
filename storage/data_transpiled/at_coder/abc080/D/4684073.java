public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] STC = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    STC [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( STC ) ;
  int [ ] [ ] R = new int [ 3 ] [ ] ;
  R [ 0 ] = new int [ ] {
    STC [ 0 ] [ 1 ] , STC [ 0 ] [ 2 ] }
    ;
    for ( int i = 1 ;
    i < STC . length ;
    i ++ ) {
      int s = STC [ i ] [ 0 ] , t = STC [ i ] [ 1 ] , c = STC [ i ] [ 2 ] ;
      for ( int j = 0 ;
      j < R . length ;
      j ++ ) {
        int t_r = R [ j ] [ 0 ] , c_r = R [ j ] [ 1 ] ;
        if ( c == c_r && t_r <= s ) {
          R [ j ] = new int [ ] {
            t , c }
            ;
            break ;
          }
          if ( c != c_r && t_r < s ) {
            R [ j ] = new int [ ] {
              t , c }
              ;
              break ;
            }
          }
        }
        System . out . println ( R . length ) ;
        return R . length ;
      }
      