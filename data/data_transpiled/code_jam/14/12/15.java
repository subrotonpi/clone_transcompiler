private static boolean isBinaryTree ( Map < String , List < Integer >> tree , Set < String > deleted ) {
  boolean isValid = true ;
  boolean hasRoot = false ;
  for ( String node : tree . keySet ( ) ) {
    if ( ! deleted . contains ( node ) ) {
      int count = 0 ;
      for ( String node2 : tree . get ( node ) ) {
        if ( ! deleted . contains ( node2 ) ) {
          count ++ ;
        }
      }
      if ( count == 2 ) {
        if ( ! hasRoot ) {
          hasRoot = true ;
        }
        else {
          isValid = false ;
          break ;
        }
      }
      else if ( count == 1 || count == 3 ) {
        continue ;
      }
      else {
        isValid = false ;
        break ;
      }
    }
  }
  if ( isValid && hasRoot ) {
    List < Integer > all = new ArrayList < Integer > ( ) ;
    List < Integer > queue = new ArrayList < Integer > ( ) ;
    List < String > visited = new ArrayList < String > ( ) ;
    for ( String node : tree . keySet ( ) ) {
      if ( ! deleted . contains ( node ) ) {
        all . add ( node ) ;
      }
    }
    queue . add ( all . get ( 0 ) ) ;
    while ( queue . size ( ) > 0 ) {
      String node = queue . remove ( 0 ) ;
      visited . add ( node ) ;
      for ( String node2 : tree . get ( node ) ) {
        if ( ! visited . contains ( node2 ) && ! deleted . contains ( node2 ) && ! deleted . contains ( node2 ) ) {
          queue . add ( node2 ) ;
        }
      }
      System . out . println ( ) ;
      return new ArrayList < Integer > ( visited ) . equals ( all ) ;
    }
    else {
      return false ;
    }
  }
  try {
    File file = new File ( "B.in" ) ;
    File f2 = new File ( "B.out" ) ;
    BufferedReader br = new BufferedReader ( new FileReader ( file ) ) ;
    String output = "" ;
    int currentLine = 1 ;
    int caseNumber = 1 ;
    while ( currentLine < br . readLine ( ) . length ( ) ) {
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      List < String > edges = br . readLine ( ) . split ( "\\s+" ) ;
      currentLine += N ;
      if ( N == 1 ) {
        possible = 0 ;
      }
      else if ( N == 2 ) {
        System . out . println ( edges ) ;
        possible = 1 ;
      }
      else {
        tree . clear ( ) ;
        for ( int x = 1