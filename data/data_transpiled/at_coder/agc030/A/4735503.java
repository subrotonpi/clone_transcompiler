static final void setIn ( ) {
  final InputStream stdin = System . in ;
  System . setIn ( stdin ) ;
  {
    final int li = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int li_ = Integer . parseInt ( stdin . readLine ( ) ) - 1 ;
    final float lf = Float . parseFloat ( stdin . readLine ( ) ) ;
    final int ls = stdin . read ( ) ;
    final String ns = stdin . readLine ( ) . replaceAll ( " " , "" ) ;
    final int lc = list ( ns ) ;
    final int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
    final float nf = Float . parseFloat ( stdin . readLine ( ) ) ;
  }
}
