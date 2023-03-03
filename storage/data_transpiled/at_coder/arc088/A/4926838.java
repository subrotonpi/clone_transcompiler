public static int x , y = Integer . parseInt ( input ) {
  int c = 0 ;
  while ( ( x = input . nextInt ( ) ) <= y ) {
    x = x * 2 ;
    c ++ ;
  }
  return c ;
}
