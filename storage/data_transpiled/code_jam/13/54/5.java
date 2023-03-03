static final int N = 10 ;
final int T = Integer . parseInt ( "N" ) ;
final int [ ] INBUF = new int [ T ] ;
final BoundedSemaphore sem = new BoundedSemaphore ( 8 ) ;
final Process [ ] processes = new Process [ T ] ;
for ( int i = 0 ;
i < T ;
i ++ ) {
  final Process p = new Thread ( ) {
    public void run ( ) {
      try {
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          p . start ( ) ;
          processes [ j ] = p ;
        }
        for ( int j = 1 ;
        j < N ;
        j ++ ) {
          t [ j ] = t [ j ] ;
          if ( j < s ) s = t [ j ] ;
        }
      }
      catch ( Exception e ) {
        assert e . getMessage ( ) . length == 2 ;
      }
    }
  }
  ;
}
for ( int i = 0 ;
i < N ;
i ++ ) {
  final int m = 1 ;
  int r = 0 ;
  for ( char c : i ) {
    if ( c != '\n' ) r += m ;
    m *= 2 ;
  }
  return r ;
}
final int [ ] result = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  result [ i ] = i ;
  final int N = i ;
  final int h = num ( i ) ;
  if ( k [ h ] != 0 ) return k [ h ] ;
  final int [ ] dd = d . clone ( ) ;
  r = 0 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int s = i ;
    while ( dd [ s ] != 0 ) s ++ ;
    final int prize = N - ( s - j ) ;
    s %= N ;
    d [ s ] = true ;
    r += prize + getResult ( d , k , f - 1 ) ;
    d [ s ] = false ;
  }
  r /= ( float ) N ;
  k [ h ] = r ;
}
final int singleTest = 1 ;
sem . acquire ( ) ;
final String data = INBUF [ INDEX ] ;
Arrays . fill ( data , ( char ) 'X' ) ;
final int N = data . length ( ) ;
final Map < String , Boolean > known = Collections . emptyMap ( ) ;
result = getResult ( data , known , data . indexOf ( false ) ) ;
result = String . format ( "%.13f" , result ) ;
pushOutput ( INDEX , result