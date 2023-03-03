@ Test public static void _3 ( ) {
  /* can pair the first two integers of the second two integers */
  List < Integer > l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    char c1 = s1 [ i ] ;
    char c2 = s2 [ i ] ;
    ArrayList < Integer > c = new ArrayList < > ( ) ;
    c . add ( c1 ) ;
    c . add ( c2 ) ;
    if ( l . contains ( c ) ) {
      l . remove ( i ) ;
      l . remove ( j ) ;
      if ( l . size ( ) == 0 ) return true ;
    }
    else {
      l . add ( c ) ;
    }
  }
  if ( s1 . size ( ) % 2 == 0 ) {
    return l . size ( ) == 0 ;
  }
  else {
    if ( l . size ( ) == 1 ) {
      if ( l . get ( 0 ) . intValue ( ) == l . get ( 0 ) . intValue ( ) ) return true ;
    }
    return false ;
  }
  /* pair the second two integers */
  int N = s1 . size ( ) ;
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
  final int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] S = new String [ H ] ;
  Map < String , Integer > map = new TreeMap < > ( ) ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    String s = input . nextLine ( ) ;
    S [ h ] = s ;
    map . put ( s . toString ( ) , h ) ;
  }
  int [ ] alreadyPaired = new int [ H ] ;
  List < Integer > Gs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    if ( alreadyPaired [ i ] != 0 ) continue ;
    for ( int j = i + 1 ;
    j < H ;
    j ++ ) {
      