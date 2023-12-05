@ VisibleForTesting static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  final long Inf = 10000000000 ;
  List < List < Integer >> Edge = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Edge . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    Edge . get ( l - 1 ) . add ( new Integer ( r - 1 ) ) ;
    Edge . get ( r - 1 ) . add ( new Integer ( l - 1 ) ) ;
  }
  Node = new ArrayList < > ( ) ;
  Node . add ( Inf ) ;
  boolean Possible = true ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ! Possible ) {
      break ;
    }
    else if ( Node . get ( i ) == Inf ) {
      Node . set ( i , 0 ) ;
      Queue < Integer > Q = new LinkedList < > ( ) ;
      Q . add ( i ) ;
      Q . add ( i ) ;
      while ( Q . size ( ) > 0 ) {
        int now = Q . poll ( ) ;
        for ( int e : Edge . get ( now ) ) {
          if ( Node . get ( e ) == Inf ) {
            Node . set ( e , now + e ) ;
            Q . add ( e ) ;
          }
          else if ( Node . get ( now + e ) != Node . get ( e ) ) {
            Possible = false ;
            break ;
          }
        }
      }
    }
  }
  System . out . println ( Possible ? "Yes" : "No" ) ;
}
