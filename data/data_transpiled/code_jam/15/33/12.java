public static int C = 0 ;
int D = 0 ;
int V = 0 ;
int [ ] h = new int [ 3 ] ;
{
  int i ;
  int q ;
  int summ ;
  int i ;
  int ret ;
  int TTT ;
  {
    String [ ] r = scanner . nextLine ( ) . split ( " " ) ;
    C = Integer . parseInt ( r [ 0 ] ) ;
    D = Integer . parseInt ( r [ 1 ] ) ;
    V = Integer . parseInt ( r [ 2 ] ) ;
    h = scanner . nextLine ( ) . split ( " " ) ;
    for ( i = 0 ;
    i < h . length ;
    i ++ ) h [ i ] = Integer . parseInt ( h [ i ] ) ;
    Arrays . sort ( h ) ;
    q = 1 ;
    summ = 0 ;
    i = 0 ;
    ret = 0 ;
    while ( ( q <= V ) && ( i < D ) && ( h [ i ] <= q ) ) {
      summ = summ + C * h [ i ] ;
      i = i + 1 ;
      q = summ + 1 ;
    }
    else {
      ret = ret + 1 ;
      summ = summ + C * q ;
      q = summ + 1 ;
    }
  }
}
