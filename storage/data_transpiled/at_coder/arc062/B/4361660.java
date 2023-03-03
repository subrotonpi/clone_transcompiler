static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
}
public List < Integer > getIntList ( ) {
  return Arrays . asList ( Integer . parseInt ( input . nextLine ( ) ) . split ( " " ) ) ;
}
public int [ ] zeros ( int n ) {
  return new int [ n ] ;
}
public int [ ] getIntLines ( ) {
  return new int [ n ] ;
}
public int [ ] [ ] getIntMat ( int n ) {
  int [ ] [ ] mat = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    mat [ i ] = getIntList ( ) ;
  }
  return mat ;
}
public int [ ] zeros2 ( int n , int m ) {
  return new int [ m ] [ n ] ;
}
public char [ ] ALPHABET = new char [ 26 ] ;
public char [ ] DIGIT = new char [ 10 ] ;
public static void dmp ( char x , char cmt ) {
  if ( debug ) {
    if ( cmt != '' ) System . out . print ( cmt + ":  " ) ;
    System . out . println ( x ) ;
  }
}
public static int [ ] probC ( ) {
  String S = input . nextLine ( ) ;
  dmp ( S ) ;
  char GU = 'g' ;
  char PA = 'p' ;
  int guCount = 0 ;
  int paCount = 0 ;
  int point = 0 ;
  StringBuffer allTe = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    char te ;
    if ( S . charAt ( i ) == GU ) {
      if ( paCount < guCount ) {
        te = PA ;
        paCount ++ ;
      }
      else {
        te = GU ;
        guCount ++ ;
      }
    }
    else {
      if ( paCount < guCount ) {
        te = PA ;
        paCount ++ ;
      }
      else {
        te = GU ;
        guCount ++ ;
      }
    }
    if ( te == GU && S . charAt ( i ) == PA ) {
      point -- ;
    }
    else if ( te == PA && S . charAt ( i ) == GU ) {
      point ++ ;
    }
    allTe . append ( te ) ;
  }
  dmp ( allTe , "allTe" ) ;
  dmp ( point ) ;
  return point ;
}
