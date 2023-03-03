static final class StreamReaderTest extends StreamReaderTest ( ) {
  int t , N , C ;
  int [ ] a ;
  int [ ] B ;
  int time ;
  int [ ] B1 ;
  int [ ] B2 ;
  {
    int L = ( int ) ( System . in . read ( ) & 0xFF ) ;
    int t = ( int ) ( System . in . read ( ) & 0xFF ) ;
    int N = ( int ) ( System . in . read ( ) & 0xFF ) ;
    int C = ( int ) ( System . in . read ( ) & 0xFF ) ;
    a = new int [ C ] ;
    for ( int i = 0 ;
    i < C ;
    i ++ ) a [ i ] = sr / Integer . MAX_VALUE ;
    A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) A [ i ] = a [ i % C ] ;
    time = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( time <= t && time + A [ i ] * 2 > t ) {
        float f = ( t - time ) / 2 ;
        float s = A [ i ] - f ;
        A [ i ] = f ;
        A [ i ] = s ;
        A [ i ] = i + 1 ;
        i ++ ;
        break ;
      }
      time += A [ i ] * 2 ;
    }
    A0 = A [ 0 ] ;
    B = A [ i ] ;
    Arrays . sort ( B ) ;
    B1 = B ;
    B2 = new int [ B . length - L ] ;
    System . arraycopy ( B , 0 , B1 , 0 , B . length ) ;
    time = 0 ;
    for ( int i = A0 . length ;
    i < B1 . length ;
    i ++ ) time += A0 [ i ] * 2 ;
    for ( int i = 0 ;
    i < B2 . length ;
    i ++ ) time += B2 [ i ] ;
    System . out . println ( "Case #" + ( tc + 1 ) + ":" + time ) ;
  }
  return new StreamReaderTest ( ) ;
}
