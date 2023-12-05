static final int MAX_LEN = 100 ;
{
  int length ;
  int i ;
  switch ( length ) {
    case 1 : i = leading ;
    while ( i < 10 && i * i <= sumLeft ) {
      yield String . valueOf ( i ) ;
      ++ i ;
    }
    break ;
    case 2 : i = leading ;
    while ( i < 10 && 2 * i * i <= sumLeft ) {
      yield String . valueOf ( i ) + String . valueOf ( i ) ;
      ++ i ;
    }
    break ;
    default : i = leading ;
    while ( i < 10 && 2 * i * i <= sumLeft ) {
      for ( i = length - 2 ;
      i <= maxLen ;
      ++ i ) {
        yield ( String . valueOf ( i ) + p + i ) ;
      }
      ++ i ;
    }
    break ;
  }
  /* generate all of the numbers */
  length = 1 ;
  for ( length = 1 ;
  length <= maxLen / 2 ;
  length ++ ) {
    for ( int p = 0 ;
    p < length ;
    ++ p ) {
      yield ( String . valueOf ( i ) + p + i ) ;
    }
    ++ i ;
  }
  List < Integer > fairAndSquare = new LinkedList < Integer > ( ) ;
  for ( int p = 0 ;
  p < length ;
  ++ p ) {
    fairAndSquare . add ( Integer . valueOf ( p ) * p ) ;
  }
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  testCase ++ ) {
    int A = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int B = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int answer = fairAndSquare . stream ( ) . mapToInt ( pp -> A <= pp && pp <= B ) . sum ( ) ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + answer ) ;
  }
  return 0 ;
}
