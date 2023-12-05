public static void ABC ( List < Integer > input ) {
  ABC = list ( map ( input . split ( ) ) ) ;
  ABC = new ArrayList < Integer > ( ABC ) ;
  ABC . sort ( ) ;
  System . out . println ( Integer . toString ( ABC . get ( 0 ) ) + Integer . toString ( ABC . get ( 1 ) ) + ABC . get ( 2 ) ) ;
}
