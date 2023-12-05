public static void main ( String [ ] args ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] data = new int [ a ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    data [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( data ) ;
  data [ data . length - 1 ] = data [ data . length - 1 ] / 2 ;
  System . out . println ( Arrays . toString ( data ) ) ;
}
