def _import ( ) :
    import time
    import sys
    from multiprocessing import Pool
    from multiprocessing import Process
    from multiprocessing import Pool
    class B ( object ) :
        def __init__ ( self , * a , ** kw ) :
            self.b , self.n = a
            self.a = [ ]
            self.which = None
        def in_time ( self , time , last ) :
            free = [ ]
            prev_free = 0
            for i in range ( self.b ) :
                prev_free += ( time + self.a [ i ] - 1 ) / self.a [ i ]
                if time % self.a [ i ] == 0 :
                    free.append ( i )
            if last :
                self.which = free [ int ( self.n - prev_free ) ]
            return self.n < prev_free + len ( free )
        def solve ( self ) :
            self.n -= 1
            low = - 1
            high = self.a [ 0 ] * 1 * ( self.n + 1 )
            while low + 1 < high :
                mid = ( low + high ) / 2
                if in_time ( mid , False ) :
                    high = mid
                else :
                    low = mid
            in_time ( high , True )
            return "%d" % ( self.which + 1 )
        def write ( self , * args ) :
            self.b , self.n = self.b , self.n
            self.a = [ ]
            for i in range ( self.b ) :
                self.a.append ( self.a [ i ] )
    def file_name ( self ) :
        self.name = re.sub ( "_.*" , "" , self.name ).lower ( )
    def input_file_name ( self ) :
        self.name = self.name
        self.name = self.name
        self.name = self.name
        self.name = self.name
        self.tests = len ( self.a )
        self.stdin = open ( self.input_file_name , 'r' )
        self.stdout = open ( self.output_file_name , 'w' )
        self.stdout.write ( self.stdout.read ( ) )
