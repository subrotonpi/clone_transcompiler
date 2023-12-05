public static int [ ] [ ] ints ( Scanner input ) {
  int a = input . nextInt ( ) ;
  int b = input . nextInt ( ) ;
  int x = a + b ;
  int y = a - b ;
  int z = a * b ;
  if ( y <= x && z <= x ) {
    System . out . println ( x ) ;
  }
  else if ( x <= y && z <= y ) {
    System . out . println ( y ) ;
  }
  else {
    System . out . println ( z ) ;
  }
  return ints ( x , y , z ) ;
}
