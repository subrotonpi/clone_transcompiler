public static int n ( ) {
  String s = input . nextLine ( ) ;
  int t = s ;
  while ( s . contains ( "()" ) ) {
    s = s . replace ( "()" , t ) ;
  }
  return t ;
}
