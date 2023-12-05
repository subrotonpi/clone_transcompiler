public static double n ( ) {
  double a = Integer . parseInt ( input . nextLine ( ) ) ;
  double b = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] s = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( s ) ;
  double d = s [ s . length - 1 ] ;
  return d ;
}
