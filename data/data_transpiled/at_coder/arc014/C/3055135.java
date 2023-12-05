public static int N ( ) {
  int N = Integer . parseInt ( input ) ;
  String s = input . nextLine ( ) ;
  int Rc = s . indexOf ( 'R' ) % 2 ;
  int Gc = s . indexOf ( 'G' ) % 2 ;
  int Bc = s . indexOf ( 'B' ) % 2 ;
  return N ;
}
