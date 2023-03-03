public static void print ( int n ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( l , Collections . reverseOrder ( ) ) ;
  l [ 0 ] = l [ 0 ] / 2 ;
  System . out . println ( Arrays . toString ( l ) ) ;
}
