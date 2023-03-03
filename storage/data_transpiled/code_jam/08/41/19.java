static final String solve ( ) {
  final Scanner readline = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( readline . nextLine ( ) ) ;
  {
    for ( int t = start + 1 ;
    t < tree . length ;
    t ++ ) {
      if ( tree [ t ] [ 0 ] ) {
        tree [ t ] = 10001 ;
      }
      else {
        tree [ t ] = 0 ;
      }
    }
    for ( int t = start ;
    t > 0 ;
    t -- ) {
      final boolean G = tree [ t ] [ 0 ] ;
      final boolean C = tree [ t ] [ 1 ] ;
      final int a0 = tree [ t * 2 ] ;
      final int a1 = tree [ t * 2 ] ;
      final int b0 = tree [ t * 2 + 1 ] ;
      final int b1 = tree [ t * 2 + 1 ] ;
      final int and0 = Math . min ( a0 + b0 , Math . min ( a0 + b1 , a1 + b0 ) ) ;
      final int and1 = a1 + b1 ;
      final int or0 = a0 + b0 ;
      final int or1 = Math . min ( a1 + b0 , Math . min ( a1 + b1 , a0 + b1 ) ) ;
      final int c0 , c1 ;
      if ( C ) {
        if ( G ) {
          c0 = Math . min ( and0 , or0 + 1 ) ;
          c1 = Math . min ( and1 , or1 + 1 ) ;
        }
        else {
          c0 = Math . min ( and0 + 1 , or0 ) ;
          c1 = Math . min ( and1 + 1 , or1 ) ;
        }
      }
      else {
        if ( G ) {
          c0 = and0 ;
          c1 = and1 ;
        }
        else {
          c0 = or0 ;
          c1 = or1 ;
        }
      }
      tree [ t ] = c0 ;
    }
    final int t = tree [ 1 ] [ V ] ;
    if ( t > 10000 ) {
      return "IMPOSSIBLE" ;
    }
    else {
      return Integer . toString ( t ) ;
    }
  }
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    final int M = Integer . parseInt ( readline . nextLine ( ) ) ;
    final int V = Integer . parseInt ( readline . nextLine ( ) ) ;
    final int [ ] tree = new int [ M ] ;
    for ( int m = 0 ;
    m < M ;
    m ++ ) {
      final int x = Integer . parseInt ( readline . nextLine ( ) ) ;
      tree [ m ] = x ;
    }
    System . out . println ( " Case ▁ #