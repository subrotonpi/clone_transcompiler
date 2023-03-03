@ VisibleForTesting static int [ ] solve ( int N , int M , String [ ] A , String [ ] B ) throws IOException {
  final HashMap < Integer , Integer > cache = new HashMap < Integer , Integer > ( ) ;
  return bestToyCount ( A , B , 0 , 0 , A [ 0 ] , A [ 1 ] , B [ 0 ] , B [ 1 ] , A . length , B . length , cache ) ;
  /* Use the options to parse the input */
  final String inputFile = "file" ;
  final int totalCases = Integer . parseInt ( inputFile ) ;
  int caseNumber = 0 ;
  while ( ( caseNumber ++ ) < totalCases ) {
    final int dataArgs = parseCase ( inputFile ) ;
    System . out . println ( "Case #" + ( caseNumber ) + ": " + solve ( ( String ) dataArgs ) ) ;
  }
  if ( className . equals ( "main" ) ) {
    main ( ) ;
  }
  int toys = 0 ;
  int newToys = 0 ;
  final int nextAI = ai + 2 ;
  final int nextBI = bi + 2 ;
  if ( ( at == bt ) && ( nextAI < la ) ) {
    if ( al < bl ) {
      newToys = al ;
      if ( nextAI < la ) {
        newToys += bestToyCount ( A , B , nextAI , bi , A [ nextAI ] , A [ nextAI + 1 ] , bl - al , bt , la , lb , cache ) ;
      }
    }
    else {
      newToys = bl ;
      if ( nextBI < lb ) {
        newToys += bestToyCount ( A , B , ai , nextBI , al - bl , at , B [ nextBI ] , B [ nextBI + 1 ] , la , lb , cache ) ;
      }
    }
    cache . put ( cacheIndex , newToys ) ;
    return toys ;
  }
  else {
    int potA ;
    if ( nextAI < la ) {
      potA = bestToyCount ( A , B , nextAI , bi , A [ nextAI ] , A [ nextAI + 1 ] , bl , bt , la , lb , cache ) ;
    }
    else {
      potA = 0 ;
    }
    if ( nextBI < lb ) {
      potB = bestToyCount ( A , B , ai , nextBI , al , at , B [ nextBI ] , B [ nextBI + 1 ] ,