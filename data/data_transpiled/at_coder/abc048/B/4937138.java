public static void main ( String input , int a , int b ) {
  int x = map ( Integer . parseInt , input . split ( " " ) ) ;
  int c = b / x - ( a - 1 ) / x ;
  System . out . println ( c ) ;
}
