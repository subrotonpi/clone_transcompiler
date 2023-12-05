@ Sys public static int solveBF ( List < Integer > Q , int S , int E ) {
  if ( Q . size ( ) == 0 ) return 0 ;
  int b = Ellipsis ;
  for ( int p : Q ) {
    List < Integer > L = new ArrayList < Integer > ( ) , R = new ArrayList < Integer > ( ) ;
    for ( int q : Q ) {
      if ( q < p ) L . add ( q ) ;
      else if ( q > p ) R . add ( q ) ;
      b = Math . min ( b , solveBF ( L , S , p - 1 ) + solveBF ( R , p + 1 , E ) ) ;
    }
  }
  return b + ( E - S ) ;
}
