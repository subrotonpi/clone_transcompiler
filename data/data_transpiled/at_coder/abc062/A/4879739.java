[ x , y ] ;
List < Integer > s1 = Arrays . asList ( 1 , 3 , 5 , 7 , 8 , 10 , 12 ) ;
List < Integer > s2 = Arrays . asList ( 4 , 6 , 9 , 11 ) ;
if ( x == 2 ) {
  System . out . println ( "No" ) ;
}
else if ( s1 . contains ( x ) && s1 . contains ( y ) ) {
  System . out . println ( "Yes" ) ;
}
else if ( s2 . contains ( x ) && s2 . contains ( y ) ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
}
