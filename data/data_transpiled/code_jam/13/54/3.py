def _ import _ , os , sys , os , sys , thread , threading , sleep , random , string , StringIO , StringIO , StringIO , ) :
    import sys
    import os , sys
    from random import randrange
    from os import urandom
    from random import random
    class GCJD ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = StringIO ( )
            self.stdin.readline ( )
            if not self.stdin :
                return None
            self.stdin.readline ( )
        def __next__ ( self ) :
            return int ( self.stdin.readline ( ) )
        def __next__ ( self ) :
            return int ( self.stdin.readline ( ) )
        def nextDouble ( self ) :
            return float ( self.stdin.readline ( ) )
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        with GCJD ( ) :
            s = os.popen ( '/dev/null' ).read ( )
        def solve ( self , out ) :
            n = len ( s )
            mask0 = 0
            for i in range ( len ( s ) ) :
                if s [ i ] == 'X' :
                    mask0 |= 1 << i
            d = [ ]
            for i in range ( ( 1 << n ) - 2 , - 1 , - 1 ) :
                for t , count in zip ( range ( n ) , range ( n ) ) :
                    t = t , count = 0
                    while ( i & ( 1 << t ) ) :
                        t = ( t + 1 ) % n
                        count += 1
                    d.append ( ( d [ i | ( 1 << t ) ] + n - count ) / float ( n ) )
            out.write ( d [ mask0 ] )
    class Solver ( object ) :
        def __init__ ( self ) :
            self.data = self
        def __call__ ( self , self , data ) :
            self.data = data
        def __call__ ( self , self , out ) :
            self.data = out
    service = threading.Thread ( target = Solver , args = ( ) )
    tests = len ( sys.argv )
    ts = [ service.submit ( test )