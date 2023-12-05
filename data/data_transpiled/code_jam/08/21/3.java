public static void dofile ( String infile , String outfile ) throws IOException {
  String instr = file ( infile ) . toString ( ) ;
  String ostr = dostr ( instr ) ;
  file ( outfile , "w" ) . write ( ostr ) ;
}
{
  int i ;
  int n ;
  int x1 ;
  int y1 ;
  int x2 ;
  int y2 ;
  int x3 ;
  int y3 ;
  int x1 ;
  int y1 ;
  int y2 ;
  int y2 ;
  int x3 ;
  int y3 ;
  int y3 ;
  int N ;
  {
    n = Integer . parseInt ( infile ) ;
    A = Integer . parseInt ( infile ) ;
    B = Integer . parseInt ( infile ) ;
    C = Integer . parseInt ( infile ) ;
    D = Integer . parseInt ( infile ) ;
    x0 = Integer . parseInt ( infile ) ;
    y0 = Integer . parseInt ( infile ) ;
    M = Integer . parseInt ( infile ) ;
    dat = infile . substring ( 1 ) ;
    res = solve ( n , A , B , C , D , x0 , y0 , M , i + 1 ) ;
    results . add ( res ) ;
  }
}
