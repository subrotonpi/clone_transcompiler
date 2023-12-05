def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( sys.stdin ).close ( )
        sys.stdout = sys.__stdout__
        N = int ( sc.next ( ) )
        M = int ( sc.next ( ) )
        cnt = 1
        for i in range ( N ) :
            cnt *= 100
        if M == 100 :
            sys.stdout.write ( cnt * M + cnt )
        else :
            sys.stdout.write ( cnt * M )
        sys.stdout.flush ( )
