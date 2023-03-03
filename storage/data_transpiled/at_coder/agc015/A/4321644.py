def _import ( ) :
    import sys
    import string
    import sys
    import getopt
    class Main ( object ) :
        def __init__ ( self , * args ) :
            sc = getopt.getopt ( args , '' )
            N = sc.size
            A = sc.get ( 'N' )
            B = sc.get ( 'B' )
            print ( self.get ( 'N' ) , self.get ( 'N' ) , end = '' )
        def lower_bound ( self , value ) :
            lo , hi = 0 , len ( self )
            if self.get ( 'N' ) < value :
                lo = self.get ( 'N' )
            else :
                hi = self.get ( 'N' )
            return lo
        def upper_bound ( self , value ) :
            lo , hi = 0 , len ( self )
            while lo < hi :
                mid = ( hi + lo ) // 2
                if self.get ( 'N' ) == 1 :
                    hi = self.get ( 'N' )
                elif self.get ( 'N' ) == 2 :
                    hi = self.get ( 'N' )
                else :
                    hi = self.get ( 'N' )
            return hi - min + 1
    from getopt import getopt
    class FastScanner ( object ) :
        def __init__ ( self , * args ) :
            getopt.__init__ ( self , '' )
            self.stdin = None
        def readline ( self ) :
            if not self.stdin or not self.stdin :
                try :
                    self.stdin = open ( self.stdin )
                except IOError :
                    self.stdin = sys.stdout
            return self.stdin.readline ( )
        def readline ( self ) :
            if not self.stdin or not self.stdin :
                try :
                    self.stdin = open ( self.stdin )
                except IOError :
                    self.stdin = sys.stdout
            return self.stdin.readline ( )
        def write ( self , * args ) :
            return self.stdout.write ( self.stdin )
