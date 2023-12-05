public static int s ( ) {
  int a , b ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    a = Integer . parseInt ( input . nextLine ( ) ) ;
    b = Integer . parseInt ( input . nextLine ( ) ) ;
    s = s + a * b / 10 ;
  }
  return s ;
}
