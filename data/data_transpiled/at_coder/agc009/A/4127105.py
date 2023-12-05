def _import ( ) :
    from sys import stdin as PIPE
    from string import string
    from shlex import quote
    class Main ( object ) :
        def __init__ ( self , N ) :
            self.A , self.B = [ ] , [ ]
        def writeSingleLine ( self ) :
            sc = stdout.fileno ( )
            self.N = len ( sc )
            self.A = [ ]
            self.B = [ ]
            for i in range ( N ) :
                self.A.append ( sc.pop ( i ) )
            self.B.append ( str ( arg ) )
        def debug ( self , * args ) :
            self.lo , self.hi = 0 , len ( args )
            while self.lo < self.hi :
                self.lo = self.lo + 1
            else :
                self.hi = self.hi
        def solve ( self , * args ) :
            self.lo , self.hi = self.lo , self.hi
        def next ( self ) :
            if self.lo is None or not self.hi :
                try :
                    self.lo = self.lo + 1
                except :
                    self.hi = self.hi
            return self.lo
        def readline ( self ) :
            if self.lo is None or not self.hi :
                try :
                    self.lo = self.lo
                except :
                    self.hi = self.hi
            return self.lo
        def write ( self , * args ) :
            for a in args :
                a = [ ]
                for i in range ( self.n ) :
                    a.append ( a )
                return a
            return write
    def writeSingleLine ( self ) :
        for i in range ( self.N ) :
            if i != 0 :
                print ( " " , end = '' , file = sys.stderr )
    def writeSingleLine ( self ) :
        for i in range ( self.N ) :
            print ( " " , end = '' , file = sys.stderr )
