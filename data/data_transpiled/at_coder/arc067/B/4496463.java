public static void main ( ) {
  try {
    int n = Integer . parseInt ( input . readLine ( ) ) ;
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    int [ ] theArray = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) theArray [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    int t = b / a ;
    int sum = 0 ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      int tt = theArray [ i ] - theArray [ i - 1 ] ;
      if ( tt > t ) sum += b ;
      else sum += a * tt ;
    }
    System . out . println ( sum ) ;
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
}
