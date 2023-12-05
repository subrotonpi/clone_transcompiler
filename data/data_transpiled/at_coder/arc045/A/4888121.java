public static void main ( String [ ] args ) {
  ResourceBundle res = ResourceBundle . getBundle ( "com.sun.tools.javac.resources.javac" ) ;
  res . getString ( "Left" ) ;
  res . getString ( "Right" ) ;
  res . getString ( "AtCoder" ) ;
  res . getString ( "A" ) ;
  System . out . println ( Arrays . toString ( input . getStrings ( ) ) ) ;
}
