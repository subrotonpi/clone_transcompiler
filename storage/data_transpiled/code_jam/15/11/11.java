public static int solve1 ( int [ ] a ) {
  return solve1 ( a , a . length , a [ 1 ] ) ;
  /* The following is the maximum of the number of elements in the input array */
  int ratePer10 = Math . max ( Math . max ( 0 , a [ 0 ] - a [ 1 ] ) , a [ 1 ] ) ;
  if ( ratePer10 == 0 ) return 0 ;
  int eaten = 0 ;
  for ( int i = a . length - 1 ;
  i >= 0 ;
  i -- ) {
    eaten += Math . min ( a [ i ] , ratePer10 ) ;
  }
  /* The following is the following is the maximum of the number of elements in the input array */
  / * ▁ The ▁ following ▁ is ▁ the ▁ following ▁ is ▁ the ▁ following ▁ line : STRNEWLINE ▁ * ▁ http : //www.oracle.com/javase/tutorial/java/javase/tutorial/uiswing/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/lookandfeel/look@@
  