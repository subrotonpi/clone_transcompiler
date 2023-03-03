static void print ( int n , int k ) {
  int [ ] [ ] p = new int [ n ] [ ] , ln = 0 , rn = 0 , l = 0 , r = 0 , ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String x = input . nextLine ( ) ;
    String d = input . nextLine ( ) ;
    p [ i ] = new int [ ] {
      Integer . parseInt ( x ) , d == "L" }
      ;
    }
    if ( p [ 0 ] [ 1 ] > 0 ) l = p [ 0 ] [ 0 ] ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      if ( p [ i ] [ 1 ] > 0 && p [ i + 1 ] [ 1 ] > 0 ) {
        ln ++ ;
        ans += p [ i + 1 ] [ 0 ] - l - ln ;
      }
      else if ( p [ i ] [ 1 ] > 0 ) {
        ans += ( l - r - 1 ) * Math . max ( ln + 1 , rn ) ;
        ln = 0 ;
        rn = 0 ;
      }
      else if ( p [ i + 1 ] [ 1 ] > 0 ) {
        l = p [ i + 1 ] [ 0 ] ;
        r = p [ i ] [ 0 ] ;
        rn ++ ;
      }
      else {
        rn ++ ;
        ans += ( p [ i + 1 ] [ 0 ] - p [ i ] [ 0 ] - 1 ) * rn ;
      }
    }
    if ( n - 1 > 0 ) {
      if ( p [ p . length - 1 ] [ 1 ] > 0 && p [ p . length - 2 ] [ 1 ] > 0 ) ans += ( l - r - 1 ) * Math . max ( ln + 1 , rn ) ;
      else if ( p [ p . length - 1 ] [ 1 ] > 0 ) ans += ( p [ p . length - 1 ] [ 0 ] - r - 1 ) * Math . max ( rn , 1 ) ;
      else ans += ( k - p [ p . length - 1 ] [ 0 ] ) * ( rn + 1 ) ;
    }
    else {
      if ( p [ 0 ] [ 1 ] > 0 ) ans = p [ 0 ] [ 0 ] - 1 ;
      else ans = k - p [ 0 ] [ 0 ] ;
    }
    System . out . println ( ans ) ;
  }
  