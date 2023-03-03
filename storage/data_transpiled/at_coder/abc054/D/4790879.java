public static double [ ] [ ] n ( int n , int a , int b ) {
  int [ ] [ ] d = new int [ 401 ] [ 401 ] ;
  int [ ] [ ] h = new int [ n ] [ 401 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] s = new int [ 401 ] ;
    int [ ] c = d . clone ( ) ;
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( d [ p ] [ q ] != 0 ) {
      d [ p ] [ q ] = Math . min ( r , c [ p ] [ q ] ) ;
    }
    else {
      s [ 0 ] = {
        p , q }
        ;
        d [ p ] [ q ] = r ;
      }
      Arrays . sort ( h ) ;
      for ( int j = h . length - 1 ;
      j >= 0 ;
      j -- ) {
        if ( h [ j ] [ 0 ] + p < 401 && h [ j ] [ 1 ] + q < 401 ) {
          if ( c [ h [ j ] [ 0 ] + p ] [ h [ j ] [ 1 ] + q ] != 0 ) {
            d [ h [ j ] [ 0 ] + p ] [ h [ j ] [ 1 ] + q ] = Math . min ( r + c [ h [ j ] [ 0 ] ] [ h [ j ] [ 1 ] ] , d [ h [ j ] [ 0 ] + p ] [ h [ j ] [ 1 ] + q ] ) ;
          }
          else {
            s [ j ] = {
              h [ j ] [ 0 ] + p , h [ j ] [ 1 ] + q }
              ;
              d [ h [ j ] [ 0 ] + p ] [ h [ j ] [ 1 ] + q ] = r + c [ h [ j ] [ 0 ] ] [ h [ j ] [ 1 ] ] ;
            }
          }
        }
        else {
          h += s ;
        }
      }
      double c = Double . POSITIVE_INFINITY ;
      int k = 1 ;
      while ( a * k < 401 && b * k < 401 ) {
        if ( d [ a * k ] [ b * k ] != 0 ) {
          c = Math . min ( c , d [ a * k ] [ b * k ] ) ;
        }
        k ++ ;
      }
      return h ;
    }
    