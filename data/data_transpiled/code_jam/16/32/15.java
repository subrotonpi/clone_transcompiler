@ Sys public static void main ( String in ) {
  int B , M ;
  /*if (M<2*(B-2)) {
  System.out.println(zfill(Integer.toBinaryString(M), B-1)+"0");
  for(int i:xrange(B-1)) {
  System.out.println("0"*(i+2)+"1"*(B-i-2));
  }
  }else if (M==2*(B-2)) {
  System.out.println("0"+"1"*(B-1));
  for(int i:xrange(B-1)) {
  System.out.println("0"*(i+2)+"1"*(B-i-2));
  }
  }*/
  T = Integer . parseInt ( in ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    B = Integer . parseInt ( in ) ;
    M = Integer . parseInt ( in ) ;
    System . out . println ( "Case #" + t + ": " + ( ( M <= 2 * ( B - 2 ) ) ? "POSSIBLE" : "IMPOSSIBLE" ) ) ;
    eachCase ( B , M ) ;
  }
}
