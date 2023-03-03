public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  ArrayList < Integer > Ans = new ArrayList < Integer > ( ) ;
  for ( int i = 180 ;
  i > 0 ;
  i -- ) {
    int n = N - i ;
    if ( n < 0 ) continue ;
    String S = Integer . toString ( n ) ;
    int total = 0 ;
    for ( String s : S . split ( " " ) ) total += Integer . parseInt ( s ) ;
    if ( n + total == N ) Ans . add ( n ) ;
  }
  System . out . println ( Ans . size ( ) ) ;
  for ( int ans : Ans ) {
    System . out . println ( ans ) ;
  }
}
