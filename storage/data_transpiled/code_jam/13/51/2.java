public static double get ( Scanner rl ) {
  int cases = Integer . parseInt ( rl . nextLine ( ) ) ;
  int c ;
  int candidates = Integer . parseInt ( rl . nextLine ( ) ) ;
  int candidates = candidates - candidates ;
  for ( int cc = 0 ;
  cc < candidates ;
  cc ++ ) {
    int budget = Integer . parseInt ( rl . nextLine ( ) ) ;
    int bets = Integer . parseInt ( rl . nextLine ( ) ) ;
    Arrays . sort ( placed ) ;
    if ( override > 0 ) {
      Arrays . sort ( partial , 0 , - override ) ;
    }
    int onlyMine = 37 - placed . length ;
    int lowestCnt = onlyMine + partial . length ;
    if ( lowestCnt == 0 ) return 0 ;
    double ret = 0.0 ;
    ret += lowest * 36.0 * onlyMine / ( double ) lowestCnt ;
    for ( int p : partial ) ret += 36.0 * ( lowest - p ) * 1.0 / lowestCnt ;
    return ret ;
  }
  for ( int cc = 0 ;
  cc < candidates ;
  cc ++ ) {
    int budget = Integer . parseInt ( rl . nextLine ( ) ) ;
    int bets = Integer . parseInt ( rl . nextLine ( ) ) ;
    Arrays . sort ( placed ) ;
    Arrays . sort ( bets ) ;
    double ret = 0.0 ;
    List < Integer > queue = new ArrayList < > ( ) ;
    queue . add ( 1 ) ;
    queue . add ( placed . length - 1 ) ;
    for ( int p : placed ) {
      queue . add ( p - 1 ) ;
    }
    Set < Integer > set = new TreeSet < > ( ) ;
    set . add ( queue . size ( ) ) ;
    Set < Integer > set = new HashSet < > ( set ) ;
    while ( queue . size ( ) > 0 ) {
      int lowest = set . remove ( queue . size ( ) - 1 ) ;
      if ( lowest == 0 ) continue ;
      int neededBudget = ( 37 - placed . length ) * lowest ;
      for ( int p : placed ) neededBudget += Math . max ( 0 , lowest - p ) ;
      if ( budget < neededBudget ) continue ;
      int remainingBudget = budget - neededBudget ;
      int partial = Integer . parseInt ( rl . nextLine ( ) ) ;
      int lowestCnt = 37 - placed . length + partial ;
      if ( lowestCnt == 0 ) continue ;
      int larger = Arrays . binarySearch ( placed , lowest ) ;
      int canReplicate ;
      if ( canReplicate > 0 ) {
        if ( ! set . contains (