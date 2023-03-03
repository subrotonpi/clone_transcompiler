public static void main ( String input ) {
  int h = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int m = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int now = 60 * h + m ;
  int mongen = 18 * 60 ;
  int rest = mongen - now ;
  System . out . println ( rest ) ;
}
