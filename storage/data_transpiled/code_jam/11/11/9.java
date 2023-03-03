public static String solve ( int NN , int Pd , int Pg ) throws IOException {
  File inFile = new File ( "intpu1.txt" ) ;
  File outFile = new File ( "output1.txt" ) ;
  /* Find the result of the number of numbers */
  if ( Pd == 100 && Pg == 100 ) {
    return "Possible" ;
  }
  if ( Pd == 0 && Pg == 0 ) {
    return "Possible" ;
  }
  int d = 1 ;
  while ( d <= NN ) {
    if ( ( d * Pd ) % 100 == 0 ) {
      if ( Pg < 100 && Pg > 0 ) {
        System . out . println ( NN + " " + Pd + " " + Pg ) ;
        return "Possible" ;
        break ;
      }
    }
    d ++ ;
  }
  /* Broken */
  N = Integer . parseInt ( inFile . readLine ( ) ) ;
  int cnt = 0 ;
  String line ;
  while ( ( line = inFile . readLine ( ) ) != null ) {
    cnt ++ ;
    String [ ] llLine = line . split ( " " ) ;
    NN = Integer . parseInt ( llLine [ 0 ] ) ;
    Pd = Integer . parseInt ( llLine [ 1 ] ) ;
    Pg = Integer . parseInt ( llLine [ 2 ] ) ;
    String result = solve1 ( NN , Pd , Pg ) ;
    String resStr = "Case #" + cnt + ": " ;
    resStr = resStr + result + "\n" ;
    System . out . println ( resStr ) ;
    outFile . createNewFile ( ) ;
  }
  /* gcd */
  while ( a > 0 ) {
    a = b % a ;
    b = a ;
  }
  return b ;
}
