static final void setIn ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  final int li = Integer . parseInt ( stdin . readLine ( ) ) ;
  final int li_ = Integer . parseInt ( stdin . readLine ( ) ) ;
  final float lf = Float . parseFloat ( stdin . readLine ( ) ) ;
  final String ls = stdin . readLine ( ) . split ( " " ) ;
  final String ns = stdin . readLine ( ) . replaceAll ( " " , "" ) ;
  final List < String > lc = new LinkedList < > ( ) ;
  lc . add ( ns ) ;
  lc . add ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  lc . add ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  lc . add ( Float . parseFloat ( stdin . readLine ( ) ) ) ;
  @ SuppressWarnings ( "unchecked" ) final int n = li ;
  final int m = li ;
  final List < Integer > graph = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    graph . add ( i ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    final int a = li_ ++ ;
    final int b = li_ ++ ;
    graph . get ( a ) . add ( b ) ;
    graph . get ( b ) . add ( a ) ;
    path = new ArrayDeque < > ( ) ;
    path . add ( a ) ;
    path . add ( b ) ;
  }
  final Set < Integer > pathSet = new HashSet < > ( ) ;
  path . add ( a ) ;
  int ed = b ;
  boolean satisfied = false ;
  while ( ! satisfied ) {
    satisfied = true ;
    for ( final int nex : graph . get ( ed ) ) {
      if ( pathSet . contains ( nex ) ) {
        continue ;
      }
      else {
        pathSet . add ( nex ) ;
        path . add ( nex ) ;
        ed = nex ;
        satisfied = false ;
        break ;
      }
    }
  }
  final int [ ] path = new int [ path . size ( ) ] ;
  for ( int pi : path ) {
    path [ pi ] = pi + 1 ;
  }
  System . out . println ( path . length ) ;
  System . out . println ( ( char ) path [ 0 ] ) ;
}
