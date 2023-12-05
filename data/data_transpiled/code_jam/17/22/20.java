@ VisibleForTesting static String getImplementation ( ) {
  final int N = ints ( ) . intValue ( ) ;
  final int R = ints ( ) . intValue ( ) ;
  final int O = ints ( ) . intValue ( ) ;
  final int Y = ints ( ) . intValue ( ) ;
  final int G = ints ( ) . intValue ( ) ;
  final int B = ints ( ) . intValue ( ) ;
  final int V = ints ( ) . intValue ( ) ;
  final Map < String , Integer > init = Collections . singletonMap ( R , O ) ;
  final int Bh = B - O ;
  final int Yh = Y - V ;
  final int Rh = R - G ;
  if ( B == O && B + O == N ) return "BO" . substring ( N / 2 ) ;
  if ( Y == V && Y + V == N ) return "YV" . substring ( N / 2 ) ;
  if ( R == G && R + G == N ) return "RG" . substring ( N / 2 ) ;
  final String IMPOSSIBLE = "IMPOSSIBLE" ;
  if ( Math . min ( Bh , Yh , Rh ) < 0 ) return IMPOSSIBLE ;
  if ( O == N && ! Bh ) return IMPOSSIBLE ;
  if ( V == N && ! Yh ) return IMPOSSIBLE ;
  if ( G == N && ! Rh ) return IMPOSSIBLE ;
  final Map < String , Integer > h = Collections . singletonMap ( B , Yh ) ;
  final List < Integer > big = new ArrayList < Integer > ( h . keySet ( ) ) ;
  big . sort ( ( k , v ) -> - h . get ( k ) ) ;
  final Map < String , Integer > contra = Collections . singletonMap ( R , 'G' ) ;
  final Map < String , Integer > avail = Collections . unmodifiableMap ( init ) ;
  final StringBuilder buf = new StringBuilder ( ) ;
  {
    final int i = 0 ;
    for ( int k = 0 ;
    k < big . size ( ) ;
    k ++ ) {
      buf . append ( i ) ;
      avail . put ( k , -- i ) ;
    }
    {
      buf . append ( ' ' ) ;
    }
  }
  ;
  for ( int i = 0 ;
  i < big . size ( ) ;
  i ++ ) {
    buf . append ( big . get ( i ) ) ;
  }
  if ( avail . containsKey ( contra . get ( contra . get ( i ) )