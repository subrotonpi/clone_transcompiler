public static void main ( String [ ] work ) {
  work = input . split ( "\\s+" ) ;
  String a = work [ 0 ] ;
  String b = work [ 1 ] ;
  int c = Integer . parseInt ( a ) * Integer . parseInt ( b ) ;
  if ( ( c % 2 ) == 0 ) {
    System . out . println ( "Even" ) ;
  }
  else {
    System . out . println ( "Odd" ) ;
  }
}
