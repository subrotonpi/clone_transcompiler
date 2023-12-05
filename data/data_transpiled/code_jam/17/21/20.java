static double solve ( ) {
  final int D = Integer . parseInt ( input . nextLine ( ) ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  double worstDestTime = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int pos = Integer . parseInt ( input . nextLine ( ) ) ;
    final int spe = Integer . parseInt ( input . nextLine ( ) ) ;
    final double destTime = ( D - pos ) * 1.0 / spe ;
    if ( destTime > worstDestTime ) {
      worstDestTime = destTime ;
    }
  }
  return D / worstDestTime ;
}
