def _import ( stream ) :
    import sys
    import io
    import tokenize
    import tokenize
    import tokenize
    import tokenize
    import os
    import sys
    class _FastScanner :
        def __init__ ( self , stream ) :
            self.rfile = stream
            self.output_file = sys.stdout
        def readline ( self ) :
            while not self.rfile or not self.wfile :
                return None
            self.rfile = open ( self.rfile )
            self.output_file = open ( self.output_file , 'w' )
        def write ( self , stream ) :
            self.rfile.write ( stream )
    def _ReadLine ( stream ) :
        stream = tokenize.StringIO ( stream )
    def _ReadLine ( stream ) :
        while not stream or not stream :
            try :
                rl = stream.readline ( )
                if rl :
                    return None
                self.rfile = next ( rl )
            except StopIteration :
                raise
        return stream.read ( )
    def _ReadLine ( stream ) :
        stream = open ( stream , 'w' )
    def _ReadLine ( stream ) :
        stream = tokenize.StringIO ( stream )
    def _ReadLine ( stream ) :
        while stream.readline ( ) or not stream.eof :
            try :
                rl = stream.readline ( )
            except StopIteration :
                raise
            else :
                return None
        return _ReadLine ( stream )
    def _ReadLine ( stream ) :
        return _ReadLine ( stream )
    def _ReadLine ( stream ) :
        n , m = stream.ni ( )
        g = [ ]
        for i in range ( n ) :
            g.append ( list ( ) )
        degree = [ ]
        for i in range ( m ) :
            from cur , to = stream.ni ( ) - 1
            g [ i ].append ( ( from , to , i ) )
            g [ i ].append ( ( to , i , i ) )
            degree [ i ] += 1
            degree [ i ] += 1
        degree4 = [ ]
        for i in range ( n ) :
            if degree [ i ] % 2 == 1 :
                _ReadLine ( stream )
                return
        if circle