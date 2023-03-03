public static void print ( int n ) {
  String [ ] f = new String [ n ] ;
  String [ ] p = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) f [ i ] = input . split ( "\\s+" ) ;
  p [ i ] = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p [ i ] = input . split ( "\\s+" ) ;
  int res = - 10 * 7 * n ;
  for ( int num = 1 ;
  num <= 1024 ;
  num ++ ) {
    int tmp = 0 ;
    for ( int index = 0 ;
    index <= n ;
    index ++ ) {
      tmp += Integer . parseInt ( p [ index ] . substring ( 1 , index ) ) ;
    }
    res = Math . max ( tmp , res ) ;
  }
  System . out . println ( res ) ;
}
