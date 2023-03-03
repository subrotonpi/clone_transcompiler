list = Arrays . asList ( input . split ( " " ) ) ;
if ( list . get ( 0 ) == list . get ( 1 ) ) {
  System . out . println ( "=" ) ;
}
else if ( list . get ( 0 ) < list . get ( 1 ) ) {
  System . out . println ( "<" ) ;
}
else {
  System . out . println ( ">" ) ;
}
return list ;
}
