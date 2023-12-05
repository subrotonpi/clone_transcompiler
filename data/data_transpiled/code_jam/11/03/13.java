public static void xrange ( Scanner input ) {
  int n = input . nextInt ( ) ;
  int [ ] c = ArrayUtil . toIntArray ( input . nextLine ( ) . split ( " " ) ) ;
  String a = "Case #" + ( testCase + 1 ) + ": " ;
  if ( Stream . of ( c ) . anyMatch ( x -> x ^ x ) ) {
    a += "NO" ;
  }
  else {
    a += Integer . toString ( c . length - Math . min ( c . length , n ) ) ;
  }
  System . out . println ( a ) ;
}
