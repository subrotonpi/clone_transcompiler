static final double ceil ( ) {
  String [ ] x = input . split ( "\\s+" ) ;
  int length = Integer . parseInt ( x [ 0 ] ) ;
  int k = Integer . parseInt ( x [ 1 ] ) ;
  int a = length - 1 ;
  int b = k - 1 ;
  System . out . println ( Math . ceil ( a / b ) ) ;
}
