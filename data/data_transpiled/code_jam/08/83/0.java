static private long compute ( Scanner input ) {
  final long MOD = 1000000009 ;
  long res ;
  {
    if ( num <= 0 ) return 1 ;
    if ( fr <= 0 ) return 0 ;
    prod = 1 ;
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      prod *= fr - i ;
      prod = prod % MOD ;
    }
    return prod ;
  }
  {
    long compute ( n , k , v , links , used , level ) ;
    used [ v ] = true ;
    int root = - 1 ;
    for ( int i = 0 ;
    i < links [ v ] . length ;
    i ++ ) {
      if ( used [ i ] ) {
        root = links [ v ] [ i ] . length ;
        level [ v ] = level [ i ] + 1 ;
      }
    }
    if ( level [ v ] < 0 ) level [ v ] = 0 ;
    int colorsLeft = k ;
    if ( level [ v ] >= 1 ) colorsLeft -= links [ root ] . length ;
    int subtrees = links [ v ] . length ;
    if ( level [ v ] >= 1 ) subtrees -- ;
    res = binom ( subtrees , colorsLeft ) % MOD ;
    for ( int i = 0 ;
    i < links [ v ] . length ;
    i ++ ) {
      if ( links [ v ] [ i ] != root ) {
        res = ( res * compute ( n , k , i , links , used , level ) ) % MOD ;
      }
    }
    return res ;
  }
  {
    String line [ ] = input . nextLine ( ) . split ( "\\s+" ) ;
    n = Integer . parseInt ( line [ 0 ] ) ;
    k = Integer . parseInt ( line [ 1 ] ) ;
    links = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      links . add ( new ArrayList < > ( ) ) ;
    }
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      line = input . nextLine ( ) . split ( "\\s+" ) ;
      links . get ( Integer . parseInt ( line [ 0 ] ) - 1 ) . add ( Integer . parseInt ( line [ 1 ] ) - 1 ) ;
      links . get ( Integer . parseInt ( line [ 0 ] ) - 1 ) . add ( Integer . parseInt ( line [ 1 ] ) - 1 ) ;
    }
    used = new boolean [ n ] ;
    level = new int [ n ] ;
    res = compute ( n , k , 0 , links , used