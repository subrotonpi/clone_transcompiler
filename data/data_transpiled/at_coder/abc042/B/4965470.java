static void print ( int n , int l ) {
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) s [ i ] = input ( ) ;
  Arrays . sort ( s ) ;
  System . out . println ( Arrays . toString ( s ) ) ;
}
