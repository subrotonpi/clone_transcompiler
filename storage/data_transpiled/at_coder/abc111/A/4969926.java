;
a = new LinkedList < Integer > ( ) ;
for ( int i = 0 ;
i < a . size ( ) ;
i ++ ) {
  a . add ( Integer . parseInt ( a . get ( i ) ) ) ;
}
int [ ] a2 = new int [ a . size ( ) ] ;
for ( int i = 0 ;
i < a . size ( ) ;
i ++ ) {
  a2 [ i ] = i == 9 ? 1 : 9 ;
}
for ( int i = 0 ;
i < a2 . length ;
i ++ ) {
  System . out . print ( a2 [ i ] + "," ) ;
}
return a2 ;
}
