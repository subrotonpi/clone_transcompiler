public static String S = new LinkedList < String > ( ) {
  {
    add ( "A" ) ;
  }
}
;
S . add ( "A" ) ;
for ( int j = 0 ;
j < S . size ( ) - 2 ;
j ++ ) {
  if ( ( S . get ( j ) == S . get ( j + 1 ) ) && ( S . get ( j + 2 ) == S . get ( j + 3 ) ) ) {
    System . out . println ( j + 1 + " " + j + 2 ) ;
    exit ( ) ;
  }
  if ( ( S . get ( j ) == S . get ( j + 2 ) ) && ( S . get ( j + 3 ) == S . get ( j + 3 ) ) ) {
    System . out . println ( j + 1 + " " + j + 3 ) ;
    exit ( ) ;
  }
}
else {
  System . out . println ( "-1 -1" ) ;
}
return S ;
}
