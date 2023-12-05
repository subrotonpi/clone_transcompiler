public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  {
    Set < Integer > s = new HashSet < > ( ) ;
    for ( int i = 1 ;
    i <= ( int ) ( n * ( 1 / 2 ) ) ;
    i ++ ) {
      if ( n % i == 0 ) {
        s . add ( n / i ) ;
        s . add ( i ) ;
      }
    }
    return s . size ( ) ;
  }
  int sumNum = Integer . parseInt ( input . nextLine ( ) ) - N ;
  if ( sumNum < N ) {
    System . out . println ( "Deficient" ) ;
  }
  else if ( sumNum > N ) {
    System . out . println ( "Abundant" ) ;
  }
  else {
    System . out . println ( "Perfect" ) ;
  }
  return N ;
}
