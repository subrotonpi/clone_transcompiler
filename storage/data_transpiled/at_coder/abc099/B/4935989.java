public static void main ( String input ) {
  int a , b = map ( Integer . parseInt , input . split ( " " ) ) ;
  int diff = b - a ;
  System . out . println ( sum ( list ( range ( 1 , diff + 1 ) ) ) - b ) ;
}
