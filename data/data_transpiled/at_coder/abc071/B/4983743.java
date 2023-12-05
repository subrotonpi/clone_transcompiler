public static String input ( ) {
  String s = input ( ) ;
  List < Character > alphabet = new ArrayList < > ( map ( chr , 97 , 123 ) ) ;
  return "None" . equals ( set ( alphabet ) ) ? null : new String ( set ( alphabet ) . subtract ( list ( s ) ) ) . substring ( 0 ) ;
}
