public static int calc ( String l ) {
  if ( "0" . equals ( l ) ) {
    return 0 ;
  }
  return 1 ;
}
String [ ] s = input . nextLine ( ) . split ( "\\+" ) ;
List < Integer > t = new ArrayList < Integer > ( ) ;
for ( String s_ : s ) {
  t . add ( Integer . parseInt ( s_ ) ) ;
}
