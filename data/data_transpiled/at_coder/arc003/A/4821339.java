public static int N ( ) {
  int N = Integer . parseInt ( input ) ;
  Random r = new Random ( ) ;
  int ans = r . nextInt ( ) * 4 + r . nextInt ( ) * 3 + r . nextInt ( ) * 2 + r . nextInt ( ) * 2 + r . nextInt ( ) * 2 ;
  return ans / N ;
}
