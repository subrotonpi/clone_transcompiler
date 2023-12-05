static final double q = 2 * Math . PI ;
@ SuppressWarnings ( "unused" ) final double t = Math . PI ;
final double h = Math . PI ;
final double t = t + ( 0 > h ? h : 0 ) ;
final int n = Integer . parseInt ( input ( ) ) ;
final int [ ] r = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  r [ i ] = new complex ( input . replace ( ' -' , '-' ) . replace ( ' ' , '+' ) + "j" ) ;
}
for ( int i = 0 ;
i < r . length ;
i ++ ) {
  a [ i ] = t * ( c [ i ] - c [ i ] ) / q ;
  d [ i ] = a [ i ] - a [ i - 1 ] ;
  d [ 0 ] ++ ;
}
System . out . println ( max ( max ( d ) - 1 / 2 , 0 ) ) ;
}
