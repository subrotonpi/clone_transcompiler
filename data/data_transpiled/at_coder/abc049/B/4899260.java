public static void main ( String [ ] args ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] image = new int [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    String row = input . nextLine ( ) ;
    System . out . println ( row + "\n" + row ) ;
  }
}
