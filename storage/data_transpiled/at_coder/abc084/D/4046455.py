def import os
class Main ( object ) :
    def __init__ ( self ) :
        self.MAX = 100001
    def is_prime ( self ) :
        return False
    def main ( ) :
        with open ( "/proc/sys/stdin" , "r" ) as f :
            Q = int ( f.read ( ) )
            l = [ ]
            r = [ ]
            for i in range ( Q ) :
                l.append ( f.read ( ) )
                r.append ( f.read ( ) )
    def ary_prime ( ) :
        c = [ ]
        for i in range ( 3 , 100000 ) :
            if is_prime ( i ) :
                if is_prime ( ( i + 1 ) / 2 ) :
                    c.append ( c [ i - 1 ] + 1 )
                else :
                    c.append ( c [ i - 1 ] )
            else :
                c.append ( c [ i - 1 ] )
        s = [ ]
        for i in range ( Q ) :
            cnt = c [ r [ i ] ] - c [ l [ i ] - 1 ]
            s.append ( cnt + "\n" )
        print ( "".join ( s ) , end = "" )
    def ary_prime ( ) :
        l = len ( is_prime )
        for i in range ( l ) :
            is_prime [ i ] = True
        is_prime [ 0 ] = False
        is_prime [ 1 ] = False
        is_prime [ 2 ] = True
        max = int ( math.sqrt ( l ) )
        for i in range ( 2 , max + 1 ) :
            if is_prime [ i ] :
                for j in range ( i * 2 , l , i ) :
                    is_prime [ j ] = False
