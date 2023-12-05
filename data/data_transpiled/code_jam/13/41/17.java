public static int cost ( int a , int b , int n , int N ) {
  int d = b - a ;
  return n * d * ( N + N - d + 1 ) / 2 ;
}
{
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int MaxSum = 0 ;
  int MinSum = 0 ;
  int [ ] [ ] Events = new int [ M ] [ 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int start = Integer . parseInt ( input . nextLine ( ) ) ;
    int end = Integer . parseInt ( input . nextLine ( ) ) ;
    int count = Integer . parseInt ( input . nextLine ( ) ) ;
    MaxSum += cost ( start , end , count , N ) ;
    Events [ i ] = new int [ ] {
      start , 0 , count }
      ;
      Events [ i ] = new int [ ] {
        end , 1 , count }
        ;
      }
      ArrayList < Integer > Curr = new ArrayList < Integer > ( ) ;
      Collections . sort ( Events ) ;
      for ( int x = 0 ;
      x < Events . size ( ) ;
      x ++ ) {
        int type = Events . get ( x ) ;
        int count = Events . get ( x ) ;
        if ( type == 0 ) {
          Curr . add ( new Integer ( x ) ) ;
        }
        else {
          Collections . sort ( Curr ) ;
          while ( count > 0 ) {
            if ( Curr . get ( Curr . size ( ) - 1 ) . intValue ( ) <= count ) {
              MinSum += cost ( Curr . get ( Curr . size ( ) - 1 ) . intValue ( ) , x , Curr . get ( Curr . size ( ) - 1 ) . intValue ( ) , N ) ;
              count -= Curr . get ( Curr . size ( ) - 1 ) . intValue ( ) ;
              Curr . remove ( Curr . size ( ) - 1 ) ;
            }
            else {
              MinSum += cost ( Curr . get ( Curr . size ( ) - 1 ) . intValue ( ) , x , count , N ) ;
              Curr . remove ( Curr . size ( ) - 1 ) . intValue ( ) - = count ;
              count = 0 ;
            }
          }
        }
      }
      System . out . println ( "Case #" + num + ": " + ( MaxSum - MinSum ) % 1000002013 ) ;
      int T = Integer . parseInt ( input . nextLine ( ) ) ;
      for ( int num = 1