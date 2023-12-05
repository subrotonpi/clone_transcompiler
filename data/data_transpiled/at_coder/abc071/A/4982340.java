public static int x ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  return Math . abs ( a - x ) < Math . abs ( b - x ) ? a : b ;
}
