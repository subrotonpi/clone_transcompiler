public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] s = new String [ n ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) s [ i ] = input . substring ( 0 , 4 ) ;
  int d = 24 * 60 + 1 ;
  int [ ] t = new int [ d ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    int a = Integer . parseInt ( s [ i ] . substring ( 0 , 4 ) ) ;
    int b = Integer . parseInt ( s [ i ] . substring ( 5 ) ) ;
    if ( a % 10 < 5 ) a -= a % 10 ;
    else if ( 5 < a % 10 ) a -= a % 10 - 5 ;
    if ( 0 < b % 10 < 5 ) b += 5 - b % 10 ;
    else if ( b % 10 > 5 ) b += 10 - b % 10 ;
    a = ( a / 100 ) * 60 + a % 100 ;
    b = ( b / 100 ) * 60 + b % 100 ;
    t [ a ] ++ ;
    t [ b ] -- ;
  }
  for ( int i = 1 ;
  i < d ;
  i ++ ) t [ i ] += t [ i - 1 ] ;
  int a = 0 ;
  while ( a < d ) {
    while ( a < d ) {
      if ( t [ a ] > 0 ) break ;
      else a ++ ;
    }
    else break ;
    int b = a ;
    while ( b < d ) {
      if ( t [ b ] == 0 ) break ;
      else b ++ ;
    }
    int x = ( a / 60 ) * 100 + a % 60 + 10000 ;
    int y = ( b / 60 ) * 100 + b % 60 + 10000 ;
    StringBuilder sb = new StringBuilder ( String . valueOf ( x ) ) ;
    sb . append ( "-" ) ;
    sb . append ( String . valueOf ( y ) ) ;
    System . out . println ( sb . toString ( ) ) ;
    a = b + 1 ;
  }
}
