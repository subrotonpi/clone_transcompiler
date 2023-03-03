public static void main ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  t = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) t . add ( Integer . parseInt ( input ( ) ) ) ;
  t = new ArrayList < Integer > ( t ) ;
  System . out . println ( t . get ( 0 ) ) ;
}
