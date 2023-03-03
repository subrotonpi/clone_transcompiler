def main ( ) :
    import sys
    import random
    class Islands ( object ) :
        def __init__ ( self , a , b ) :
            self.a , self.b = a , b
        def __lt__ ( self , s ) :
            return ( self.b == s.b )
        def __cmp__ ( self , s ) :
            return ( self.a - s.a ) < self.b
    def main ( ) :
        with open ( "/proc/stations/" ) as f :
            N = int ( f.read ( ) )
            M = int ( f.read ( ) )
            land = [ ]
            for a , b in zip ( N , range ( M ) ) :
                land.append ( Islands ( a , b ) )
            land.sort ( )
            last , count = 0 , 0
            for i in range ( M ) :
                if land [ i ].a > last :
                    last = land [ i ].b - 1
                    count += 1
            print ( count )
    return main
