public static void input ( ) {
  String s = input ( ) ;
  String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" ;
  for ( int i = 0 ;
  i < alph . length ( ) ;
  i ++ ) {
    s = s . replace ( alph . charAt ( i ) , "" ) ;
  }
  System . out . println ( s ) ;
}
