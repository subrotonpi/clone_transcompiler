public static final int [ ] [ ] getStack ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int NG1 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int NG2 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int NG3 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == NG1 || N == NG2 || N == NG3 ) {
    System . out . println ( "NO" ) ;
    System . exit ( 0 ) ;
  }
  Stack < Point > stack = new Stack < Point > ( ) ;
  stack . push ( new Point ( 0 , N ) ) ;
  Stack < Integer > judge = new Stack < Integer > ( ) ;
  while ( stack . size ( ) > 0 ) {
    Point a = stack . pop ( ) ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      int b = a . y - 1 ;
      if ( b != NG1 && b != NG2 && b != NG3 && a . x < 100 ) {
        int num = a . x ;
        judge . add ( num ) ;
      }
      else if ( b == 0 ) {
        System . out . println ( "YES" ) ;
        System . exit ( 0 ) ;
      }
      else {
      }
    }
  }
  return judge ;
}
