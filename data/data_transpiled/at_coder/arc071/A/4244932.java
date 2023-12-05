@ VisibleForTesting static String from ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Counter [ ] cnList = new Counter [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cnList [ i ] = new Counter ( input . nextLine ( ) ) ;
  }
  String ans = "" ;
  for ( int code = 'a' ;
  code < 'a' + 27 ;
  code ++ ) {
    char target = ( char ) code ;
    int repeat = Math . min ( cnList . length , cnList [ i ] . getCount ( ) ) ;
    ans += target * repeat ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
