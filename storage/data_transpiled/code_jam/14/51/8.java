static final String getUpperCaseName ( ) throws IOException {
  final String className = "java.util.concurrent.atomic.Scanner" ;
  if ( className . equals ( "java.util.concurrent.atomic.Scanner" ) ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      final String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    final int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      final int N = Integer . parseInt ( br . readLine ( ) ) ;
      final int p = Integer . parseInt ( br . readLine ( ) ) ;
      final int q = Integer . parseInt ( br . readLine ( ) ) ;
      final int r = Integer . parseInt ( br . readLine ( ) ) ;
      final int s = Integer . parseInt ( br . readLine ( ) ) ;
      final int [ ] transistors = new int [ N ] ;
      for ( int i = xrange ( N ) ;
      i < transistors . length ;
      i ++ ) {
        transistors [ i ] = ( transistors [ i ] ) % r + s ;
      }
      final int total = Integer . parseInt ( transistors [ _T ] ) ;
      final int [ ] sums = new int [ N ] ;
      int t = 0 ;
      for ( int i = xrange ( N ) ;
      i < transistors . length ;
      i ++ ) {
        sums [ i ] = t ;
        t += transistors [ i ] ;
      }
      sums [ _T ] = t ;
      assert t == total ;
    }
    {
      final double needed = ( 1 - p ) * total ;
      for ( int i = xrange ( N - 1 , 0 , - 1 ) ;
      i < transistors . length ;
      i ++ ) {
        if ( sums [ i ] <= needed ) break ;
      }
      {
        final int j = xrange ( N - 1 , i - 1 , - 1 ) ;
        if ( sums [ j + 1 ] - sums [ i ] <= needed ) break ;
      }
      final int i = xrange ( N - 1 , i , - 1 ) ;
      if ( total - sums [ j + 1 ] <= needed ) return true ;
    }
    {
      final double needed = ( 1 - p ) * total ;
      for ( int j = xrange ( N - 1 , i , - 1 ) ;
      j ++ )