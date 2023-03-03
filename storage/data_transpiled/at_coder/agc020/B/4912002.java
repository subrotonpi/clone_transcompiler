public static int k = Integer . parseInt ( input ) {
  int [ ] alist = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  if ( alist [ alist . length - 1 ] != 2 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int mina = 2 ;
    int maxa = 3 ;
    boolean isNN = false ;
    for ( int i = alist . length - 1 ;
    i >= 1 ;
    i -- ) {
      int a = alist [ i ] ;
      mina = a * ( ( mina + a - 1 ) / a ) ;
      maxa = a * ( maxa / a ) + a - 1 ;
      if ( mina >= maxa || mina / a == maxa == a ) {
        isNN = true ;
        break ;
      }
    }
    if ( isNN ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( mina + " " + maxa ) ;
    }
  }
  return 0 ;
}
