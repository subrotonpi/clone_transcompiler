String card = "1 2 3 4 5 6" . split ( " " ) ;
for ( int i = 0 ;
i < Integer . parseInt ( input ) % 30 ;
i ++ ) {
  card [ i % 5 ] = card [ ( i % 5 ) + 1 ] ;
}
System . out . println ( card ) ;
}
