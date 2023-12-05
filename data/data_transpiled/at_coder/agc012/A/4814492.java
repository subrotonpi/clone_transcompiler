public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  l . add ( Integer . parseInt ( input ) ) ;
  l . sort ( Collections . reverseOrder ( ) ) ;
  System . out . println ( Arrays . toString ( l . subList ( 1 , 2 * n ) ) ) ;
}
