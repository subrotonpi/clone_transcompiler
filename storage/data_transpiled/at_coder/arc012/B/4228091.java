public static void print ( int n , int v , int w , int l ) {
  l = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  for ( int _ : new int [ n ] ) l = l / v * w ;
  System . out . println ( l ) ;
}
