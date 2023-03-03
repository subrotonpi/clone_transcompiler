public static int [ ] getMath ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] f1 = new int [ n ] ;
  int [ ] f2 = new int [ n ] ;
  for ( int i1 = 1 ;
  i1 <= ( int ) ( m * 0.5 ) ;
  ++ i1 ) {
    if ( m % i1 == 0 ) {
      i2 = m / i1 ;
    }
    else {
      ans = f1 [ i1 ] ;
      break ;
    }
  }
  return f2 ;
}
