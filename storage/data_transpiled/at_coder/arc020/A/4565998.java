public static void print ( String a , String b ) {
  a = Integer . parseInt ( input ( ) ) ;
  b = Integer . parseInt ( input ( ) ) ;
  a = Math . abs ( a ) ;
  b = Math . abs ( b ) ;
  System . out . println ( a == b ? "Draw" : ( a < b ? "Ant" : "Bug" ) ) ;
}
