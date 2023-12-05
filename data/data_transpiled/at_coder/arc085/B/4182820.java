public static void main ( String [ ] args ) {
  int n , z , w ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a = Arrays . copyOf ( a , a . length ) ;
  int sx = 0 ;
  int sMin = 0 ;
  int sMax = Math . abs ( a [ n ] - a [ n - 1 ] ) ;
  for ( int i = n - 1 ;
  i > 0 ;
  i -- ) {
    sx = Math . max ( sMax , Math . abs ( a [ n ] - a [ i - 1 ] ) ) ;
    int sy = Math . min ( sMin , Math . abs ( a [ n ] - a [ i - 1 ] ) ) ;
    sMax = Math . max ( sMax , sy ) ;
    sMin = Math . min ( sMin , sx ) ;
  }
  System . out . println ( sx ) ;
}
