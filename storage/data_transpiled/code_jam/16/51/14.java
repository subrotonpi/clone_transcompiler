@ VisibleForTesting static void solve ( final String filepath ) throws IOException {
  final boolean verbose = true ;
  {
    final String S = inputFile . readString ( ) ;
  }
  final int [ ] readInts ( ) ;
  final HashMap < String , Integer > mem = new HashMap < > ( ) ;
  final int [ ] read = new int [ s . length ( ) ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    read [ i ] = Integer . parseInt ( s . substring ( i , i + 1 ) ) ;
  }
  final float [ ] read = new float [ s . length ( ) ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    read [ i ] = Float . parseFloat ( s . substring ( i + 1 ) ) ;
  }
  final int [ ] read = mem . get ( s [ 0 ] ) ;
  if ( read [ s . length ( ) ] != 0 ) {
    read [ s . length ( ) ] = 0 ;
  }
  if ( read [ s . length ( ) ] != 0 ) {
    read [ s . length ( ) ] = 0 ;
  }
  final int start = read [ s . length ( ) ] ;
  int i = 1 ;
  int best = 0 ;
  while ( i < s . length ( ) ) {
    final int end = read [ s . length ( ) ] ;
    int tot = 0 ;
    if ( start == end ) {
      tot += 10 ;
    }
    else {
      tot += 5 ;
    }
    tot += calculate [ s . length ( ) ] ;
    tot += calculate [ s . length ( ) ] ;
    if ( tot > best ) {
      best = tot ;
    }
    i += 2 ;
  }
  mem . put ( s , best ) ;
}
