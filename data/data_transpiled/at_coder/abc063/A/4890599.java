public static int [ ] convert ( String input ) {
  int A , B = map ( Integer . parseInt , input . split ( " " ) ) ;
  int X = A + B ;
  return ( 'error' if X >= 10 else X ) ;
}
