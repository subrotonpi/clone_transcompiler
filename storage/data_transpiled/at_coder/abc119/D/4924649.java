static final int calc_Distance ( int frm , int x , int y ) {
  return Math . min ( Math . abs ( frm - x ) , Math . abs ( frm - y ) ) + Math . abs ( x - y ) ;
  /* calc 2points */
  int idx = Arrays . binarySearch ( us , frm ) ;
  /* calc min of the two points */
  int s1 = us . get ( 0 ) ;
  int s2 = us . get ( 1 ) ;
  int t1 = us . get ( 2 ) ;
  int t2 = us . get ( 3 ) ;
  int ans = Math . min ( calc_Distance ( x , s1 , t1 ) , calc_Distance ( x , s1 , t2 ) , calc_Distance ( x , s2 , t1 ) , calc_Distance ( x , s2 , t2 ) ) ;
  /* calc min of the two points */
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int q = Integer . parseInt ( input ( ) ) ;
  int ss [ ] = new int [ a ] ;
  int ts [ ] = new int [ b ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) ss [ i ] = - INF ;
  ts [ i ] = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) ts [ i ] = - INF ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) xs [ i ] = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < xs . length ;
  i ++ ) System . out . println ( calc_Distance ( ss , ts , xs [ i ] ) ) ;
}
