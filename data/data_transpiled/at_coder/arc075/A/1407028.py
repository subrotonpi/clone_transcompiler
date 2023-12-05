def import import sys
from collections import deque
from collections import defaultdict
from random import randint
from time import time
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.randint ( 1 , 10000 )
        ls = list ( map ( int , sc.read ( ).split ( ) ) )
        sum = sum ( ls )
        if sum % 10 :
            print ( sum )
        else :
            tmp = [ e for e in ls if e % 10 :
                tmp.min ( )
            if tmp :
                print ( sum - tmp.max ( ) )
            else :
                print ( 0 )
