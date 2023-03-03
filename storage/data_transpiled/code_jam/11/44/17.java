@ VisibleForTesting static String solve ( String [ ] args ) throws IOException {
  String infile = args [ 0 ] ;
  String [ ] [ ] indata = Files . readAllLines ( infile ) ;
  int numcases = Integer . parseInt ( indata [ 0 ] . trim ( ) ) ;
  String [ ] [ ] lines = Arrays . copyOfRange ( indata , 1 , indata . length ) ;
  /* solve the P and W */
  Graph g = new Graph ( ) ;
  g . addNodes ( new int [ ] {
    0 , P }
    ) ;
    for ( int i = 0 ;
    i < Ws . length ;
    i ++ ) {
      g . addEdge ( Ws [ i ] ) ;
    }
    Map < Integer , Integer > distance = Maps . newHashMap ( ) ;
    Map < Integer , Boolean > visited = Maps . newHashMap ( ) ;
    Map < Integer , Set < Integer >> previous = Maps . newHashMap ( ) ;
    for ( int i = 0 ;
    i < G . nodes ( ) . length ;
    i ++ ) {
      distance . put ( G . nodes ( ) [ i ] , Integer . MAX_VALUE ) ;
      visited . put ( G . nodes ( ) [ i ] , Boolean . FALSE ) ;
    }
    distance . put ( 0 , 0 ) ;
    int current = 0 ;
    while ( true ) {
      for ( int i = 0 ;
      i < g . neighbors ( current ) . size ( ) ;
      i ++ ) {
        if ( distance . get ( current ) + 1 < distance . get ( i ) ) {
          distance . put ( i , distance . get ( current ) + 1 ) ;
          previous . put ( g . nodes ( ) [ i ] , new HashSet < > ( ) ) ;
        }
        else if ( distance . get ( current ) + 1 == distance . get ( i ) ) {
          previous . get ( g . nodes ( ) [ i ] ) . add ( current ) ;
        }
      }
      visited . put ( current , Boolean . TRUE ) ;
      if ( Stream . of ( visited . values ( ) ) . anyMatch ( x -> ! x . equals ( x ) ) ) {
        break ;
      }
      else {
        Set < Integer > unvisited = Maps . newTreeSet ( visited . keySet ( ) ) ;
        unvisited . forEach ( x -> {
          if ( visited . get ( x ) == false ) {
            return distance . get ( x ) ;
          }
        }
        ) ;
        current = unvisited . iterator ( ) . next ( ) ;
      }
    }
    String [ ] paths = new String