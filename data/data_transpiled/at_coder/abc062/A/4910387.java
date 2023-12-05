def set ( x = new HashSet < Integer > ( ) ) : INDENT x = set ( list ( input . split ( " " ) ) ) ;
a = set ( [ 1 , 3 , 5 , 7 , 8 , 10 , 12 ] ) ;
b = set ( [ 4 , 6 , 9 , 11 ] ) ;
if ( x . containsAll ( a ) || x . containsAll ( b ) ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
}
