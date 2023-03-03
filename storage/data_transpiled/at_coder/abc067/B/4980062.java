public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  L = [ ] ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) L [ i ] = Integer . parseInt ( input ) ;
  System . out . println ( Arrays . toString ( L ) . substring ( L . length - k , n ) ) ;
}
