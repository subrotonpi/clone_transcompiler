static final double [ ] [ ] getPoints ( ) {
  int xs = Integer . parseInt ( input . nextLine ( ) ) ;
  int ys = Integer . parseInt ( input . nextLine ( ) ) ;
  int xg = Integer . parseInt ( input . nextLine ( ) ) ;
  int yg = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] c = new int [ n ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    c [ i ] [ n ] = Math . max ( Math . sqrt ( Math . abs ( xs - x ) * Math . abs ( xs - x ) + Math . abs ( ys - y ) * Math . abs ( ys - y ) ) - r , 0 ) ;
    c [ i ] [ n + 1 ] = x ;
    c [ i ] [ n + 1 ] = y ;
  }
  double [ ] dp = new double [ n + 1 ] ;
  dp [ 0 ] = 0 ;
  int [ ] used = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    double a = Double . MAX_VALUE ;
    int b = - 1 ;
    for ( int j = 0 ;
    j < n + 1 ;
    j ++ ) {
      if ( used [ j ] ) continue ;
      if ( a > dp [ j ] ) {
        a = dp [ j ] ;
        b = j ;
      }
    }
    used [ b ] = 1 ;
    int g = b ;
    final int x = c [ b ] ;
    final int y = c [ b ] ;
    for ( int j = 0 ;
    j < n + 1 ;
    j ++ ) {
      if ( used [ j ] ) continue ;
      final int x2 = c [ j ] ;
      final int y2 = c [ j ] ;
      final int r2 = c [ j ] ;
      double ima = dp [ g ] + Math . max ( 0 , Math . sqrt ( Math . abs ( x2 - x ) * Math . abs ( y2 - y ) * Math . abs ( r2 ) - r ) - r2 ) ;
      if ( ima < dp [ j ] ) dp [ j ] = ima ;
    }
  }
  double ans = Double . MAX_VALUE