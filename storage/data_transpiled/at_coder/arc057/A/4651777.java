@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static < T > void main ( final String [ ] args ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int [ ] li = Lists . newArrayList ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  final int [ ] LF = Lists . newArrayList ( Float . parseFloat ( stdin . readLine ( ) ) ) ;
  final int [ ] LI_ = Lists . newArrayList ( Integer . parseInt ( stdin . readLine ( ) ) - 1 ) ;
  final int II = Integer . parseInt ( stdin . readLine ( ) ) ;
  final int IF = Float . parseFloat ( stdin . readLine ( ) ) ;
  final int [ ] LS = Lists . newArrayList ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  final int [ ] S = Lists . newArrayList ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  final int [ ] IR = Arrays . stream ( li ) . mapToInt ( i -> II ) . toArray ( ) ;
  final int [ ] LIR = Arrays . stream ( li ) . mapToInt ( i -> LI [ i ] ) . toArray ( ) ;
  final int [ ] FR = Arrays . stream ( li ) . mapToInt ( i -> IF [ i ] ) . toArray ( ) ;
  final int [ ] LFR = Arrays . stream ( li ) . mapToInt ( i -> LI [ i ] ) . toArray ( ) ;
  final int [ ] LIR_ = Arrays . stream ( li ) . mapToInt ( i -> LI_ [ i ] ) . toArray ( ) ;
  final int [ ] SR = Arrays . stream ( li ) . mapToInt ( i -> S [ i ] ) . toArray ( ) ;
  final int [ ] LSR = Arrays . stream ( ls ) . mapToInt ( i -> LS [ i ] ) . toArray ( ) ;
  final int mod = 1000000007 ;
  final int a = li [ 0 ] ;
  final int k = li [ 1 ] ;
  final int nityo = 2 * 10 * 12 ;
  if ( k != 0 ) {
    final int x = ( k / ( a * k + 1 ) ) * ( nityo + 1 / k ) ;
    System . out . println ( Math . ceil ( Math . log ( x , k + 1 ) ) ) ;
  }
  else {
    System . out . println ( nityo - a ) ;
  }
}
