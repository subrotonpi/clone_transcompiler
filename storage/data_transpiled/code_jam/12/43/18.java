public static Case [ ] [ ] createCases ( ) {
  Case [ ] [ ] cases = new Case [ ] [ ] {
    {
      new Case ( ) {
        @ Override public int getNumber ( ) {
          return number ;
        }
        @ Override public String toString ( ) {
          return "" ;
        }
      }
    }
    , {
      String inFilePath = System . getProperty ( "infile.path" ) ;
      BufferedReader in = new BufferedReader ( new FileReader ( inFilePath ) ) ;
      String [ ] params = {
        "peaks" }
        ;
        CaseParser cp = new CaseParser ( in , params ) ;
        for ( Case testCase : cp . cases ( ) ) {
          testCase . fixInput ( ) ;
          System . out . println ( testCase ) ;
        }
        return cases ;
      }
      public void solve ( ) {
        int numPeaks = peaks . length + 1 ;
        int [ ] peakHeights = new int [ numPeaks ] ;
        int prevHighest = 0 ;
        boolean changing = true ;
        while ( changing ) {
          changing = false ;
          for ( int peak = 0 ;
          peak < peaks . length ;
          peak ++ ) {
            int highest = peaks [ peak ] ;
            if ( peak < prevHighest && highest > prevHighest ) {
              answer = "Impossible" ;
              return ;
            }
            prevHighest = highest ;
            int gradient = ( peakHeights [ highest ] - peakHeights [ peak ] ) / ( highest - peak ) ;
            for ( int p : xrange ( peak + 1 , peakHeights . length ) ) {
              if ( p == highest ) continue ;
              int tooHigh = ( peakHeights [ peak ] + gradient * ( p - peak ) ) ;
              if ( peakHeights [ p ] >= tooHigh ) {
                changing = true ;
                if ( p > highest ) {
                  int g = ( peakHeights [ highest ] - peakHeights [ p ] ) / ( highest - p ) ;
                  peakHeights [ peak ] -= g * ( highest - peak ) + 1 ;
                }
                else {
                  peakHeights [ p ] = tooHigh - 1 ;
                }
              }
            }
          }
          int minPeak = Math . min ( peakHeights . length , peakHeights ) ;
          if ( minPeak <= 0 ) {
            peakHeights = new int [ numPeaks ] ;
            for ( int p = 0 ;
            p < peakHeights . length ;
            p ++ ) {
              peakHeights [ p ] = 1 + peakHeights [ p ] ;
            }
          }
        }
      }
    }
    