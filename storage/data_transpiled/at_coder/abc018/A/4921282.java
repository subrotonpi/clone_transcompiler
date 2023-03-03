def test_list ( ) : INDENT l = list ( map ( int [ ] :: new , open ( 0 ) ) ) s = new ArrayList ( l ) . stream ( ) . sorted ( ) . limit ( l . size ( ) ) . sorted ( ) . collect ( Collectors . toList ( ) ) ;
for ( int i : l ) {
  System . out . println ( s . indexOf ( i ) + 1 ) ;
}
}
