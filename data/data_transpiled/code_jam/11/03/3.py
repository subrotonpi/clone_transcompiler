def import _readline
import sys
import os
import sys
class C ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdout = sys.stdout
        self.eat ( '' )
        T = randint ( 1 , 10000 )
        for t in range ( 1 , T + 1 ) :
            N , xor , sum , m , c = randint ( 1 , 10000 ) , 0 , 1000001 , 0
            for i in range ( N ) :
                c = randint ( 1 , 10000 )
                xor ^= c
                sum += c
                m = min ( m , c )
            print ( 'Case #%d: ' % t , end = '' )
            if xor != 0 :
                print ( 'NO' , file = sys.stderr )
            else :
                print ( sum - m , file = sys.stderr )
    def eat ( str ) :
        for line in iter ( lambda : sys.stdin.readline ( ) , '' ) :
            if not line :
                return
            eat ( line )
        return str
    randint ( 1 , 10000 )
    long ( 1 , 10000 )
    double ( 1 , 10000 )
