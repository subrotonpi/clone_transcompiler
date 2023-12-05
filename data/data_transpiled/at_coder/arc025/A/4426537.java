public static void print ( int d ) {
  List < Integer > j = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) {
    j . add ( i ) ;
  }
  int res = 0 ;
  Iterator < Integer > it = j . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    res += Math . max ( it . next ( ) , res ) ;
  }
  System . out . println ( res ) ;
}
