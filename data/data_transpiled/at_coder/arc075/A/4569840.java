, a = map ( Integer :: parseInt , b ) ) ;
c = Arrays . stream ( b ) . filter ( i -> i % 10 == 0 ) . collect ( Collectors . toList ( ) ) ;
d = new TreeSet < > ( ) ;
if ( d . size ( ) == 0 ) {
}
