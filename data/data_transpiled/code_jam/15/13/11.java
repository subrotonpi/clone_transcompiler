static final Scanner fin = new Scanner ( new File ( "C-large.in" ) ) {
  final PrintWriter fout = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  final int t = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int count = 1 ;
  count <= t ;
  count ++ ) {
    final int n = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int [ ] [ ] pts = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i <= n ;
    i ++ ) {
      pts [ i ] = new int [ n ] ;
      for ( String s : fin . nextLine ( ) . split ( " " ) ) {
        pts [ i ] [ 0 ] = Integer . parseInt ( s ) ;
      }
    }
    fout . println ( "Case #" + count + ":" ) ;
    for ( int current = 0 ;
    current <= n ;
    current ++ ) {
      final Point [ ] angle = new Point [ n - 1 ] ;
      for ( int i = 0 ;
      i <= n ;
      i ++ ) {
        if ( i == current ) continue ;
        final double xdis = pts [ i ] [ 0 ] - pts [ current ] [ 0 ] ;
        final double ydis = pts [ i ] [ 1 ] - pts [ current ] [ 1 ] ;
        final double answer = Math . asin ( ydis / Math . hypot ( xdis , ydis ) ) ;
        if ( xdis < 0 ) answer = Math . PI - answer ;
        if ( i < current ) angle [ i ] = new Point ( answer , xdis , ydis ) ;
        else angle [ i - 1 ] = new Point ( answer , xdis , ydis ) ;
      }
      final int [ ] sorted = angle ;
      int tail = 1 ;
      int result = n - 1 ;
      if ( n < 3 ) {
        fout . println ( "0\n" ) ;
        continue ;
      }
      for ( int head = 0 ;
      head <= n - 1 ;
      head ++ ) {
        while ( angle [ head ] . y * angle [ tail ] . z - angle [ head ] . y * angle [ tail ] . y > 0 ) {
          tail = ( tail + 1 ) % ( n - 1 ) ;
        }
        if ( tail > head && result > tail - head - 1 ) {
          result = tail - head - 1 ;
        }
        else if ( tail <= head && result > tail + n - 1 - head - 1 ) {
          result =