public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  System . out . println ( Arrays . asList ( "Aoki" , "Takahashi" ) [ ( a == b && n % ( a + 1 ) != 0 ) || a > b || n <= a ] ) ;
}
