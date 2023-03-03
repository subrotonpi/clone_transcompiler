public static int reg ( int i , int j , int [ ] [ ] grid , int [ ] [ ] boxes , int [ ] [ ] toys ) throws IOException {
  int [ ] curBoxes = boxes [ i ] . clone ( ) ;
  int [ ] curToys = toys [ j ] . clone ( ) ;
  if ( curBoxes [ 0 ] == curToys [ 0 ] ) {
    int matches = Math . min ( curBoxes [ 1 ] , curToys [ 1 ] ) ;
    curBoxes [ 1 ] -= matches ;
    curToys [ 1 ] -= matches ;
    if ( curBoxes [ 1 ] != 0 ) {
      return matches + part ( curBoxes , true , i + 1 , j + 1 , grid , boxes , toys ) ;
    }
    else if ( curToys [ 1 ] != 0 ) {
      return matches + part ( curToys , false , i + 1 , j + 1 , grid , boxes , toys ) ;
    }
    else {
      return matches + grid [ i + 1 ] [ j ] ;
    }
  }
  File inFile = new File ( "C-large.in" ) ;
  File outFile = new File ( "box.out" ) ;
  int T = Integer . parseInt ( inFile . readLine ( ) ) ;
  for ( int n = 1 ;
  n < T ;
  n ++ ) {
    int M = Integer . parseInt ( inFile . readLine ( ) ) ;
    boxes = new int [ M ] ;
    toys = new int [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      boxes [ i ] [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      toys [ i ] = Integer . parseInt ( inFile . readLine ( ) ) ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      toys [ i ] = Integer . parseInt ( inFile . readLine ( ) ) ;
    }
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      toys [ i ] = Integer . parseInt ( inFile . readLine ( ) ) ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      toys [ i ] = Integer . parseInt ( inFile . readLine ( ) ) ;
    }
    for ( int j = M ;
    j < M ;
    j ++ ) {
      toys [ i ] = Integer . parseInt ( inFile . readLine ( ) ) ;
    }
  }
  return matches + part ( curBoxes , false , i +