static final Map < String , Integer > cache = new HashMap < String , Integer > ( ) {
  private String tobinary ( int x ) {
    String res = "" ;
    while ( x > 0 ) {
      if ( x % 2 == 1 ) {
        res = "1" + res ;
        x -- ;
      }
      else {
        res = "0" + res ;
      }
      x /= 2 ;
    }
    return res ;
  }
  private int solve ( String a , String b , int k ) {
    if ( cache . containsKey ( new String ( a ) ) ) {
      return cache . get ( new String ( a ) ) ;
    }
    int a = Integer . parseInt ( lin [ 0 ] ) - 1 ;
    int b = Integer . parseInt ( lin [ 1 ] ) - 1 ;
    int k = Integer . parseInt ( lin [ 2 ] ) - 1 ;
    String ba = tobinary ( a ) ;
    String bb = tobinary ( b ) ;
    String bk = tobinary ( k ) ;
    System . out . print ( "Case #" + toString ( caseno + 1 ) + ": " + toString ( solve ( ba , bb , bk ) ) + "\n" ) ;
    return 0 ;
  }
  private int solve ( String a , String b , int k ) {
    if ( cache . containsKey ( new String ( a ) ) ) {
      return cache . get ( new String ( a ) ) ;
    }
    if ( a == "" && b == "" ) {
      return 1 ;
    }
    else if ( a == "" ) {
      return Integer . parseInt ( b , 2 ) + 1 ;
    }
    else if ( b == "" ) {
      return Integer . parseInt ( a , 2 ) + 1 ;
    }
    else if ( ( a . length ( ) < k ) || ( a . length ( ) == k && b . length ( ) == k ) || ( b . length ( ) < k && b . length ( ) == k ) ) {
      int z = ( Integer . parseInt ( a , 2 ) + 1 ) * ( Integer . parseInt ( b , 2 ) + 1 ) ;
      cache . put ( new String ( a ) , z ) ;
      return z ;
    }
    else if ( a . length ( ) > b . length ( ) ) {
      int excess = a . length ( ) - b . length ( ) ;
      String head = a . substring ( 0 , excess ) ;
      String a1 = a . substring ( excess ) ;
      String a2 = "1" * a1 ;
      while ( a1 . length ( ) > 0 && a1 . charAt (