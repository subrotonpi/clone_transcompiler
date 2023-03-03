public static int [ ] getNegativeInstances ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ s ] ;
  int i = 0 ;
  int flag = 0 ;
  int new_a ;
  while ( ( new_a = getNegativeInstances ( ) . get ( i ) ) != s ) {
    i ++ ;
  }
  return a ;
}
