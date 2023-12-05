static final Scanner in = new Scanner ( System . in ) {
  private BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  public String raw ( ) {
    return in . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
  }
  public int [ ] ints ( ) {
    return ArrayUtil . fromIntegers ( in . readLine ( ) . split ( " " ) ) ;
  }
  public String nextLine ( ) {
    return null ;
  }
  class Memoize {
    private Memoize {
      final Memoize < String , String > fn ;
      {
        this . fn = fn ;
        this . memory = new Memoize < String , String > ( ) {
          @ Override public String compute ( String ... args ) {
            if ( ! memory . containsKey ( args [ 0 ] ) ) {
              memory . put ( args [ 0 ] , fn . compute ( args [ 1 ] ) ) ;
            }
            return fn . compute ( args [ 2 ] ) ;
          }
        }
        ;
      }
      private Memoize < Integer > minner ( int [ ] sol ) {
        return new Memoize < Integer > ( - sol [ 0 ] , - Integer . MAX_VALUE , - Integer . MAX_VALUE ) ;
      }
      private Memoize < Integer > maxxer ( int [ ] sol ) {
        return new Memoize < Integer > ( sol [ 0 ] , - Integer . MAX_VALUE , - Integer . MAX_VALUE ) ;
      }
      private Memoize < Integer > zeroer ( int [ ] sol ) {
        return new Memoize < Integer > ( - abs ( sol [ 0 ] ) , - Integer . MAX_VALUE , - Integer . MIN_VALUE ) ;
      }
    }
    final List < Memoize < Integer >> comps = Arrays . asList ( minner , maxxer , zeroer ) ;
    @ Override public Memoize < Integer > rec ( int [ ] u , int [ ] v , int i , Function < Integer , String > comparer ) {
      if ( i == 0 ) {
        return new Memoize < Integer > ( 0 , "" , "" ) ;
      }
      final int sa = u [ u . length - i ] ;
      final int sb = v [ v . length - i ] ;
      final int [ ] possA = new int [ 10 ] ;
      possA [ 0 ] = sa != 0 ? Integer . parseInt ( sa ) : new int [ 10 ] ;
      final int [ ] possB = new int [ 10 ] ;
      possB [ 0 ] = sb != 0 ? Integer . parseInt ( sb ) : new int [ 10 ] ;
    }
  }
  