static void n ( ) {
  int v = input . nextInt ( ) ;
  int w = input . nextInt ( ) ;
  int l = 0 ;
  for ( ;
  ;
  ) {
    int g = ( l - t ) / v ;
    t = l ;
    l += g * w ;
  }
  System . out . println ( l - t ) ;
}
