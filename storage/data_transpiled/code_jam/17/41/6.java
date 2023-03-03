static final String getStdOut ( ) throws IOException {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String line ;
  if ( args . length >= 2 ) {
    final String fn = args [ 1 ] ;
    if ( fn != null ) {
      br . readLine ( ) ;
    }
  }
  System . out . println ( "Case #" + ( _T + 1 ) + ": " + dp [ 0 ] ) ;
  final int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int _T : xrange ( T ) ) {
    final int N = Integer . parseInt ( br . readLine ( ) ) ;
    final int P = Integer . parseInt ( br . readLine ( ) ) ;
    final int G = Integer . parseInt ( br . readLine ( ) ) ;
    final int [ ] dp = new int [ 102 ] ;
    final int [ ] counts = new int [ 4 ] ;
    for ( int g : G ) counts [ g % P ] ++ ;
    dp [ Integer . parseInt ( counts [ 1 ] ) ] = counts [ 0 ] ;
    final int [ ] newcounts = new int [ 4 ] ;
    for ( int newcounts [ 1 ] = xrange ( counts [ 1 ] , - 1 , - 1 ) ;
    newcounts [ 2 ] = xrange ( counts [ 2 ] , - 1 , - 1 ) ;
    newcounts [ 3 ] = xrange ( counts [ 3 ] , - 1 , - 1 ) ) {
      if ( ( newcounts [ 1 ] == counts [ 1 ] ) || ( newcounts [ 2 ] == counts [ 1 ] ) ) continue ;
      final int mod = ( ( counts - newcounts ) * Integer . parseInt ( counts [ 4 ] ) ) ;
      final int idx = Integer . parseInt ( newcounts [ 1 ] ) ;
      if ( ( mod - 1 ) % P == 0 ) dp [ idx ] = Math . max ( dp [ idx ] , dp [ newcounts [ 1 ] + 1 ] , newcounts [ 2 ] , newcounts [ 3 ] + 1 ) ;
      else dp [ idx ] = Math . max ( dp [ idx ] , dp [ newcounts [ 1 ] + 1 ] , newcounts [ 2 ] , newcounts [ 3 ] + 1 ) ;
      if ( ( mod - 2 ) % P == 0 ) dp [ idx ] = Math . max ( dp [ idx ] , dp [ newcounts [ 1 ] ] , newcounts [ 2 ] , newcounts [ 3 ] + 1 ) ;
    }
  }
  