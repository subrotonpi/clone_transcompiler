def cj2016.r1a ( ) :
    import sys
    from cj2016.r1a import read , solve
    class B ( object ) :
        def __init__ ( self , file_prefix ) :
            self.file_prefix = file_prefix if len ( file_prefix ) > 0 else 'B-large'
            try :
                super ( B , self ).__init__ ( file_prefix )
            except :
                print ( 'Failed to run ' + file_prefix + '.' )
        def run ( self , file_prefix ) :
            self.sc = open ( file_prefix + '.in' , 'r' )
            self.logfile = open ( file_prefix + '.out' , 'w' )
            self.ntest = self.sc.count ( )
            for test in range ( 1 , ntest + 1 ) :
                read ( self )
                print ( 'Case #%d: ' % test , end = '' )
                print ( 'Case #%d: ' % test , end = '' )
                solve ( )
            print ( 'Finished.' )
            self.sc.close ( )
            self.logfile.close ( )
        def read ( self ) :
            self.N = self.sc.count ( )
            self.h = [ [ ] for _ in range ( 2 * N - 1 ) ]
            for i in range ( 2 * N - 1 ) :
                for j in range ( N ) :
                    self.h [ i ] [ j ] += 1
            print ( '\n' , end = '' )
            print ( '\n' , end = '' )
            print ( '\n' , end = '' )
        def solve ( self ) :
            count = [ ]
            for i in range ( 2 * N - 1 ) :
                for j in range ( N ) :
                    count [ self.h [ i ] [ j ] - 1 ] += 1
            ans = [ ]
            idx = 0
            for i in range ( 2500 ) :
                if count [ i ] % 2 :
                    ans.append ( i + 1 )
            for i in range ( N ) :
                print ( ans [ i ] , end = '' )
    return B
