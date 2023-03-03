public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = input . nextLine ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String res = "" ;
    for ( int j = s . length - 1 ;
    j >= 0 ;
    j -- ) res += s [ j ] ;
    System . out . println ( res ) ;
  }
}
