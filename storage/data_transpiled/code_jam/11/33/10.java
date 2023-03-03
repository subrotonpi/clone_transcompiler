static final int [ ] [ ] solve ( int [ ] [ ] x ) {
  int t = Integer . parseInt ( x [ 0 ] [ 0 ] ) ;
  for ( int tt = 0 ;
  tt < t ;
  tt ++ ) {
    int n = Integer . parseInt ( x [ 0 ] [ 0 ] ) ;
    int l = Integer . parseInt ( x [ 0 ] [ 1 ] ) ;
    int h = Integer . parseInt ( x [ 0 ] [ 1 ] ) ;
    int [ ] o = x [ 0 ] ;
    boolean b = false ;
    for ( int i = l ;
    i <= h ;
    i ++ ) {
      boolean a = true ;
      for ( int j = 0 ;
      j < o . length ;
      j ++ ) {
        if ( o [ j ] [ 0 ] % i != 0 && i % o [ j ] [ 1 ] != 0 ) {
          a = false ;
          break ;
        }
      }
      if ( a == true ) {
        System . out . println ( "Case #" + ( tt + 1 ) + ": " + i ) ;
        b = true ;
        break ;
      }
    }
    if ( b == false ) {
      System . out . println ( "Case #" + ( tt + 1 ) + ": NO" ) ;
    }
  }
  return x ;
}
