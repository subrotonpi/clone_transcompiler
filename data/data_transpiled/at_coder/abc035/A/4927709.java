public static void print ( String w , int h ) {
  w = map ( Integer . parseInt ( input ( ) ) , h ) ;
  System . out . println ( "4:3" if w / h == 4 / 3 else "16:9" ) ;
}
