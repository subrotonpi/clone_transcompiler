public static void d ( int d , int e , int f ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = ( d / a ) * ( e / b ) * ( f / c ) ;
  int w = ( e / a ) * ( d / b ) * ( f / c ) ;
  int r = ( f / a ) * ( e / b ) * ( d / c ) ;
  int t = ( d / a ) * ( f / b ) * ( d / c ) ;
  int y = ( e / a ) * ( f / b ) * ( d / c ) ;
  int u = ( f / a ) * ( d / b ) * ( e / c ) ;
  System . out . println ( max ( q , w , r , t , y , u ) ) ;
}
