public static void input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  Set < String > set = new TreeSet < String > ( ) ;
  int cnt = 0 ;
  for ( String s : set ) {
    for ( String t : set ) {
      cnt ++ ;
      String ans = s + t ;
      if ( cnt == N ) break ;
    }
    if ( cnt == N ) break ;
  }
  System . out . println ( ans ) ;
}
