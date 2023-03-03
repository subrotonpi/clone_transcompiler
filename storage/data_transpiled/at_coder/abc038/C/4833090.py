def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.read ( )
        a = sys.stdin.read ( )
    total = 0
    subtotal = 1
    pre = a [ 0 ]
    for i in range ( 1 , N ) :
        if pre >= a [ i ] :
            total += subtotal
            if subtotal > 1 :
                total += subtotal * ( subtotal - 1 ) / 2
            subtotal = 1
        else :
            subtotal += 1
        pre = a [ i ]
    total += subtotal
    if subtotal > 1 :
        total += subtotal * ( subtotal - 1 ) / 2
    sys.stdout.write ( "%d\n" % total )
