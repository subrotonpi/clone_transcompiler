public static void print ( int n , int a , int b ) {
  boolean ant = true ;
  while ( n > 0 ) {
    if ( ant ) n -= a ;
    else n -= b ;
    ant = ! ant ;
  }
  System . out . println ( ant ? "Bug" : "Ant" ) ;
}
