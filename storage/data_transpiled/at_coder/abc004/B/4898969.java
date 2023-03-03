[ 4 ] ;
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  a [ i ] = new LinkedList < > ( ) ;
  for ( int j = 0 ;
  j < 4 ;
  j ++ ) {
    a [ i ] . add ( new LinkedList < > ( ) ) ;
  }
}
a = new LinkedList < > ( ) ;
for ( LinkedList < Integer > a_ : a ) {
  a_ . reverse ( ) ;
  System . out . println ( Arrays . toString ( a_ . toArray ( ) ) ) ;
}
