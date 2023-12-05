public static void input ( Scanner s ) {
  int m = s . nextInt ( ) ;
  Map < String , Integer > x = new HashMap < > ( ) ;
  for ( String a : s ) {
    if ( x . keySet ( ) . contains ( a ) ) {
      x . get ( a ) ++ ;
    }
    else {
      x . put ( a , 1 ) ;
    }
  }
  List < Integer > ls = new LinkedList < > ( x . values ( ) ) ;
  ls . sort ( ) ;
  int n = 0 ;
  for ( int i : ls ) {
    if ( i % 2 == 1 ) n ++ ;
  }
  if ( n == 0 ) {
    System . out . println ( m ) ;
    exit ( ) ;
  }
  int ans = ( ( m - n ) / 2 ) / n ;
  ans = ans * 2 + 1 ;
  System . out . println ( ans ) ;
}
