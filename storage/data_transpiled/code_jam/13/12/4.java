public static int maxIndex ( int [ ] vals , int st , int en ) {
  int m = - 1 ;
  int maxi = - 1 ;
  for ( int i : xrange ( st , en ) ) {
    if ( vals [ i ] > m ) {
      m = vals [ i ] ;
      maxi = i ;
    }
  }
  return maxi ;
  /* Function to calculate the average of the values */
  if ( en - st == 0 ) {
    return 0 ;
  }
  int maxi = maxIndex ( vals , st , en ) ;
  int numBefore = maxi - st ;
  int numAfter = en - maxi ;
  int energy = Math . min ( E , stE + numBefore * R ) ;
  energy = Math . min ( energy , energy - ( enE - numAfter * R ) ) ;
  int reqEnergy = Math . min ( E , stE + numBefore * R ) ;
  return energy * vals [ maxi ] + fn ( E , R , N , vals , st , maxi , stE , reqEnergy ) + fn ( E , R , N , vals , maxi + 1 , en , reqEnergy - energy + R , enE ) ;
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int z : xrange ( 1 , T + 1 ) ) {
    int E = Integer . parseInt ( readLine ( ) ) ;
    int R = Integer . parseInt ( readLine ( ) ) ;
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] vals = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) vals [ i ] = readLine ( ) ;
    System . out . println ( "Case #" + z + ": " + fn ( E , R , N , vals , 0 , N , E , 0 ) ) ;
  }
}
