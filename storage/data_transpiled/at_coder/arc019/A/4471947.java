public static String a ( ) {
  String a = String . maketrans ( "ODIZSB" , "001258" ) ;
  String S = input ( ) ;
  System . out . println ( S . translate ( a ) ) ;
  return S ;
}
