def _import ( ) :
    import sys
    import os
    import time
    import threading
    class pA :
        def solve ( self ) :
            t = 0
            for i in range ( self.n ) :
                t = max ( t , ( self.d - self.x [ i ] ) * 1.0 / self.v [ i ] )
            return "%d" % t
        def solve ( self ) :
            t = 0
            for i in range ( self.n ) :
                t = max ( t , ( self.d - self.x [ i ] ) * 1.0 / self.v [ i ] )
            return "%d" % t
    d , n = [ int ( i ) for i in range ( self.n ) ]
    x = [ int ( i ) for i in range ( self.n ) ]
    v = [ int ( i ) for i in range ( self.n ) ]
    def main ( ) :
        nThreads = 4
        fileNameSuffix = ''
        formatOut = "Case #%2$d: %1$s"
        formatSystemOut = formatOut
        fileName = re.sub ( '_.*' , '' , fileName ).lower ( ) + fileNameSuffix
        inputFileName = fileName + '.in'
        outputFileName = fileName + '.out'
        locale.setlocale ( locale.LC_ALL , '' )
        with open ( inputFileName , 'r' ) as f :
            with open ( outputFileName , 'w' ) as f :
                f.write ( '' )
    tests = len ( sys.argv )
    sys.argv = [ 'tests' ] + [ 'test' ]
    nThreads = min ( nThreads , tests )
    @ atexit.register
    def callables ( ) :
        for t , case in enumerate ( sys.argv ) :
            outputs = [ ]
            for t in range ( self.tests ) :
                outputs.append ( executor.submit ( callables [ t ] ) )
            for t , _ in enumerate ( sys.argv ) :
                print ( format_SystemOut % ( t , ) , end = '' )
            return outputs [ t ].get ( )
    try :
        if nThreads > 1 :
            executor = futures.ThreadPoolExecutor (