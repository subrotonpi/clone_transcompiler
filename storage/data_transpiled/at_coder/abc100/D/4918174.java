static final double INF = Double . POSITIVE_INFINITY ;
/* solve the number of times in the range of the array */
final double [ ] [ ] xyz = new double [ N ] [ ] ;
{
  double [ ] ans = new double [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final double p1 = - 1 , p2 = 1 , p3 = 3 ;
    final double m = - INF ;
    {
      final double [ ] x = new double [ 3 ] ;
      for ( int p1 = - 1 ;
      p1 < 3 ;
      p1 ++ ) {
        x [ p1 ] = x [ p1 ] * p1 + x [ p2 ] * p2 + x [ p3 ] * p3 ;
      }
      Arrays . sort ( x , new Comparator < double [ ] > ( ) {
        @ Override public int compare ( double [ ] x , double [ ] y ) {
          return x [ 0 ] * x [ 1 ] * x [ 2 ] * y + x [ 3 ] * y ;
        }
      }
      ) ;
      ans [ i ] = Arrays . stream ( x ) . mapToDouble ( y ) . sum ( ) ;
    }
    System . out . println ( max ( ans ) ) ;
    return ans [ 0 ] [ 0 ] ;
  }
  public static void main ( String [ ] args ) {
    /* Iterate through the input stream */
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    String line ;
    while ( ( line = br . readLine ( ) ) != null ) {
      for ( String word : line . split ( " " ) ) {
        /* Print out the word */
        System . out . println ( word ) ;
      }
    }
    /* Iterate through the input stream */
    StringTokenizer tokens = new StringTokenizer ( line ) ;
    int N = Integer . parseInt ( tokens . nextToken ( ) ) ;
    int M = Integer . parseInt ( tokens . nextToken ( ) ) ;
    double [ ] [ ] xyz = new double [ N ] [ M ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      xyz [ i ] [ 0 ] = Integer . parseInt ( tokens . nextToken ( ) ) ;
      xyz [ i ] [ 1 ] = Integer . parseInt ( tokens . nextToken ( ) ) ;
    }
    solve ( N , M , xyz ) ;
  }
}
