public static void print ( int n , int W ) {
  int w0 = Integer . parseInt ( input . readLine ( ) ) ;
  int v0 = Integer . parseInt ( input . readLine ( ) ) ;
  int zero [ ] = new int [ n ] ;
  int one [ ] = new int [ n ] ;
  int two [ ] = new int [ n ] ;
  int three [ ] = new int [ n ] ;
  int lzero = 1 , lone = 0 , ltwo = 0 , lthree = 0 ;
  for ( ;
  ;
  ) {
    int w = Integer . parseInt ( input . readLine ( ) ) ;
    int v = Integer . parseInt ( input . readLine ( ) ) ;
    if ( w == w0 ) {
      zero [ lzero ] = v ;
      lzero ++ ;
    }
    else if ( w == w0 + 1 ) {
      one [ lone ] = v ;
      lone ++ ;
    }
    else if ( w == w0 + 2 ) {
      two [ ltwo ] = v ;
      ltwo ++ ;
    }
    else {
      three [ lthree ] = v ;
      lthree ++ ;
    }
  }
  Arrays . sort ( zero , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( one , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( two , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( three , Collections . reverseOrder ( Collections . reverseOrder ( ) ) ) ;
  int [ ] zeroSum = new int [ zero . length ] ;
  for ( int i = 0 ;
  i < zero . length ;
  i ++ ) {
    zeroSum [ i ] = zeroSum [ zero . length - 1 ] + zero [ i ] ;
  }
  int [ ] oneSum = new int [ one . length ] ;
  for ( int i = 0 ;
  i < one . length ;
  i ++ ) {
    oneSum [ i ] = oneSum [ one . length - 1 ] + one [ i ] ;
  }
  int [ ] twoSum = new int [ two . length ] ;
  for ( int i = 0 ;
  i < two . length ;
  i ++ ) {
    twoSum [ i ] = twoSum [ two . length - 1 ] + two [ i ] ;
  }
  int [ ] threeSum = new int [ three . length ] ;
  for ( int i = 0 ;
  i < three . length ;
  i ++ ) {
    threeSum [ i ] = threeSum [ three . length - 1 ] + three [ i ] ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < l @ @