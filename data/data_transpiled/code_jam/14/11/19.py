def import _readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import sys
class Main ( readline ) :
    def readline ( ) :
        return readline
    def readline ( ) :
        return readline
    def readline ( ) :
        return readline
    def readline ( ) :
        return readline
    def readline ( ) :
        return readline
    def readline ( ) :
        while not readline or readline.readline ( ).strip ( ) :
            readline = readline.readline ( )
        return readline
    def main ( ) :
        readline = None
        reader = open ( 'A-small-attempt0.in' , 'r' )
        writer = open ( 'A-small-attempt0.out' , 'w' )
        banana ( )
        reader.close ( )
        writer.close ( )
    def banana ( ) :
        T = readline ( )
        for t in range ( T ) :
            writer.write ( 'Case #%d: ' % ( t + 1 ) )
            solve ( )
    def solve ( ) :
        n = readline ( )
        len ( out )
        out = [ int ( readline ( ) , 2 ) for _ in range ( n ) ]
        dev = [ int ( readline ( ) , 2 ) for _ in range ( n ) ]
        ans = 1000000
        for i in range ( n ) :
            for j in range ( n ) :
                sw = 0
                cand = 0
                for bit in range ( len ( out [ i ] ) ) :
                    if ( ( 1 << bit ) & out [ i ] ) != ( ( 1 << bit ) & dev [ j ] ) :
                        sw |= ( 1 << bit )
                        cand += 1
                new_out = set ( out [ i ] ^ sw )
            bGood = True
            for k in range ( n ) :
                new_out.add ( out [ i ] )
            bGood = False
    return ans
