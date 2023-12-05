static HashMap < Integer , Integer > computed = new HashMap < Integer , Integer > ( ) {
  private int prefixLenReal ( String s1 , String s2 ) {
    int i = 0 ;
    while ( i < s1 . length ( ) && i < s2 . length ( ) && s1 . charAt ( i ) == s2 . charAt ( i ) ) {
      i ++ ;
    }
    return i ;
  }
  private int prefixLen ( String s1 , String s2 ) {
    int i ;
    String key = ( s1 == null || s1 . length ( ) == 0 ) ? s2 : s1 . substring ( i ) ;
    if ( ! computed . containsKey ( key ) ) {
      computed . put ( key , prefixLenReal ( s1 , s2 ) ) ;
    }
    return computed . get ( key ) ;
  }
  private static void prefixLen ( String s1 , String s2 ) {
    int i ;
    String [ ] t ;
    {
      int [ ] [ ] t = new String [ 2 ] [ ] ;
      int numNodes = 0 ;
      {
        if ( t [ 0 ] == null ) numNodes ++ ;
        int maxPrefixLen = 0 ;
        for ( String [ ] hs : t ) {
          maxPrefixLen = Math . max ( maxPrefixLen , prefixLen ( hs , s ) ) ;
        }
        t [ 0 ] = s ;
        numNodes += s . length ( ) - maxPrefixLen ;
      }
    }
    private static void solve ( ) {
      int m = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
      int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
      int [ ] S = new int [ n ] ;
      for ( i = 0 ;
      i < xrange ;
      i ++ ) S [ i ] = readLine ( ) . trim ( ) ;
      int worstNumNodes = - 1 ;
      int numCases = 0 ;
      for ( int IT = 0 ;
      IT < n * m ;
      IT ++ ) {
        Trie [ ] servers = new Trie [ n ] ;
        for ( int i = 0 ;
        i < xrange ;
        i ++ ) {
          servers [ i ] = new Trie ( ) ;
        }
        int t = IT ;
        for ( int i = 0 ;
        i < xrange ;
        i ++ ) {
          int serverId = t % n ;
          t /= n ;
          servers [ serverId ] . add ( S [ i ] ) ;
        }
        int numNodes = 0 ;
        for ( int i = 0 ;
        i < xrange ;
        i ++ ) numNodes += servers [ i ] . numNodes ;
        if ( numNodes > worstNumNodes ) {
          worstNumNodes = numNodes ;
          numCases = 1