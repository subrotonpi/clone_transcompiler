public static void X , Y = [ ] map ( input ) {
  X = Integer . parseInt ( input . nextLine ( ) ) ;
  Y = Integer . parseInt ( input . nextLine ( ) ) ;
  System . out . println ( Y >= K ? X + K : Y + ( X - ( K - Y ) ) ) ;
}
