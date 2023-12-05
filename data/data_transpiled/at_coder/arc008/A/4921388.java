public static void print ( int N ) {
  int d = input ( ) ;
  int m = divmod ( N , 10 ) ;
  int ans = d * 100 + min ( 100 , m * 15 ) ;
  System . out . println ( ans ) ;
}
