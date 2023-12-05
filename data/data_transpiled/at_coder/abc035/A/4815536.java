public static void main ( String input ) {
  W , H = map ( Integer . parseInt , input . split ( " " ) ) ;
  System . out . println ( "4:3" if W * 3 == H * 4 else "16:9" ) ;
}
