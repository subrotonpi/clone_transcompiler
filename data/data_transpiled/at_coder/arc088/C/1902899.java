@ GwtIncompatible ( "java.util.BitSet" ) public static int [ ] solve ( final int n ) {
  class Bit {
    int [ ] tree = new int [ n + 1 ] ;
    int sum = 0 ;
    int i ;
    int s = 0 ;
    while ( i > 0 ) {
      sum += tree [ i ] ;
      i -= i & - i ;
    }
    return sum ;
  }
  void add ( int i , int x ) {
    while ( i <= size ) {
      tree [ i ] += x ;
      i += i & - i ;
    }
  }
  int [ ] solve ( String s ) {
    final HashMap < Character , List < Integer >> indices = new HashMap < > ( ) ;
    for ( char c : asciiToLowerCaseCode ( s ) ) {
      indices . put ( c , new ArrayList < > ( ) ) ;
    }
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      indices . get ( s . charAt ( i ) ) . add ( i ) ;
    }
    final int n = s . length ( ) ;
    final int center = n / 2 ;
    final BitSet bubbles = new BitSet ( n ) ;
    boolean odFlag = false ;
    final List < Pair > pairs = new ArrayList < > ( ) ;
    for ( Map . Entry < Character , List < Integer >> entry : indices . entrySet ( ) ) {
      final int c = entry . getKey ( ) ;
      final List < Integer > ids = entry . getValue ( ) ;
      final int cnt = ids . size ( ) ;
      if ( ( cnt & 1 ) != 0 ) {
        if ( odFlag ) return - 1 ;
        odFlag = true ;
        bubbles . set ( ids . get ( cnt / 2 ) , center + 1 ) ;
      }
      for ( int i = 0 ;
      i < cnt / 2 ;
      i ++ ) {
        final int li = ids . get ( i ) , ri = ids . get ( ids . size ( ) - i - 1 ) ;
        pairs . add ( new Pair ( li , ri ) ) ;
      }
    }
    Collections . sort ( pairs ) ;
    for ( int i = 0 ;
    i < pairs . size ( ) ;
    i ++ ) {
      final int li = pairs . get ( i ) ;
      final int ri = pairs . get ( i ) ;
      bubbles . set ( li , i + 1 ) ;
      bubbles . set ( ri , n - i ) ;
    }
    int ans = 0 ;
    final Bit bit = new Bit ( n ) ;
    for ( int