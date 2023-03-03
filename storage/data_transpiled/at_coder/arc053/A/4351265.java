public static void main ( String input ) {
  int h , w = map ( Integer . parseInt , input . split ( " " ) ) ;
  System . out . println ( ( h - 1 ) * w + ( w - 1 ) * h ) ;
}
