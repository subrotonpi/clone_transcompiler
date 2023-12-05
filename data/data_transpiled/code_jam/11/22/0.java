static final String solve ( int D , int [ ] PVs , int t ) {
  final int ALOT = 10 * 15 ;
  {
    int leftmost = - ALOT * 10 ;
    for ( int i = 0 ;
    i < PVs . length ;
    i ++ ) {
      int P = PVs [ i ] ;
      int V = PVs [ i ] ;
      int next = Math . max ( P - t , leftmost + D ) ;
      next += ( V - 1 ) * D ;
      if ( next > P + t ) {
        return false ;
      }
      leftmost = next ;
    }
    return true ;
  }
  private static long solve ( int D , int [ ] PVs ) {
    int mx = ALOT ;
    int mn = 0 ;
    while ( mx > mn ) {
      int mid = ( mx + mn ) / 2 ;
      if ( trythis ( D , PVs , mid ) ) {
        mx = mid ;
      }
      else {
        mn = mid + 1 ;
      }
    }
    return mx ;
  }
  public static String readLine ( ) {
    return input . readLine ( ) . trim ( " \n\t" ) ;
  }
  private static String doTest ( Scanner input ) {
    String line [ ] = input . nextLine ( ) . split ( " " ) ;
    int C = Integer . parseInt ( line [ 0 ] ) ;
    int D = Integer . parseInt ( line [ 1 ] ) ;
    PVs = new PVs [ C ] ;
    for ( int i = 0 ;
    i < C ;
    i ++ ) {
      line = input . nextLine ( ) . split ( " " ) ;
      PVs [ i ] = new PVs [ i ] ;
      for ( int j = 0 ;
      j < PVs . length ;
      j ++ ) {
        line = input . nextLine ( ) . split ( " " ) ;
        PVs [ j ] [ i ] = new PVs [ j ] ;
        PVs [ j ] [ i ] = new PVs [ j ] ;
        PVs [ j ] [ i ] = new PVs [ j ] ;
        PVs [ j ] [ i ] = new PVs [ j ] ;
        PVs [ j ] [ i ] = new PVs [ j ] ;
        PVs [ j ] [ i ] = new PVs [ j ] ;
        PVs [ j ] [ i ] = new PVs [ j ] ;
        PVs [ j ] [ i ] = new PVs [ j ] ;
        PVs [ j ] [ i ] = new PVs [ j ] ;
      }
    }
    return String