String = "1 2 3 4 5 6" . split ( " " ) ;
for ( int i = 0 ;
i < Integer . parseInt ( input ) % 30 ;
i ++ ) {
  a = ( i % 5 ) ;
  b = ( i % 5 ) + 1 ;
  card [ a ] = card [ b ] ;
}
System . out . println ( card ) ;
}
