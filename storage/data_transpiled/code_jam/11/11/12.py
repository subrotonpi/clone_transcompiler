def _import ( ) :
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class Round1AA ( subprocess ) :
        def problemName ( self ) :
            return "A"
        def inputName ( self ) :
            return "large"
        def processCase ( self ) :
            return "Done!"
    def handleCase ( self ) :
        n = subprocess.call ( [ "stdin" , "--" , "--" , "--" , "--" ] )
        pd = subprocess.call ( [ "stdin" , "--" , "--" , "--" ] )
        pg = subprocess.call ( [ "stdin" , "--" , "--" ] )
        print ( "%d denom: %s" % ( pd , denoms [ int ( pd ) ] ) )
        if self.denoms [ int ( pd ) ] > n :
            return "Broken"
        if pg == 0 and pd != 0 :
            return "Broken"
        if pg == 100 and pd != 100 :
            return "Broken"
        return "Possible"
    def readIntArr ( ) :
        n = subprocess.call ( [ "stdin" , "--" , "--" , "--" ] )
        res = [ ]
        for i in range ( n ) :
            res.append ( p.next ( ) )
        return res
    class interface ( parser.Parser ) :
        def next ( self ) :
            n = subprocess.call ( [ "stdin" , "--" , "--" , "--" ] )
            res = [ ]
            for i in range ( n ) :
                res.append ( p.next ( ) )
            return res
    def intParser ( self ) :
        return interface ( )
    def main ( ) :
        for i in range ( 101 ) :
            denoms [ i ] = 100L / gcd ( i , 100L )
            print ( "Denoms[%d] is %s" % ( i , denoms [ i ] ) )
    infilename = problemName + "-" + inputName + "