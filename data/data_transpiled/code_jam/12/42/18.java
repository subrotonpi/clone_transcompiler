static final List < Integer > getInts ( ) throws IOException {
  final List < Integer > ints = new ArrayList < > ( ) ;
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String line ;
  while ( ( line = br . readLine ( ) ) != null ) {
    for ( String word : line . split ( " " ) ) {
      ints . add ( Integer . parseInt ( word ) ) ;
    }
  }
  return ints ;
  final List < Double > doubles = new ArrayList < > ( ) ;
  final int T = ( int ) ints . size ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    final int N = ( int ) ints . get ( t ) ;
    final int W = ( int ) ints . get ( t ) ;
    final int L = ( int ) ints . get ( t ) ;
    final List < Integer > R = new ArrayList < > ( N * 2 ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int a = ( int ) ints . get ( t ) ;
      R . set ( i , new Integer ( a ) ) ;
    }
    Collections . sort ( R ) ;
    final int [ ] pos = new int [ N ] ;
    final List < Integer > lanes = new ArrayList < > ( ) ;
    final int [ ] clane = {
      0 , W , 0 }
      ;
      while ( R . size ( ) > 0 ) {
        final int r = R . remove ( 0 ) ;
        final int p = r ;
        while ( true ) {
          if ( clane [ 2 ] <= L ) break ;
          clane = lanes . remove ( 0 ) ;
          final int lup = up ( r ) ;
          if ( clane [ 1 ] > clane [ 0 ] + lup ) {
            lanes . add ( clane [ 0 ] + lup , clane [ 1 ] , clane [ 2 ] ) ;
            clane [ 1 ] = clane [ 0 ] + lup ;
          }
          pos [ p ] = new int [ ] {
            clane [ 0 ] , clane [ 2 ] }
            ;
            clane [ 2 ] += 2 * r ;
          }
          System . out . print ( "Case #" + ( t + 1 ) + ":" ) ;
          for ( int i = 0 ;
          i < N ;
          i ++ ) {
            System . out . print ( '' + pos [ i ] [ 0 ] + " ' + pos [ i ] [