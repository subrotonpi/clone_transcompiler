static final String print ( ) {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int N = Integer . parseInt ( br . readLine ( ) ) ;
  final int M = Integer . parseInt ( br . readLine ( ) ) ;
  final int S = Integer . parseInt ( br . readLine ( ) ) ;
  final List < Integer > [ ] edges = new ArrayList [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int u = Integer . parseInt ( br . readLine ( ) ) ;
    final int v = Integer . parseInt ( br . readLine ( ) ) ;
    edges [ u ] . add ( v ) ;
    edges [ v ] . add ( u ) ;
  }
  Queue < Integer > queue = new LinkedList < Integer > ( ) ;
  queue . add ( new Integer ( - S ) ) ;
  visited = new boolean [ N + 1 ] ;
  queue . add ( visited ) ;
  result . add ( S ) ;
  return result . toString ( ) ;
}
