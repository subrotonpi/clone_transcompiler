public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] list = new int [ n ] ;
  int [ ] list2 = new int [ n ] ;
  int count = 0 ;
  int next = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    list [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  do {
    list2 [ next - 1 ] ++ ;
    count ++ ;
    next = list [ next - 1 ] ;
  }
  while ( next == 2 ) ;
  if ( list2 [ next - 1 ] >= 2 ) {
    System . out . println ( count ) ;
    break ;
  }
  if ( list2 [ next - 1 ] >= 2 ) {
    System . out . println ( - 1 ) ;
    break ;
  }
  return list ;
}
