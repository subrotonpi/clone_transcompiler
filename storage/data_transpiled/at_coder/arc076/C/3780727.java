public static int [ ] inpl ( ) {
  return Arrays . stream ( input . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int R = inpl ( ) ;
  int C = inpl ( ) ;
  int N = inpl ( ) ;
  IntStack loopx = new IntStack ( ) ;
  IntStack loopy = new IntStack ( ) ;
  IntStack loopx = new IntStack ( ) ;
  IntStack loopy = new IntStack ( ) ;
  IntStack loopy = new IntStack ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x1 = inpl ( ) ;
    int y1 = inpl ( ) ;
    int x2 = inpl ( ) ;
    int y2 = inpl ( ) ;
    if ( ( x1 == 0 || x1 == R || y1 == C ) && ( x2 == 0 || x2 == R || y2 == C ) ) {
      if ( x1 == 0 || x1 == R ) loopx . push ( new IntStack ( y1 ) ) ;
      else if ( y1 == 0 || y1 == C ) loopy . push ( new IntStack ( x1 ) ) ;
      if ( x2 == 0 || x2 == R ) loopx . push ( new IntStack ( y2 ) ) ;
      else if ( y2 == 0 || y2 == C ) loopy . push ( new IntStack ( x2 ) ) ;
    }
  }
  List < Integer > loop = new ArrayList < Integer > ( ) ;
  loop . add ( loopy . peek ( ) ) ;
  loop . add ( loopx . peek ( ) ) ;
  loop . add ( loopy . peek ( ) ) ;
  loop . add ( loopx . peek ( ) ) ;
  loop . add ( loopy . peek ( ) ) ;
  Stack < Integer > stack = new Stack < Integer > ( ) ;
  for ( int i = 0 ;
  i < loop . size ( ) ;
  i ++ ) {
    if ( stack . isEmpty ( ) ) {
      stack . push ( i ) ;
      continue ;
    }
    if ( stack . peek ( ) == i ) {
      stack . pop ( ) ;
    }
    else {
      stack . push ( i ) ;
    }
  }
  if ( stack . isEmpty ( ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return loop . toArray ( new Integer [ 0 ] ) ;
}
