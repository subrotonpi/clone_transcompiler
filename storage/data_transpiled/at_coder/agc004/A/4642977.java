public static int a , int b , int c ;
int [ ] d = new int [ ] {
  a , b , c }
  ;
  d = new int [ ] {
    a , b , c }
    ;
    int x = d [ d . length - 1 ] / 2 ;
    int y = d [ d . length - 1 ] - d [ 0 ] / 2 ;
    System . out . println ( Math . abs ( x - y ) * d [ 0 ] * d [ 1 ] ) ;
    return x ;
  }
  