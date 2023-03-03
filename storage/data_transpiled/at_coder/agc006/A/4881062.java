public static void print ( int n ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int ls = s . length ( ) ;
  int lt = t . length ( ) ;
  String ans = s + t ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . regionMatches ( i , ans , 0 , ls - i ) ) {
      ans = s + t . substring ( ls - i ) ;
      break ;
    }
  }
  System . out . println ( ans . length ( ) ) ;
}
