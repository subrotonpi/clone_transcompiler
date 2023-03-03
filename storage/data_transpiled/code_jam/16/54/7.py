def _import ( ) :
    import os
    import sys
    import threading
    import time
    class D :
        NO = "IMPOSSIBLE"
        def __init__ ( self ) :
            self.m , self.n = self.n , self.n
            self.b = self.b
            self.g = [ ]
            self.solve ( )
        def run ( self ) :
            for t in self.m :
                if t == self.b :
                    return NO
            if self.n == 1 :
                return self.g [ 0 ] , self.b
        x , y = "" , ""
        for i in range ( self.n ) :
            x += "0?"
        for i in range ( self.n - 1 ) :
            y += "1"
        return x , y
    def D ( f ) :
        m , n = self.m , self.n
        g = [ f.next ( ) for f in f ]
        b = f.next ( )
    def main ( ) :
        nThreads = 4
        fileNameSuffix = ""
        formatOut = "Case #%2$d: %1$s"
        formatSystemOut = formatOut
        fileName = re.sub ( "_.*" , "" , fileName ).lower ( ) + fileNameSuffix
        inputFileName = fileName + ".in"
        outputFileName = fileName + ".out"
        locale.setlocale ( locale.LC_ALL , '' )
        with open ( inputFileName , 'r' ) as f :
            with open ( outputFileName , 'w' ) as f :
                tests = f.readline ( ).split ( '\n' )
            nThreads = min ( nThreads , tests )
    try :
        from threading import Thread
        for t in range ( nThreads ) :
            case = D ( f )
            testCaseNumber = t + 1
            callables [ t ] = lambda : case.solve ( )
            print ( formatSystemOut % ( answer , testCaseNumber ) )
    except :
        print ( "ERROR: " , sys.exc_info ( ) [ 0 ] )
        sys.exit ( 1 )
