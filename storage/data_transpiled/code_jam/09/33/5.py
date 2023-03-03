def r1c ( ) :
    import os
    import sys
    import sys
    class C ( object ) :
        def __init__ ( self ) :
            self.release = [ ]
        def solve ( s , e ) :
            if s > e :
                return 0
            if self.table [ s ] [ e ] != - 1 :
                return self.table [ s ] [ e ]
            if s == e :
                self.table [ s ] [ e ] = self.release [ e + 1 ] - self.release [ s - 1 ] - 2
                return self.table [ s ] [ e ]
            else :
                min = len ( self.release ) * self.release [ - 1 ]
                for i in range ( s , e + 1 ) :
                    temp = solve ( s , i - 1 ) + solve ( i + 1 , e ) + self.release [ e + 1 ] - self.release [ s - 1 ] - 2
                    if temp < min :
                        min = temp
                self.table [ s ] [ e ] = min
                return min
        def answer ( self ) :
            p = self.p
            q = self.q
            self.release = [ 0 ]
            for i in range ( 1 , q + 1 ) :
                self.release.append ( i )
            self.release [ q + 1 ] = p + 1
            self.table = [ - 1 ] * ( q + 1 )
            for i in range ( 0 , q ) :
                for j in range ( 0 , q ) :
                    self.table [ i ] [ j ] = - 1
            return solve ( 1 , q )
        def main ( self ) :
            try :
                infile = open ( self.file , "r" )
                t = infile.readline ( ).split ( )
                infile.close ( )
                for i in range ( t ) :
                    print ( "Case #%d: " % ( i + 1 ) , end = ' ' )
                    print ( answer ( infile ) )
                infile.close ( )
            except :
                print ( "Exception occured, stacktrace to follow." )
                pass
    C.main ( )
