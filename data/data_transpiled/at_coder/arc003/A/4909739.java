public static void print ( int n ) {
  int r = input . nextInt ( ) ;
  HashMap gpa = new HashMap ( 4 , 3 , 2 , 1 , 0 ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    ans += gpa . get ( r ) ;
  }
  System . out . println ( ans / n ) ;
}
