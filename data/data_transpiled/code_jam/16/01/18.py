def lab6zp ( ) :
    import sys
    import os
    import itertools
    import os
    import sys
    class Lab6ZP ( object ) :
        def __init__ ( self ) :
            self.b = [ ]
        def mark ( self , i ) :
            while i > 0 :
                self.b.append ( True )
                i //= 10
            for j in range ( 10 ) :
                if not b [ j ] :
                    return False
            return True
        def main ( self ) :
            with open ( 'test.txt' , 'r' ) as f :
                n = len ( f.readlines ( ) )
                for i in range ( n ) :
                    for j in range ( 10 ) :
                        self.b [ j ] = False
                k = len ( f.readlines ( ) )
                if k == 0 :
                    print ( 'Case #{}: {}'.format ( i + 1 , 'INSOMNIA' ) )
                else :
                    times = 1
                    while not mark ( k * times ) :
                        times += 1
                    print ( 'Case #{}: {}'.format ( i + 1 , times * k ) )
    return Lab6ZP
