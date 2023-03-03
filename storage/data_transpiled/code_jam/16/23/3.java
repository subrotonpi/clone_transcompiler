@ GwtIncompatible ( "java.util.concurrent.atomic.map.Map<Integer,String>" ) private static int runExample ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int T = input . nextInt ( ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    final int n = input . nextInt ( ) ;
    final String [ ] A = new String [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      A [ i ] = ( "0" + A [ i ] ) ;
    }
    final Graph < Integer , String > G = new Graph < Integer , String > ( ) ;
    final Set < String > first = new HashSet < String > ( ) ;
    final Set < String > second = new HashSet < String > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final String a = A [ i ] ;
      final String b = A [ i ] ;
      G . addEdge ( a , b , true ) ;
      first . add ( a ) ;
      second . add ( b ) ;
    }
    for ( final String f : first ) {
      G . addEdge ( "start" , f , true ) ;
    }
    for ( final String s : second ) {
      G . addEdge ( s , "dest" , true ) ;
    }
    final int [ ] [ ] F = new int [ n ] [ ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      F [ i ] [ 0 ] = F [ i ] [ 1 ] ;
    }
    int count = 0 ;
    for ( final String a : A ) {
      final String b = A [ i ] ;
      if ( F [ i ] [ 0 ] > 0 ) {
        if ( first . contains ( a ) ) first . remove ( a ) ;
        if ( second . contains ( b ) ) second . remove ( b ) ;
        count ++ ;
      }
    }
    return A . length - ( first . size ( ) + second . size ( ) + count ) ;
  }
  final int T = input . nextInt ( ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    final int n = input . nextInt ( ) ;
    final String [ ] A = new String [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      A [ i ] = input . next ( ) ;
    }
    System . out . println ( "Case #" + t + ": " + go