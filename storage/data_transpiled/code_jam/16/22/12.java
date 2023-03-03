@ GwtIncompatible ( "java.util.regex.Pattern" ) private static final Pattern PATTERN = Pattern . compile ( "[0-9]+" ) ;
final Matcher matcher = PATTERN . matcher ( matcher . replaceAll ( "" ) ) ;
final String [ ] a = line ( ) ;
final Matcher matcher = PATTERN . matcher ( a ) ;
final Pattern b = PATTERN . matcher ( b ) ;
final Map < String , String > cache = new HashMap < > ( ) ;
{
  final StringBuilder sb = new StringBuilder ( ) ;
  final int cur = 0 ;
  final String key = toString ( new String [ ] {
    a , b , cur }
    ) ;
    if ( cache . containsKey ( key ) ) {
      return cache . get ( key ) ;
    }
    if ( sb . length ( ) == 0 ) {
      return "" ;
    }
    final char da = a [ 0 ] ;
    final char db = b [ 0 ] ;
    final char [ ] [ ] cana = StringUtil . isEmpty ( da ) ? null : new char [ da ] [ ] ;
    final char [ ] [ ] canb = StringUtil . isEmpty ( db ) ? null : new char [ db ] [ ] ;
    final char [ ] pa = new char [ 3 ] ;
    final char [ ] pb = new char [ 3 ] ;
    for ( int x = 0 ;
    x < 3 ;
    x ++ ) {
      pa [ x ] = null ;
      pb [ x ] = null ;
    }
    final List < Solution > solutions = new ArrayList < > ( ) ;
    for ( int mya : cana ) {
      for ( int myb : canb ) {
        if ( cur == 2 || ( cur == 0 && mya < myb ) ) {
          solutions . add ( new Solution ( mya + pa [ 2 ] , myb + pb [ 2 ] ) ) ;
        }
        else if ( cur == 1 || ( cur == 0 && mya > myb ) ) {
          solutions . add ( new Solution ( mya + pa [ 1 ] , myb + pb [ 1 ] ) ) ;
        }
        else {
          assert cur == 0 && mya == myb ;
          solutions . add ( new Solution ( mya + pa [ 0 ] , myb + pb [ 0 ] ) ) ;
        }
      }
    }
    final Comparator < Solution > solComparator = new Comparator < Solution > ( ) {
      public int compare ( Solution o1 , Solution o2 ) {
        String a = o1 . toString ( ) ;
        String b = o2 . toString ( ) ;
        if ( cur == 1 ) {
          a =