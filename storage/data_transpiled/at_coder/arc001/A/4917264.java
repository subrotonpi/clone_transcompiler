public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] counts = new int [ 4 ] ;
  for ( char c : input . toCharArray ( ) ) {
    counts [ ( int ) c - 1 ] ++ ;
  }
  System . out . println ( max ( counts ) + " " + min ( counts ) ) ;
}
