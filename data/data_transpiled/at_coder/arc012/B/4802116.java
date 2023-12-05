public static void print ( int n , double va , double vb , int l ) {
  double ans = map ( Integer . parseInt , input ( ) . split ( " " ) ) ;
  ans = l * ( vb / va ) * * n ;
  System . out . println ( "%f" % ans ) ;
}
