public static int [ ] convert ( String input ) {
  int A , B = map ( Integer . parseInt , input . split ( " " ) ) ;
  System . out . println ( [ A + B , B - A ] [ not ( B % A == 0 ) ] ) ;
  return null ;
}
