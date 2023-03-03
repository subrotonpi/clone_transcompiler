def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdout = sys.stdout
    def readline ( self ) :
        b = [ int ( i ) for i in self.stdout.readline ( ).split ( ) ]
        x = [ 0 ] * 10
        for i in range ( 10 ) :
            x [ b [ i ] ] = i
        n = int ( self.stdout.readline ( ) )
        a = [ 0 ] * n
        for i in range ( n ) :
            s = self.stdout.readline ( )
            a [ i ] = 0
            for j in s :
                a [ i ] *= 10
                a [ i ] += x [ j ] - '0'
        a = [ x [ i ] for i in a ]
        for i in range ( n ) :
            s = [ ]
            t = a [ i ]
            if t == 0 :
                print ( 0 )
                continue
            while t > 0 :
                s.append ( b [ t % 10 ] )
                t /= 10
            s.reverse ( )
            print ( ' '.join ( s ) )
