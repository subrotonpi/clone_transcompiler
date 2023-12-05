def import import sys , list , dict , Scanner , list , set , stock , stock_num
from itertools import islice
from itertools import islice
from collections import deque
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.list = [ ]
        num = islice ( sys.stdin.readline ( ) , 0 , None )
        for i in range ( num ) :
            self.list.append ( i )
    def sort ( self ) :
        stock = 0
        count = 0
        stock_num = 0
        for i in self.list :
            if stock != i :
                stock = i
                count = i
            count -= 1
            if count == 0 :
                stock_num += stock
        print ( len ( self.list ) - stock_num )
