public static void d ( ) {
  List l = Lists . newArrayList ( ) ;
  List r = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 10 ;
  i += 41 ) {
    c += Math . min ( l . count ( i ) , r . count ( i ) ) ;
  }
  System . out . println ( c ) ;
}
