static void input ( ) {
  S = input ( ) ;
  int N = S . length ( ) ;
  int PTN = Integer . parseInt ( S . replace ( 'o' , '1' ) . replace ( 'x' , '0' ) , 2 ) ;
  /* Rotate r */
  int n = ( n >>> b ) | ( ( n << ( N - b ) ) & ( 2 * N - 1 ) ) ;
  /* Solve */
  int OK = 2 * N - 1 ;
  Set < Integer > set1 = new HashSet < Integer > ( ) ;
  set1 . add ( PTN ) ;
  for ( int n = 1 ;
  n <= N ;
  n ++ ) {
    Set < Integer > set2 = new HashSet < Integer > ( ) ;
    for ( int ptn : set1 ) {
      if ( ptn == OK ) return n ;
      for ( int i = 1 ;
      i <= N ;
      i ++ ) {
        int newptn = ptn | rotateR ( PTN , i ) ;
        set2 . add ( newptn ) ;
      }
    }
    set1 = set2 ;
  }
  System . out . println ( solve ( ) ) ;
}
