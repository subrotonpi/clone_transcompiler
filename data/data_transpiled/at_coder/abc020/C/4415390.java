public static int findMin ( int x , int si , int sj , int ti , int tj , String s ) {
  int [ ] [ ] dist = new int [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) dist [ si ] [ sj ] = 0 ;
  int H = s . length ( ) ;
  int W = s . charAt ( 0 ) . length ( ) ;
  boolean updated = true ;
  while ( updated ) {
    updated = false ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        int c = s . charAt ( i ) == '#' ? x : 1 ;
        for ( int dx = ( 1 ) , dy = ( 0 ) ;
        dx < ( 1 ) ;
        dx ++ , dy ++ ) {
          int ii = i + dx ;
          int jj = j + dy ;
          if ( 0 <= ii && ii < 10 && 0 <= jj && dist [ i ] [ j ] > dist [ ii ] [ jj ] + c ) {
            dist [ i ] [ j ] = dist [ ii ] [ jj ] + c ;
            updated = true ;
          }
        }
      }
    }
  }
  return dist [ ti ] [ tj ] ;
}
