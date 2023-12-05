private static void solve ( String test ) {
  int n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int o = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int g = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int v = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  for ( int k = 0 ;
  k < vals . length ;
  k ++ ) {
    for ( int j = 0 ;
    j < ans . length ;
    j ++ ) {
      if ( ans [ j ] == lets [ k ] ) {
        ans = ans . substring ( 0 , j ) + subs [ k ] + ans . substring ( j + 1 ) ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . print ( String . format ( "Case #%d: " , i + 1 ) ) ;
    solve ( i ) ;
  }
  if ( g == r && g > 0 ) {
    if ( o != 0 || b != 0 || v != 0 || y != 0 ) {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
    else {
      System . out . println ( "YV" ) ;
    }
    return ;
  }
  if ( ( o >= b && o > 0 ) || ( g >= r && g > 0 ) || ( v >= y && v > 0 ) ) {
    System . out . println ( "IMPOSSIBLE" ) ;
    return ;
  }
  b -= o ;
  r -= g ;
  y -= v ;
  String [ ] [ ] a = {
    {
      b , "B" }
      , {
        r , "R" }
        , {
          y , "Y" }
        }
        ;
        Arrays . sort ( a ) ;
        if ( a [ 1 ] [ 0 ] == 0 ) {
          System . out . println ( "IMPOSSIBLE" ) ;
          return ;
        }
        String ans = "" ;
        for ( int i = 0 ;
        i < a [ 0 ] [ 0 ] ;
        i ++ ) {
          ans += a [ 0 ]