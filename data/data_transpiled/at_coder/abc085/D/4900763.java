public static int dKatanaThrower ( int N , int H , int [ ] [ ] Swords ) {
  final int swingDamage_max = Math . max ( Swords [ 0 ] [ 0 ] , Swords [ 0 ] [ 1 ] ) ;
  final int [ ] throwHigherThanSwings = Arrays . copyOf ( Swords , Swords . length ) ;
  Arrays . sort ( throwHigherThanSwings , Collections . reverseOrder ( ) ) ;
  int minimumMoving = 0 ;
  for ( int damage : throwHigherThanSwings ) {
    if ( H <= 0 ) {
      H = 0 ;
      break ;
    }
    H -= damage ;
    minimumMoving ++ ;
  }
  minimumMoving += Math . ceil ( H / swingDamage_max ) ;
  return minimumMoving ;
}
