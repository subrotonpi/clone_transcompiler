public static int n ( ) {
  String s = input . nextLine ( ) ;
  int x = 0 , a = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    x += s . charAt ( i ) == 'I' ? 1 : - 1 ;
    a = Math . max ( a , x ) ;
  }
  return a ;
}
