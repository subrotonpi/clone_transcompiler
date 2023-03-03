public static int [ ] getDistance ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( x ) ;
  int [ ] distance = new int [ x . length - 1 ] ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) {
    distance [ i ] = x [ i + 1 ] - x [ i ] ;
  }
  Arrays . sort ( distance ) ;
  int ans = Arrays . copyOfRange ( distance , n - 1 , distance . length ) ;
  System . out . println ( ans ) ;
  return ans ;
}
