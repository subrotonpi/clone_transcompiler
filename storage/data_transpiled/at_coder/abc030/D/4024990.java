public static int N ( int a , int N ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > bList = new LinkedList < Integer > ( ) ;
  bList . add ( N ) ;
  bList . add ( 0 ) ;
  List < Integer > visit = new ArrayList < Integer > ( ) ;
  visit . add ( a ) ;
  int target = a ;
  do {
    if ( visit . contains ( bList . get ( target ) ) ) {
      break ;
    }
    else {
      target = bList . get ( target ) ;
      visit . add ( target ) ;
    }
  }
  while ( true ) ;
  int last = bList . get ( target ) ;
  int index = visit . indexOf ( last ) ;
  if ( visit . size ( ) - index <= K ) {
    K -= index ;
    K %= visit . size ( ) - index ;
    System . out . println ( visit . get ( K + index ) ) ;
  }
  else {
    System . out . println ( visit . get ( K ) ) ;
  }
  return N ;
}
