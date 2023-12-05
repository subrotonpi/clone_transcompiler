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
    HashMap < Character , List < Integer >> indices = new HashMap < > ( ) ;
    for ( char c : asciiLowercaseChars ) {
      indices . put ( c , new ArrayList < > ( ) ) ;
    }
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      indices . get ( s . charAt ( i ) ) . add ( i ) ;
    }
    int n = s . length ( ) ;
    int center = n / 2 ;
    int [ ] bubbles = new int [ n ] ;
    boolean odFlag = false ;
    List < Integer > lefts = new ArrayList < > ( ) , rights = new ArrayList < > ( ) ;
    boolean [ ] used = new boolean [ n ] ;
    for ( Entry < Character , List < Integer >> entry : indices . entrySet ( ) ) {
      int c = entry . getKey ( ) ;
      List < Integer > ids = entry . getValue ( ) ;
      int cnt = ids . size ( ) ;
      if ( cnt & 1 != 0 ) {
        if ( odFlag ) return - 1 ;
        odFlag = true ;
        bubbles [ ids . get ( cnt / 2 ) ] = center + 1 ;
        used [ center ] = true ;
      }
      for ( int i = 0 ;
      i < cnt / 2 ;
      i ++ ) {
        int li = ids . get ( i ) , ri = ids . get ( ids . size ( ) - i - 1 ) ;
        if ( li < center ) {
          lefts . add ( new Integer ( li ) ) ;
          used [ n - li - 1 ] = true ;
        }
        else {
          rights . add ( new Integer ( li ) ) ;
        }
      }
    }
    Collections . sort ( lefts ) ;
    Collections . sort ( rights ) ;
    Iterator < Integer > rItr = rights . iterator ( ) ;
    for ( int i = lefts . size ( ) ;
    i < center ;
    i ++ ) {
      int li