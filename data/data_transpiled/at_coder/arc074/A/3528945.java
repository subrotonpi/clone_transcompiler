static final int [ ] getStdOut ( ) {
  final int H = Integer . parseInt ( input . readLine ( ) ) ;
  final int W = Integer . parseInt ( input . readLine ( ) ) ;
  final int ans = 10 * 10 ;
  final int calc1 = ( H , W ) ;
  final int calc2 = ( H , W ) ;
  int ret = 10 * 10 ;
  for ( int w = 1 ;
  w < W ;
  w ++ ) {
    int s1 = w * H ;
    int h = H / 2 ;
    int s2 = h * ( W - w ) ;
    int s3 = ( H - h ) * ( W - w ) ;
    int maxS = Math . max ( s1 , s2 , s3 ) ;
    int minS = Math . min ( s1 , s2 , s3 ) ;
    ret = Math . min ( maxS , minS , ret ) ;
  }
  return ret ;
}
