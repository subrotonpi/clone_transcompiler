def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.read ( )
        a = [ ]
        for i in range ( N ) :
            a.append ( sc.randint ( 0 , N ) )
    nums = set ( )
    for i in range ( N ) :
        num = a [ i ]
        while num % 2 == 0 :
            num /= 2
        nums.add ( num )
    sys.stdout.write ( '{}\n'.format ( len ( nums ) ) )
