public static void input ( ) {
  String list [ ] = input . nextLine ( ) . split ( ) ;
  int a = Integer . parseInt ( list [ 1 ] ) ;
  int b = Integer . parseInt ( list [ 2 ] ) ;
  int c = Integer . parseInt ( list [ 3 ] ) ;
  for ( int i = 0 ;
  i < Integer . parseInt ( list [ 0 ] ) ;
  i ++ ) {
    int full = c / a ;
    int full2 = full * b ;
    c = full2 ;
  }
  System . out . println ( c ) ;
}
