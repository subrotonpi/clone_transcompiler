@ Function public static int readInt = new Scanner ( System . in ) {
  @ Override public int nextInt ( ) {
    return Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
  }
  @ Override public Iterable < Integer > readInts ( ) {
    return Arrays . asList ( in . nextLine ( ) . split ( " " ) ) ;
  }
  private final Function < Integer , Iterable < Integer >> countTo = n -> new Iterable < Integer > ( ) {
    @ Override public Iterable < Integer > iterator ( Integer n ) {
      return new Iterable < Integer > ( ) {
        @ Override public Iterator < Integer > iterator ( ) {
          return new Iterator < Integer > ( ) {
            @ Override public boolean hasNext ( ) {
              return true ;
            }
            @ Override public Integer next ( ) {
              return n ;
            }
            @ Override public Integer next ( ) {
              return n ;
            }
          }
          ;
        }
      }
      ;
    }
  }
  ;
  public static Map < Integer , Integer > readGrid ( int rows , int columns , Function < Integer , Integer > parseCell ) {
    if ( parseCell == null ) {
      parseCell = new Function < Integer , Integer > ( ) {
        @ Override public Integer apply ( Integer input ) {
          return input ;
        }
      }
      ;
    }
    final Map < Integer , Integer > grid = new HashMap < Integer , Integer > ( ) ;
    for ( int r : countTo . apply ( rows ) ) {
      final String rowString = in . nextLine ( ) ;
      for ( int c : countTo . apply ( columns ) ) {
        grid . put ( r , c , parseCell . apply ( rowString . charAt ( c - 1 ) ) ) ;
      }
    }
    return grid ;
  }
  public static Map < Integer , Integer > createGrid ( int rows , int columns , Function < Integer , Integer > f ) {
    return Collections . singletonMap ( new Integer ( rows , columns ) , f ) ;
  }
}
;
public static void solveAll ( ) {
  int numCases = readInt ( ) ;
  for ( int i : countTo . apply ( numCases ) ) {
    System . out . println ( "Case #" + i + ":" ) ;
    solve ( ) ;
  }
}
public static boolean isWorthy ( ) {
  return true ;
}
public static boolean isWorthy ( ) {
  return false ;
}
}
