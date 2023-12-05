@ VisibleForTesting static int [ ] solve ( int [ ] components ) {
  final long MOD = 1000000007 ;
  int [ ] component = new int [ components . length ] ;
  int ret = 1 ;
  for ( int i : xrange ( 2 , components . length + 1 ) ) {
    ret *= components [ i ] ;
    ret %= MOD ;
  }
  return component ;
  /* int toIndex = (int) - (int) ('a' - int) ; */
  /* solve the list of trains */
  final Set < Integer > middle = new HashSet < > ( ) ;
  final Set < Integer > has = new HashSet < > ( ) ;
  final Map < Integer , Integer > homoCount = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < components . length ;
  i ++ ) {
    adj . put ( 0 , 0 ) ;
  }
  for ( int i = 0 ;
  i < components . length ;
  i ++ ) {
    final int cc = Integer . parseInt ( rl ( ) ) ;
    final int n = Integer . parseInt ( rl ( ) . trim ( ) ) ;
    trains = new String ( rl ( ) ) . split ( " " ) ;
    ret = solve ( trains ) ;
    System . out . println ( String . format ( "Case #%d: %d" , cc + 1 , ret ) ) ;
  }
  /* solve the trains */
  final int [ ] middle = new int [ 26 ] ;
  for ( int i = 0 ;
  i < trains . length ;
  i ++ ) {
    final int c = Integer . parseInt ( rl ( ) ) ;
    final int n = Integer . parseInt ( rl ( ) ) ;
    final int [ ] trains = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      trains [ i ] = trains [ i ] ;
      if ( t [ i ] != t [ 0 ] && t [ t . length - 1 ] != i ) {
        middle [ i ] = toIndex ( t [ i ] ) ;
      }
    }
    if ( new HashSet < > ( ) . size ( ) == 1 ) {
      homoCount . put ( toIndex ( t [ 0 ] ) , ++ ret ) ;
    }
    for ( int i = 0 ;
    i < trains . length - 1 ;
    i ++ ) {
      if ( t [ i ] != t [ i + 1 ] ) {
        int