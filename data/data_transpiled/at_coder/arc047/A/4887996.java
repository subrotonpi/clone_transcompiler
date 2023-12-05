public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int t = 1 ;
  int res = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) {
      t ++ ;
      if ( t > l ) {
        t = 1 ;
        res ++ ;
      }
    }
    else {
      t -- ;
    }
  }
  System . out . println ( res ) ;
}
