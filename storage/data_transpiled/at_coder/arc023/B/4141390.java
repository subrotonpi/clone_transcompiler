static Runnable I = new Runnable ( ) {
  public void run ( ) {
    int i , r , c , d ;
    int a ;
    r = input . nextInt ( ) ;
    c = input . nextInt ( ) ;
    d = input . nextInt ( ) ;
    a = 0 ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) j = Math . max ( d - i , - 1 ) ;
    a = Math . max ( a , i ) + I . get ( j % 2 , j + 1 ) ;
    System . out . println ( a ) ;
  }
}
