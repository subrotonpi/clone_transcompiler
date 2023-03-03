static final int C = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int c : xrange ( C ) ) {
  int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int B = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int X = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int V = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  if ( K == 0 ) {
    System . out . println ( "Case #" + ( c + 1 ) + ": 0" ) ;
    continue ;
  }
  ArrayList < Integer > good = new ArrayList < Integer > ( ) ;
  for ( int i : xrange ( N ) ) if ( V * T >= B - X ) good . add ( i ) ;
  if ( good . size ( ) < K ) {
    System . out . println ( "Case #" + ( c + 1 ) + ": IMPOSSIBLE" ) ;
    continue ;
  }
  int len = good . size ( ) - K ;
  int G = 0 ;
  for ( int g : xrange ( 1 , len ) ) G += g * ( len - good . get ( g ) - 1 - 1 ) ;
  G += ( N - good . get ( len - 1 ) - 1 ) * len ;
  System . out . println ( "Case #" + ( c + 1 ) + ": " + G ) ;
}
