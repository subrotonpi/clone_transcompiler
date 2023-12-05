public static String [ ] [ ] a ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] a = new String [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String city = input . nextLine ( ) ;
    String num = input . substring ( 0 , i ) ;
    a [ i ] [ 0 ] = city ;
  }
  Arrays . sort ( a ) ;
  String ans ;
  if ( ( ( a [ a . length - 1 ] [ 0 ] * 2 ) > Integer . MAX_VALUE ) ) ans = a [ a . length - 1 ] [ 1 ] ;
  else ans = "atcoder" ;
  return ans ;
}
