@ GwtIncompatible ( "java.util.ResourceBundle" ) private static final ResourceBundle bundle = ResourceBundle . getBundle ( "gcj" ) ;
return new ResourceBundle ( ) {
  @ Override protected void run ( ) {
    int N = ints ( ) ;
    List < String [ ] > titles = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      titles . add ( line ( ) . split ( " " ) ) ;
    }
    for ( String [ ] t : titles ) {
      String a = t [ 0 ] ;
      String b = t [ 1 ] ;
      t [ 0 ] = "a:" + a ;
      t [ 1 ] = "b:" + b ;
    }
    println ( titles ) ;
    int source = 0 ;
    int sink = 1 ;
    Map < String , Integer > node2id = new HashMap < > ( ) ;
    node2id . put ( "source" , source ) ;
    node2id . put ( "sink" , sink ) ;
    Map < String , Integer > wordCounts = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      String a = titles . get ( i ) ;
      String b = titles . get ( i ) ;
      for ( int x = a ;
      x < b ;
      x ++ ) {
        node2id . computeIfAbsent ( x , k -> node2id . size ( ) ) ;
        wordCounts . computeIfAbsent ( x , k -> 0 ) ;
        wordCounts . put ( x , 1 ) ;
      }
    }
    println ( node2id ) ;
    println ( wordCounts ) ;
    N = node2id . size ( ) ;
    int [ ] [ ] capacity = new int [ N ] [ N ] ;
    for ( Map . Entry < String , Integer > entry : wordCounts . entrySet ( ) ) {
      String word = entry . getKey ( ) ;
      int count = entry . getValue ( ) ;
      if ( word . startsWith ( "a" ) ) {
        capacity [ source ] [ node2id . get ( word ) ] = count - 1 ;
      }
      else {
        capacity [ node2id . get ( word ) ] [ sink ] = count - 1 ;
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      String a = titles . get ( i ) ;
      String b = entry . getKey ( ) ;
      assert capacity [ node2id . get ( a ) ] [ node2id . get ( b ) ] == 0 ;
    }
    / * ▁ use