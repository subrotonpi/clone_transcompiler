@ Nonnull public static Iterable < List < Integer >> getAccAss ( @ Nonnull final List < List < Integer >> Ass ) {
  final List < List < Integer >> [ ] accAss = new ArrayList [ Ass . get ( 0 ) . size ( ) + 1 ] ;
  for ( final List < Integer > As : Ass ) accAss [ 0 ] = new ArrayList < > ( Ass . get ( 0 ) . size ( ) + 1 ) ;
  Arrays . fill ( accAss , Acce . getAccAss ( ) ) ;
  final List < List < Integer >> accAss = new ArrayList < > ( accAss . length ) ;
  for ( final List < Integer > accAs : accAss ) accAss [ 0 ] = accAs . toArray ( new List < > ( ) ) ;
  accAss [ 0 ] = Collections . singletonList ( accAss [ 0 ] ) ;
  for ( int x = 1 ;
  x < accAss . length ;
  x ++ ) {
    accAss [ x ] = Collections . singletonList ( new ArrayList < > ( accAss [ x ] ) ) ;
  }
  return accAss ;
}
