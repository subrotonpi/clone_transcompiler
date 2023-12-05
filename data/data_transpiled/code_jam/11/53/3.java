private static boolean check ( int [ ] [ ] a , int n , int m , int i ) {
  Set < Pair > used = new HashSet < > ( ) ;
  for ( int r : xrange ( n ) ) {
    for ( int c : xrange ( m ) ) {
      int [ ] d = a [ r ] [ c ] ;
      if ( ( ( i >> ( r * m + c ) ) & 1 ) == 1 ) {
        d = new int [ ] {
          - d [ 0 ] , - d [ 1 ] }
          ;
        }
        int nr = ( r + d [ 0 ] ) % n , nc = ( c + d [ 1 ] ) % m ;
        if ( used . contains ( new Pair ( nr , nc ) ) ) return false ;
        used . add ( new Pair ( nr , nc ) ) ;
      }
    }
    {
      final int n = Integer . parseInt ( readLine ( ) ) ;
      final int m = Integer . parseInt ( readLine ( ) ) ;
      int [ ] [ ] a = new int [ n ] [ m ] ;
      final int [ ] dirs = {
        '|' , ( 1 << ( n * m ) ) , ( 0 << ( n * m ) ) , ( 1 << ( n * m ) ) , ( 1 << ( m * m ) ) , ( 1 << ( n * m ) ) , ( 1 << ( n * m ) ) , ( 1 << ( n * m ) ) }
        ;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          a [ i ] = new int [ m ] ;
          String s = readLine ( ) ;
          for ( int j = 0 ;
          j < m ;
          j ++ ) {
            a [ i ] [ j ] = dirs [ s . charAt ( j ) ] ;
          }
        }
        int res = 0 ;
        for ( int i = 0 ;
        i < 1 << ( n * m ) ;
        i ++ ) {
          if ( check ( a , n , m , i ) ) res ++ ;
        }
        return res ;
      }
    }
    