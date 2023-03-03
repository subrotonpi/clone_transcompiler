public static void main ( String input , int n , int a , int b ) {
  n = n % ( a + b ) ;
  System . out . println ( n == 0 || n > a ? "Bug" : "Ant" ) ;
}
