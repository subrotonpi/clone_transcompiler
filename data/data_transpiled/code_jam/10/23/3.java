static final int modulo = 100003 ;
final HashMap < Point , Integer > combtable = new HashMap < Point , Integer > ( ) ;
for ( int i : xrange ( 0 , 1000 ) ) {
  for ( int j : xrange ( 0 , i + 1 ) ) {
    if ( j == 0 || i == j ) combtable . put ( new Point ( i , j ) , 1 ) ;
    else combtable . put ( new Point ( i , j ) , ( combtable . get ( new Point ( i - 1 , j - 1 ) ) + combtable . get ( new Point ( i - 1 , j ) ) ) % modulo ) ;
  }
}
HashMap < Point , Integer > D = new HashMap < Point , Integer > ( ) ;
if ( new File ( "cached" ) . exists ( ) ) D = ( HashMap < Point , Integer > ) new ObjectInputStream ( new FileInputStream ( "cached" ) ) . readObject ( ) ;
else {
  for ( int n : xrange ( 2 , 501 ) ) {
    for ( int l : xrange ( 1 , n ) ) {
      if ( l == 1 ) D . put ( new Point ( n , l ) , 1 ) ;
      else {
        int result = 0 ;
        for ( int m : xrange ( 1 , l ) ) {
          int bucket = ( n - 1 ) - ( l + 1 ) + 1 ;
          int pick = ( l - 1 ) - ( m + 1 ) + 1 ;
          if ( bucket >= pick ) result += D . get ( new Point ( l , m ) ) * combtable . get ( new Point ( n - l - 1 , l - m - 1 ) ) ;
        }
        D . put ( new Point ( n , l ) , result % modulo ) ;
      }
    }
  }
  new File ( "cached" ) . save ( ) ;
}
int c = scanner . nextInt ( ) ;
for ( int cs : xrange ( 1 , Integer . parseInt ( c ) + 1 ) ) {
  int n = Integer . parseInt ( scanner . next ( ) ) ;
  int result = 0 ;
  for ( int l : xrange ( 1 , n ) ) result += D . get ( new Point ( n , l ) ) ;
  System . out . println ( "Case #" + cs + ": " + result % modulo ) ;
}
return result ;
}
