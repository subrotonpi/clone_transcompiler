public static void main ( String [ ] args ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] data = new int [ a ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    data [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( data ) ;
  int ans = data [ a - b + 1 ] - data [ 0 ] ;
  for ( int i = 0 ;
  i < a - b + 1 ;
  i ++ ) {
    int nowData = data [ i + b - 1 ] - data [ i ] ;
    if ( nowData < ans ) {
      ans = nowData ;
    }
  }
  System . out . println ( ans ) ;
}
