public static void N ( ) {
  A , B = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  System . out . println ( [ "Alice" , "Borys" ] [ ( B - A ) % 2 != 0 ] ) ;
}
