public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] shop = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    shop [ i ] [ 0 ] = a ;
    shop [ i ] [ 1 ] = b ;
  }
  Arrays . sort ( shop , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return o1 [ 0 ] - o2 [ 0 ] ;
    }
  }
  ) ;
  int amount = 0 ;
  int quantity = 0 ;
  for ( int [ ] s : shop ) {
    if ( quantity + s [ 1 ] < M ) {
      amount += s [ 0 ] * s [ 1 ] ;
      quantity += s [ 1 ] ;
    }
    else {
      amount += ( M - quantity ) * s [ 0 ] ;
      quantity = M ;
      break ;
    }
  }
  System . out . println ( amount ) ;
}
