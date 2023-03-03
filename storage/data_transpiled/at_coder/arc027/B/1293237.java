public static final int [ ] getStrengthSquare ( ) {
  final String beet = "" ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final String s = input . nextLine ( ) ;
  final String t = input . nextLine ( ) ;
  final int [ ] data = new int [ 36 ] ;
  {
    int i = - 1 ;
  }
  {
    int x ;
    int y ;
    int i ;
    int a ;
    int b ;
    int i ;
    int x ;
    int y ;
    int i ;
    int x ;
    int y ;
    int y ;
    /* find the first char at the end of the end of the string */
    if ( data [ i ] < 0 ) return i ;
    data [ i ] = find ( data [ i ] ) ;
    /* unite the first char at the end of the string */
    x = data [ i ] ;
    y = data [ i ] ;
    if ( x == y ) return i ;
    data [ i ] += data [ i ] ;
    data [ i ] = x ;
  }
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    a = beet . indexOf ( s . charAt ( i ) ) ;
    b = beet . indexOf ( t . charAt ( i ) ) ;
    /* unite the first char at the end of the string */
    unite ( a , b ) ;
  }
  int [ ] solid = new int [ 36 ] ;
  solid [ 36 ] = 0 ;
  solid [ 36 ] = 2 ;
  solid [ 36 ] = 2 ;
  for ( i = 0 ;
  i < 10 ;
  i ++ ) {
    solid [ 36 ] = 1 ;
  }
  int ret = 1 ;
  for ( i = 10 ;
  i < 36 ;
  i ++ ) {
    if ( s . indexOf ( beet . charAt ( i ) ) == - 1 && t . indexOf ( beet . charAt ( i ) ) == - 1 ) continue ;
    if ( solid [ 36 ] == 1 ) {
      ret *= 9 ;
    }
    else {
      ret *= 10 ;
    }
    solid [ 36 ] = 1 ;
  }
  System . out . println ( ret ) ;
  return solid ;
}
