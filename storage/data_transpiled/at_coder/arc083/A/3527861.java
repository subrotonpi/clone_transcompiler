public static int A , int B , int C , int D , int E , int F ;
List < Integer > ablist = new ArrayList < Integer > ( ) ;
int a = 0 , b = 0 ;
while ( ( 100 * A * a + 100 * B * b ) <= F ) {
  while ( ( 100 * A * a + 100 * B * b ) <= F ) {
    ablist . add ( new Integer ( a ) ) ;
    b ++ ;
  }
  a ++ ;
  b = 0 ;
}
ablist . remove ( new Integer ( 0 ) ) ;
List < Integer > wlist = new ArrayList < Integer > ( ) ;
for ( Integer ab : ablist ) {
  wlist . add ( 100 * A * ab . intValue ( ) + 100 * B * ab . intValue ( ) ) ;
}
Set < Integer > wset = new HashSet < Integer > ( wlist ) ;
List < Integer > cdlist = new ArrayList < Integer > ( ) ;
int c = 0 , d = 0 ;
while ( ( C * c + D * d ) <= F ) {
  while ( ( C * c + D * d ) <= F ) {
    cdlist . add ( new Integer ( c ) ) ;
    d ++ ;
  }
  c ++ ;
  d = 0 ;
}
List < Integer > slist = new ArrayList < Integer > ( ) ;
for ( Integer cd : cdlist ) {
  slist . add ( C * cd . intValue ( ) + D * cd . intValue ( ) ) ;
}
Set < Integer > sset = new HashSet < Integer > ( slist ) ;
int maxRate = - 1 ;
int ret_sw = 0 ;
int ret_s = 0 ;
for ( Integer w : wset ) {
  for ( Integer s : sset ) {
    if ( s + w <= F ) {
      int rate = s / ( s + w ) ;
      if ( rate <= E / ( E + 100 ) ) {
        if ( maxRate < rate ) {
          maxRate = rate ;
          ret_sw = s + w ;
          ret_s = s ;
        }
      }
    }
  }
  System . out . println ( ret_sw + " " + ret_s ) ;
  return ret_sw ;
}
