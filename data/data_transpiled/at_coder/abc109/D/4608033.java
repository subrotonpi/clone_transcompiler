public static void main ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , input . indexOf ( ' ' ) ) ) ;
  int w = Integer . parseInt ( input . substring ( input . indexOf ( ' ' ) + 1 , input . indexOf ( ' ' ) ) ) ;
  int [ ] [ ] amap = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < amap . length ;
  i ++ ) {
    amap [ i ] = new int [ w ] ;
    for ( int j = 0 ;
    j < amap [ i ] . length ;
    j ++ ) {
      amap [ i ] [ j ] = Integer . parseInt ( input . substring ( i , j + 1 ) ) ;
    }
    int n = 0 ;
    Vector mv = new Vector ( ) ;
    for ( int i = 0 ;
    i < amap [ i ] . length ;
    i ++ ) {
      int [ ] alist = amap [ i ] [ j ] ;
      for ( int j = 0 ;
      j < alist . length ;
      j ++ ) {
        if ( i == amap . length - 1 && j == alist . length - 1 ) break ;
        if ( i % 2 == 0 ) {
          if ( amap [ i ] [ j ] % 2 == 1 ) {
            amap [ i ] [ j ] -- ;
            if ( j == alist . length - 1 ) {
              amap [ i + 1 ] [ j ] ++ ;
              mv . add ( new Vector ( i + 1 , j + 1 , i + 2 , j + 1 ) ) ;
            }
            else {
              amap [ i ] [ j + 1 ] ++ ;
              mv . add ( new Vector ( i + 1 , j + 1 , i + 1 , j + 2 ) ) ;
            }
            n ++ ;
          }
        }
        else if ( i % 2 == 1 ) {
          if ( amap [ i ] [ amap [ i ] . length - j - 1 ] % 2 == 1 ) {
            amap [ i ] [ amap [ i ] . length - j - 1 ] -- ;
            if ( j == alist . length - 1 ) {
              amap [ i + 1 ] [ 0 ] ++ ;
              mv . add ( new Vector ( i + 1 , 1 , i + 2 , 1 ) ) ;
            }
            else {
              amap [ i ] [ amap [ i ] . length - j - 2 ] ++ ;
              mv . add ( new Vector ( i + 1 , alist