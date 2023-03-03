@ VisibleForTesting static void input ( ) {
  String a = input . nextLine ( ) ;
  Counter < String > c = new ClassicCounter < String > ( ) ;
  c . incrementCount ( a ) ;
  int n = a . length ( ) ;
  int ans = n * ( n - 1 ) / 2 + 1 ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    char w = ( char ) ( 'a' + i ) ;
    int count = c . getCount ( w ) ;
    if ( count >= 2 ) {
      ans -= count * ( count - 1 ) / 2 ;
    }
  }
  System . out . println ( ans ) ;
}
