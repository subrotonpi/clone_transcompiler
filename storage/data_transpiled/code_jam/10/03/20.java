public static final Scanner getScanner ( ) {
  final Scanner inputFile = new Scanner ( System . in ) ;
  final int count = Integer . parseInt ( inputFile . nextLine ( ) ) ;
  for ( int lineno = xrange ( 1 , count + 1 ) ;
  lineno <= N ;
  lineno ++ ) {
    final int R = Integer . parseInt ( inputFile . nextLine ( ) ) ;
    final int k = Integer . parseInt ( inputFile . nextLine ( ) ) ;
    final int N = Integer . parseInt ( inputFile . nextLine ( ) ) ;
    final int [ ] groups = Integer . parseInt ( inputFile . nextLine ( ) ) ;
    final Map < Integer , Integer > transitions = new HashMap < Integer , Integer > ( ) ;
    for ( int gi : xrange ( groups . length ) ) {
      int people = 0 ;
      int curgi = gi ;
      while ( curgi < gi + groups . length ) {
        final int curGroup = groups [ curgi % groups . length ] ;
        if ( people + curGroup > k ) {
          break ;
        }
        people += curGroup ;
        curgi ++ ;
      }
      final int next = curgi % groups . length ;
      final int money = people ;
      transitions . put ( gi , new Integer ( next ) ) ;
    }
    final Map < Integer , Integer > state = new HashMap < Integer , Integer > ( ) ;
    int curgi = 0 ;
    int money = 0 ;
    int i = 0 ;
    while ( i < R ) {
      final int next = transitions . get ( curgi ) ;
      final int newmoney = 0 ;
      if ( state . containsKey ( curgi ) ) {
        final int loopStartMoney = state . get ( curgi ) ;
        final int loopStartDistance = state . get ( curgi ) ;
        final int moneyMade = money - loopStartMoney ;
        final int distance = i - loopStartDistance ;
        final int loops = ( R - i ) / distance ;
        money += loops * moneyMade ;
        i += loops * distance ;
        state . clear ( ) ;
        continue ;
      }
      else {
        state . put ( curgi , money , i ) ;
        money += newmoney ;
        curgi = next ;
        i ++ ;
      }
    }
    System . out . println ( "Case #" + lineno + ":" ) ;
    System . out . println ( money ) ;
  }
  return new Scanner ( inputFile ) ;
}
