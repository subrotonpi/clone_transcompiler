public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int H = Integer . parseInt ( input . nextLine ( ) ) ;
  final int W = Integer . parseInt ( input . nextLine ( ) ) ;
  final String ud = "#" + W + 2 ;
  System . out . println ( ud ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    final String a = input . nextLine ( ) . trim ( ) ;
    System . out . println ( "#" + a + "#" ) ;
  }
  System . out . println ( ud ) ;
}
