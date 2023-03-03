public static int w ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  return 0 <= a && b <= a + w || b <= a && a <= b + w ? a : Math . abs ( a - b ) - w ;
}
