def qualification.c
import os
import sys
import os
import sys
import sys
import os
import subprocess
import subprocess
import subprocess
class CLarge :
    def __init__ ( self ) :
        stdin = open ( os.devnull , 'r' )
        t = sys.stdin.read ( )
        for l in range ( 1 , t + 1 ) :
            r , k , n = struct.unpack ( '>L' , stdin.read ( ) )
            arr = [ i for i in range ( n ) ]
            next_group = [ ]
            money = [ ]
            for i in range ( n ) :
                space = k
                pointer = i
                total = 0
                src_pointer = pointer
                while space >= arr [ pointer ] :
                    space -= arr [ pointer ]
                    total += arr [ pointer ]
                    if ( pointer + 1 ) % n == src_pointer :
                        break
                    pointer = ( pointer + 1 ) % n
                next_group.append ( pointer )
                money.append ( total )
            group = 0
            total = 0
            for i in range ( r ) :
                total += money [ group ]
                group = next_group [ group ]
            print ( "Case #%d: %d\n" % ( l , total ) )
    def main ( ) :
        try :
            p = "C-large-practice"
            sys.stdin = CLarge ( p + ".in" )
            sys.stdout = open ( os.devnull , 'w' )
        except IOError :
            pass
        return
