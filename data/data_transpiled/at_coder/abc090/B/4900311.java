public static void print ( String input ) {
  int a = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  int b = Integer . parseInt ( input . substring ( 1 , b ) ) ;
  String [ ] num = new String [ b ] ;
  for ( int n = a ;
  n <= b ;
  n ++ ) {
    num [ n ] = String . valueOf ( n ) ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < num . length ;
  i ++ ) {
    int hantei = 0 ;
    for ( int j = 0 ;
    j < num [ i ] . length ( ) / 2 ;
    j ++ ) {
      if ( num [ i ] . charAt ( j ) == num [ i ] [ num [ i ] . length ( ) - ( j + 1 ) ] ) {
        hantei ++ ;
      }
    }
    if ( hantei == num [ i ] . length ( ) / 2 ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
