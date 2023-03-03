public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  boolean flag = true ;
  int ans = 1 ;
  while ( flag ) {
    ans = ans * 2 ;
    if ( ans > N ) {
      flag = false ;
    }
  }
  System . out . println ( ans / 2 ) ;
}
