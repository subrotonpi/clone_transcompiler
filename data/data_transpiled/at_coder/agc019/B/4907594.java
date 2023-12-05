public static int getDigits ( ) {
  String a = input . nextLine ( ) . trim ( ) ;
  Map < String , Integer > da = new HashMap < String , Integer > ( ) ;
  for ( String _a : a . split ( " " ) ) {
    if ( da . containsKey ( _a ) ) da . put ( _a , 1 ) ;
  }
  return 0 ;
}
