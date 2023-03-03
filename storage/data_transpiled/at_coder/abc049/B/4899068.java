public static void main ( String [ ] args ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] image = new int [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    image [ i ] = input . nextInt ( ) ;
  }
  for ( int i = 0 ;
  i < image . length ;
  i ++ ) {
    System . out . println ( image [ i ] + "\n" + image [ i ] ) ;
  }
}
