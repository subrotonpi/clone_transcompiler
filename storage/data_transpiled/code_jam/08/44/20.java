static final Scanner readline = new Scanner ( System . in ) {
  private final int N = Integer . parseInt ( readLine ) ;
  private final String S = readLine ( ) ;
  private final int N = Integer . parseInt ( readLine ( ) ) ;
  private final String [ ] perms = new String [ N ] ;
  private final String [ ] perms = new String [ N ] ;
  {
    if ( li . length <= 1 ) {
      return perms ;
    }
    else {
      for ( int i = 0 ;
      i < perms . length ;
      i ++ ) {
        String p = perms [ i ] ;
        for ( int j = 0 ;
        j < p . length ( ) && j < li . length ( ) ;
        j ++ ) {
          perms [ i ] = p . substring ( 0 , j ) + li [ j ] . substring ( 0 , j ) + p . substring ( i ) ;
        }
      }
    }
  }
  private final int rle ( final String s ) {
    int l = 1 ;
    for ( int i = 1 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( s . charAt ( i ) != s . charAt ( i - 1 ) ) {
        l ++ ;
      }
    }
    return l ;
  }
  private final String [ ] encode ( final String s , final int k , final int [ ] perm ) {
    final List < String > enc = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < s . length ( ) / k ;
    i ++ ) {
      final List < String > block = new ArrayList < String > ( ) ;
      for ( int l = 0 ;
      l < k ;
      l ++ ) {
        block . add ( s . charAt ( i * k + perm [ l ] ) ) ;
      }
      enc . addAll ( block ) ;
    }
    return enc . toArray ( new String [ enc . size ( ) ] ) ;
  }
}
