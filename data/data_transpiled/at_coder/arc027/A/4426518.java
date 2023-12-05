public static void main ( String input ) {
  int h , m = map ( Integer . parseInt ( input ) , 0 ) ;
  int min = 60 * h + m ;
  int a = 18 * 60 ;
  System . out . println ( a - min ) ;
}
