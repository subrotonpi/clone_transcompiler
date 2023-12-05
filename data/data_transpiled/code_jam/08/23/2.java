public static void dofile ( String infile , String outfile ) throws IOException {
  String instr = file ( infile ) . toString ( ) ;
  String ostr = dostr ( instr ) ;
  file ( outfile ) . writeTo ( ostr ) ;
}
{
  int N = Integer . parseInt ( instr . substring ( 0 , n ) ) ;
  int [ ] dat = new int [ N ] ;
  int [ ] dis ;
  List < String > results = new ArrayList < String > ( ) ;
  for ( int i : xrange ( N ) ) {
    int K = Integer . parseInt ( dat [ 0 ] ) ;
    print ( i ) ;
    dat = new int [ N ] ;
    Arrays . fill ( dat , i ) ;
    dis = ArrayUtil . toIntArray ( dat ) ;
    Arrays . fill ( dis , i + 1 ) ;
    results . add ( res ) ;
  }
  {
    StringBuilder sb = new StringBuilder ( ) ;
    for ( int i : xrange ( K , 0 , - 1 ) ) {
      sb . append ( i ) ;
      int ld = sb . length ( ) ;
      int spl = ( i - 1 ) % ld ;
      sb . delete ( ld - spl , sb . length ( ) ) ;
    }
    String ret = "Case #" + ind + ":" ;
    for ( int x : dis ) {
      ret = ret + " " + sb . charAt ( x - 1 ) ;
    }
  }
}
