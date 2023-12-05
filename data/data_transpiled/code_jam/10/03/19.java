@ VisibleForTesting static int solve ( int R , int k , int N , List < Integer > groups ) {
  int i = 0 ;
  int total = Integer . valueOf ( groups . size ( ) ) ;
  if ( total < k ) {
    return total * R ;
  }
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    int current = groups . get ( i ) ;
    int j = i ;
    do {
      j = ( j + 1 ) % N ;
      int nextg = groups . get ( j ) ;
      if ( ( current + nextg > k ) || ( j == i ) ) {
        break ;
      }
      current += nextg ;
    }
    while ( true ) ;
    map . put ( i , current ) ;
  }
  int money = 0 ;
  int start = 0 ;
  List < Integer > history = new ArrayList < > ( ) ;
  List < Integer > moneyHistory = new ArrayList < > ( ) ;
  for ( i : xrange ( R ) ) {
    history . add ( start ) ;
    moneyHistory . add ( money ) ;
    int dmoney = map . get ( start ) ;
    int dstart = map . get ( start ) ;
    money += dmoney ;
    start = dstart ;
    if ( history . contains ( start ) ) {
      break ;
    }
  }
  else {
    return money ;
  }
  int index = history . indexOf ( start ) ;
  int initmoney = moneyHistory . get ( index ) ;
  int cyclemoney = money - initmoney ;
  int cyclesize = history . size ( ) - index ;
  int numcycles = ( int ) ( ( R - index ) / cyclesize ) ;
  money = initmoney + cyclemoney * numcycles ;
  for ( i : xrange ( R - numcycles * cyclesize - index ) ) {
    int dmoney = map . get ( start ) ;
    int dstart = map . get ( start ) ;
    money += dmoney ;
    start = dstart ;
  }
  return money ;
}
