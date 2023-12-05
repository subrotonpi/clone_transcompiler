static private final Scanner solve ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final Class < ? extends Graph > bipG = Graph . class ;
  {
    int numVerts = scanner . nextInt ( ) ;
    scanner . nextLine ( ) ;
    int i ;
    int num ;
    int [ ] colors = new int [ numVerts ] ;
    scanner . nextLine ( ) ;
    int numCases = scanner . nextInt ( ) ;
    for ( i = 0 ;
    i < numCases ;
    i ++ ) {
      runAlgo ( scanner , i , colors ) ;
    }
  }
  {
    scanner . nextLine ( ) ;
    int numCases = scanner . nextInt ( ) ;
    for ( int i = 0 ;
    i < numCases ;
    i ++ ) {
      runAlgo ( scanner , i , colors ) ;
    }
  }
  {
    scanner . nextLine ( ) ;
    int num ;
    for ( int i = 0 ;
    i < numCases ;
    i ++ ) {
      colors [ i ] = scanner . nextInt ( ) ;
    }
    for ( int i = 0 ;
    i < numCases ;
    i ++ ) {
      colors [ i ] = scanner . nextInt ( ) ;
    }
    return scanner ;
  }
  private void solveGraph ( Graph g ) {
    for ( int numColors = Math . min ( scanner . nextInt ( ) , scanner . nextInt ( ) ) ;
    numColors > 0 ;
    numColors -- ) {
      for ( int possibleColoring : new int [ numColors ] ;
      i < numColors ;
      i ++ ) {
        if ( checkSol ( scanner , possibleColoring , numColors ) ) {
          return ;
        }
      }
    }
  }
  private boolean inPartAOf ( int v , int u , int w ) {
    if ( u < v ) return inPartAOf ( u , v , w ) ;
    if ( ( v < w ) && ( w < u ) ) return true ;
    return false ;
  }
  private void buildGraph ( Graph g , List < Pair < Integer , Integer >> inputPairs ) {
    for ( int i = 0 ;
    i < inputPairs . size ( ) ;
    i ++ ) {
      int u = inputPairs . get ( i ) . first ;
      int v = inputPairs . get ( i ) . second ;
      for ( Pair < Integer , Integer > r : g . rooms ) {
        if ( r . first == u && r . first == v ) {
          g . rooms . remove ( r ) ;
          Set < Integer > leftPart = new HashSet < Integer > ( ) ;
          Set < Integer > rightPart = new HashSet < Integer > ( ) ;
          for ( int w