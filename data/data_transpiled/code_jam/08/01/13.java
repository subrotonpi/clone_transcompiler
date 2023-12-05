static final int S = 0 ;
int N = 0 ;
int Q = 0 ;
HashMap < String , Integer > engine = new HashMap < String , Integer > ( ) ;
BufferedReader inputIn = null ;
PrintWriter outputOut = null ;
/* Case init */
S = Strings . parseInt ( inputIn . readLine ( ) ) ;
engine = new HashMap < String , Integer > ( ) ;
for ( int i : xrange ( S ) ) engine . put ( inputIn . readLine ( ) , i ) ;
Q = Strings . parseInt ( inputIn . readLine ( ) ) ;
/* Query */
for ( int i : xrange ( Q ) ) {
  /* Calculate the number of values */
  for ( int j : xrange ( S ) ) {
    /* Calculate the number of values */
    result = new int [ S ] ;
    for ( int i : query ( ) ) {
      for ( int j : xrange ( S ) ) result [ j ] = Math . min ( result [ j ] , result [ i ] + 1 ) ;
      result [ i ] = 10000000 ;
    }
  }
  /* Calculate the number of values */
}
