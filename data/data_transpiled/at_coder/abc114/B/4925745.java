public static int [ ] input ( ) {
  int master = 753 ;
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    int x = Integer . parseInt ( s . substring ( i , i + 3 ) ) ;
    int calc = Math . abs ( master - x ) ;
    ans . add ( calc ) ;
  }
  System . out . println ( min ( ans ) ) ;
  return ans . toArray ( ) ;
}
