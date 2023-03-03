@ Produces @ ApplicationScoped public static IContainer provideContainer ( ) {
  final int n = Integer . parseInt ( open ( 0 ) . readLine ( ) ) ;
  final int [ ] a = new int [ n ] ;
  Arrays . fill ( a , - 1 ) ;
  return new Container ( ) {
    @ Override public int cmb ( int n , int r ) {
      r = Math . min ( n - r , a [ n ] ) ;
      return 1 ;
    }
  }
  ;
}
