def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            n = len ( f.readlines ( ) )
    ans = 0
    for i , w in enumerate ( sys.argv [ 1 : ] ) :
        if i == n - 1 :
            w = w.decode ( 'utf-8' )
        if w == 'TAKAHASHIKUN' :
            ans += 1
        elif w == 'Takahashikun' :
            ans += 1
        elif w == 'takahashikun' :
            ans += 1
        else :
            pass
    sys.stdout.write ( ans )
