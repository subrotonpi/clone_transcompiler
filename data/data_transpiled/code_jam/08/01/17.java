/*2
5
Yeehaw
NSM
Dont Ask
B9
Googol
10
Yeehaw
Yeehaw

Googol
5
Yeehaw
Yeehaw

Dont Ask
B9
Googol
7
Googol
Dont Ask
NSM

NSM
Dont Ask
B9
Googol
7
Googol
Dont Ask
NSM
NSM



*/
public static void sample ( String sample ) throws IOException {
  BufferedReader in = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
  PrintWriter out = new PrintWriter ( new FileWriter ( "A-large.out" ) ) ;
  int N = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int n : xrange ( N ) ) {
    int S = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    int [ ] engine = new int [ S ] ;
    for ( int s : xrange ( S ) ) {
      engine [ s ] = in . readLine ( ) . trim ( ) ;
    }
    int Q = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    int [ ] query = new int [ Q ] ;
    for ( int q : xrange ( Q ) ) {
      query [ q ] = engine [ q ] ;
    }
    int [ ] mask = new int [ Q ] ;
    switch = 0 ;
    System . arraycopy ( query , 0 , mask , 0 , mask . length ) ;
    switch += 1 ;
  }
  in . close ( ) ;
  out . close ( ) ;
}
