@ Test public static void _3 ( ) {
  /* can pair two strings */
  List < List < Integer >> l = new ArrayList < List < Integer >> ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    char c1 = s1 [ i ] ;
    char c2 = s2 [ i ] ;
    List < Integer > c = new ArrayList < Integer > ( ) ;
    c . add ( c1 ) ;
    c . add ( c2 ) ;
    if ( l . contains ( c ) ) {
      l . remove ( c ) ;
    }
    else {
      l . add ( c ) ;
    }
  }
  if ( s1 . size ( ) % 2 == 0 ) {
    return l . size ( ) == 0 ;
  }
  else {
    /* print "YES" */
  }
  /* pair graph */
  int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( s1 [ i ] == s2 [ j ] && s1 [ j ] == s2 [ i ] ) {
        G [ i ] [ j ] = 1 ;
        G [ j ] [ i ] = 1 ;
      }
    }
  }
  /* print "NO" */
  final int H = Integer . parseInt ( input ( ) ) ;
  final int W = Integer . parseInt ( input ( ) ) ;
  final String [ ] S = new String [ H ] ;
  final Map < String , Integer > map = new TreeMap < String , Integer > ( ) ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    final String s = input ( ) ;
    S [ h ] = s ;
    map . put ( StringUtil . join ( S , " " ) , h ) ;
  }
  final int [ ] alreadyPaired = new int [ H ] ;
  final List < List < Integer >> Gs = new ArrayList < List < Integer >> ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    if ( alreadyPaired [ i ] != 0 ) continue ;
    for ( int j = i + 1 ;
    j < H ;
    j ++ ) {
      if ( alreadyPaired [ j ] != 0 ) continue ;
      if ( canPair ( S [ i ] , S [ j ] ) ) {
        alreadyPaired [ i ] = 1 ;
        alreadyPaired [ j ] = 1 ;
        G =