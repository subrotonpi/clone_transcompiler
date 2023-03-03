public static void print ( String s ) {
  s = map ( Integer . parseInt ( input ( ) ) , s ) ;
  ans = new HashSet ( s ) ;
  System . out . println ( ans . size ( ) ) ;
}
