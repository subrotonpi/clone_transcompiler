static int [ ] [ ] cost ( int last , int ix , int canins ) {
  final int [ ] [ ] mm = new int [ 256 ] [ 256 ] ;
  int cd = 0 ;
  int ci = 0 ;
  int M = 0 ;
  int N = 0 ;
  int [ ] pixels = new int [ 256 ] ;
  int dist ;
  int best ;
  int kk ;
  if ( ix == N ) return 0 ;
  kk = last + 256 * canins ;
  if ( mm [ ix ] [ kk ] >= 0 ) return mm [ ix ] [ kk ] ;
  if ( ( Math . abs ( last - pixels [ ix ] ) <= M ) && ( mm [ ix ] [ kk ] <= 0 ) ) {
    best = cost ( pixels [ ix ] , ix + 1 , 1 ) ;
  }
  else {
    best = - 1 ;
  }
  if ( canins > 0 && M > 0 ) {
    for ( int i = 0 ;
    i < 256 ;
    i ++ ) {
      dist = Math . abs ( i - last ) ;
      int ins = ( dist + M - 1 ) / M ;
      int th = ins * ci + cost ( i , ix , 0 ) ;
      if ( ( th >= 0 ) && ( best < 0 || th < best ) ) best = th ;
    }
  }
  int th = cd + cost ( last , ix + 1 , 1 ) ;
  if ( ( th >= 0 ) && ( best < 0 ) && ( best < 0 ) ) best = th ;
  for ( int i = 0 ;
  i < 256 ;
  i ++ ) {
    dist = Math . abs ( i - last ) ;
    if ( ( dist <= M ) && ( pixels [ ix ] != 0 ) ) {
      int th = Math . abs ( i - pixels [ ix ] ) + cost ( i , ix + 1 , 1 ) ;
      if ( ( th >= 0 ) && ( best < 0 || th < best ) ) best = th ;
    }
  }
  mm [ ix ] [ kk ] = best ;
  return mm ;
}
String in = System . getProperty ( "line.separator" ) ;
int T = Integer . parseInt ( in . substring ( 0 , in . indexOf ( " " ) ) ) ;
l = 1 ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  final int [ ] ds = Arrays . copyOfRange ( in . substring ( l ) . split ( "\\s+" ) , 0 , in . length ( ) ) ;
  cd = ds [ 0 ] ;
  