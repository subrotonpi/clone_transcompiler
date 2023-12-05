static final int [ ] [ ] getNegativeInstances ( ) {
  final int n = Integer . parseInt ( input . readLine ( ) ) ;
  final int a = Integer . parseInt ( input . readLine ( ) ) ;
  final int b = Integer . parseInt ( input . readLine ( ) ) ;
  final int [ ] [ ] ll = new int [ 401 ] [ 401 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < 401 ;
    j ++ ) {
      ll [ i ] [ j ] = - 1 ;
    }
  }
  ll [ 0 ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int ap = Integer . parseInt ( input . readLine ( ) ) ;
    final int bp = Integer . parseInt ( input . readLine ( ) ) ;
    final int price = Integer . parseInt ( input . readLine ( ) ) ;
    for ( int aa = 0 ;
    aa < 390 ;
    aa ++ ) {
      for ( int bb = 0 ;
      bb < 390 ;
      bb ++ ) {
        if ( ll [ aa ] [ bb ] >= 0 ) {
          if ( ll [ aa + ap ] [ bb + bp ] < 0 ) {
            ll [ aa + ap ] [ bb + bp ] = 99999 ;
          }
          ll [ aa + ap ] [ bb + bp ] = Math . min ( ll [ aa + ap ] [ bb + bp ] , ll [ aa ] [ bb ] + price ) ;
        }
      }
    }
  }
  int ret = 9999999 ;
  for ( int aa = 0 ;
  aa < 401 ;
  aa ++ ) {
    for ( int bb = 1 ;
    bb < 401 ;
    bb ++ ) {
      if ( Math . abs ( ( double ) aa / bb - ( double ) a / b ) < 0.001 && ll [ aa ] [ bb ] > 0 ) {
        ret = Math . min ( ret , ll [ aa ] [ bb ] ) ;
      }
    }
  }
  if ( ret > 900000 ) {
    System . out . println ( "-1" ) ;
  }
  else {
    System . out . println ( ret ) ;
  }
  return ll ;
}
