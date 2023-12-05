public static void print ( int N ) {
  N = Integer . parseInt ( input ( ) ) ;
  Set < Integer > As = new TreeSet < > ( ) ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) As . add ( Integer . parseInt ( input ( ) ) ) ;
  System . out . println ( As . get ( As . size ( ) - 2 ) ) ;
}
