static public int getRet ( int W , int H , String [ ] [ ] pic , int posX , int Dis ) {
  int w = W - 2 ;
  int h = H - 2 ;
  int j = posX ;
  int A = 2 * j - 1 ;
  int D = 2 * k - 1 ;
  int B = 2 * w - D ;
  int C = 2 * h - A ;
  int Dis2 = Dis * Dis ;
  int I = Math . max ( Dis / B , Dis / D ) ;
  int J = Math . max ( Dis / A , Dis / C ) ;
  Set < String > retSet = new HashSet < String > ( ) ;
  boolean zerop = false ;
  boolean zeron = false ;
  for ( int i = 0 ;
  i < xrange ( H ) ;
  i ++ ) {
    String [ ] row = new String [ i ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) row [ j ] = inLines [ pos + j ] ;
    pic [ i ] = row ;
    for ( int k = 0 ;
    k < row . length ;
    k ++ ) if ( "X" . equals ( row [ k ] ) ) posX = ( j == 0 ? 0 : 1 ) ;
    else if ( "#" . equals ( row [ k ] ) ) ++ nb0 ;
  }
  pos += H ;
  String s = "Case #" + ( i + 1 ) + ": " ;
  s += getRet ( W , H , pic , posX , Dis ) ;
  System . out . println ( s ) ;
  return retSet . size ( ) ;
}
