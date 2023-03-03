def cj2016.r3 ( ) :
    import sys
    from cj2016.r3 import read
    from cj2016.r3 import solve
    class A ( object ) :
        def __init__ ( self , file_prefix ) :
            self.file_prefix = file_prefix if len ( file_prefix ) > 0 else 'A-large'
            try :
                super ( A , self ).__init__ ( file_prefix )
            except :
                print ( "Failed to read a file from %s" % file_prefix )
        def run ( self , file_prefix ) :
            self.sc = open ( file_prefix + '.in' , 'r' )
            self.pw = open ( file_prefix + '.out' , 'w' )
            ntest = self.sc.count ( 'A' )
            for test in range ( 1 , ntest + 1 ) :
                read ( self )
                print ( "Case #%d: " % test , end = ' ' )
                print ( "Case #%d: " % test , end = ' ' )
                solve ( )
            print ( "Finished." )
            self.sc.close ( )
            self.pw.close ( )
        def read ( self ) :
            self.c = self.sc.read ( ).decode ( 'utf-8' )
        def write ( self , s ) :
            print ( s , end = ' ' )
            print ( s , end = ' ' )
        def write ( self , s ) :
            print ( s , end = ' ' )
            print ( s , end = ' ' )
            print ( s , end = ' ' )
            print ( s , end = ' ' )
            print ( s , end = ' ' )
        def solve ( self ) :
            N = len ( self.c )
            score = 0
            stack = list ( )
            for i in range ( N ) :
                if not stack.empty ( ) and stack [ - 1 ] == self.c [ i ] :
                    stack.pop ( )
                    score += 10
                else :
                    stack.append ( self.c [ i ] )
            pprint ( score + len ( stack ) / 2 ** 5 )
