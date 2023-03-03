public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = Math . abs ( a - b ) + Math . abs ( b - c ) + Math . abs ( c - a ) ;
  int m = Math . max ( Math . abs ( a - b ) , Math . abs ( b - c ) , Math . abs ( c - a ) ) ;
  return s - m ;
}
