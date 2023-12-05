public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  a = Arrays . copyOf ( a , a . length ) ;
  a . sort ( ) ;
  System . out . println ( Arrays . toString ( a ) . substring ( a . length ( ) - k ) ) ;
}
