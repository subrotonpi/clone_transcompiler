public static void main ( String input ) {
  int n = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int m = Integer . parseInt ( input ) ;
  int t = 1900 * m + 100 * ( n - m ) ;
  int per = 2 * m ;
  System . out . println ( t * per ) ;
}
