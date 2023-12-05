public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int x = 0 ;
  List < Integer > x_list = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( ( S . charAt ( i ) == 'I' ) ) x ++ ;
    else x -- ;
    x_list . add ( x ) ;
  }
  System . out . println ( max ( x_list ) ) ;
  return x_list . size ( ) ;
}
