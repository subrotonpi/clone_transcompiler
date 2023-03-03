public static List < String > S = new LinkedList < String > ( ) ;
List < String > T = new LinkedList < String > ( ) ;
for ( int i = 0 ;
i < S . size ( ) ;
i ++ ) {
  if ( ( S . size ( ) == T . size ( ) ) ) {
    System . out . println ( "Yes" ) ;
    exit ( ) ;
  }
  S . add ( 0 , S . get ( S . size ( ) - 1 ) ) ;
  T . remove ( S . size ( ) - 1 ) ;
}
System . out . println ( "No" ) ;
return T ;
}
