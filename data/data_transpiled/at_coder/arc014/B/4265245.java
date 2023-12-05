;
a = new ArrayList < > ( ) ;
s = "DRAW" ;
for ( int i = 0 ;
i < Integer . MAX_VALUE ;
i ++ ) {
  char c = input . charAt ( i ) ;
  if ( i > 0 && ( b . get ( b . size ( ) - 1 ) != c || a . contains ( c ) ) ) s = "LWOISNE" . substring ( i % 2 , 0 , i ) ;
  break ;
  b = c ;
  a . add ( c ) ;
}
System . out . println ( s ) ;
}
