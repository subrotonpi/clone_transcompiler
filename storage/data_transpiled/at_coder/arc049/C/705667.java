public static < T > Node < T > create ( ) {
  Node < T > node = new Node < T > ( ) {
    private int inDegree = 0 ;
    private int curInputs = 0 ;
    private final List < T > dest = new ArrayList < T > ( ) ;
    @ Override public String toString ( ) {
      return "inDegree:" + inDegree + ", curInputs:" + curInputs + ", dests:" + dest ;
    }
  }
  ;
  BFS < T > bfs = new BFS < T > ( ) {
    private int N ;
    private int N ;
    private boolean [ ] used ;
    @ Override public int bfs ( List < Pair < T , Integer >> edges , int N , boolean [ ] used ) {
      N = 0 ;
      Node < T > [ ] nodes = new Node [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) nodes [ i ] = new Node < T > ( ) ;
      Queue < Node < T >> que = new LinkedList < Node < T >> ( ) ;
      for ( Pair < T , Integer > e : edges ) {
        nodes [ e . first ] . dest . add ( e . second ) ;
        nodes [ e . second ] . inDegree ++ ;
      }
      while ( que . size ( ) > 0 ) {
        Node < T > n = que . poll ( ) ;
        if ( used [ n ] ) continue ;
        if ( nodes [ n ] . inDegree > nodes [ n ] . curInputs ) continue ;
        ++ ret ;
        used [ n ] = true ;
        for ( T d : nodes [ n ] . dest ) {
          nodes [ n ] . curInputs ++ ;
          que . add ( n ) ;
        }
      }
      return ret ;
    }
  }
  ;
  if ( Class . isEnum ( ) ) {
    @ SuppressWarnings ( "unchecked" ) Class < T > clazz = ( Class < T > ) Class . forName ( "java.util.Arrays$asList" ) ;
    int N = Integer . parseInt ( input ( ) ) ;
    int A = Integer . parseInt ( input ( ) ) ;
    List < Integer > YX = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < A ;
    i ++ ) {
      int x = Integer . parseInt ( input ( ) ) ;
      int y = Integer . parseInt ( input ( ) ) ;
      YX . add ( new Integer ( y - 1 ) ) ;
    }
    List < Integer > UV = new ArrayList < Integer >