def import _solve_a
import sys
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.solve_a = _solve_a
    def solve_a ( self ) :
        lst = [ ]
        with open ( "/proc/sys/exit.txt" , "r" ) as sc :
            lst.append ( sc.read ( ) )
        lst.sort ( )
        min = lst [ 0 ]
        middle = lst [ 1 ]
        max = lst [ 2 ]
        count = 0
        while min != middle or middle != max :
            for i in range ( 2 ) :
                min += 1
                if min > middle :
                    tmp = middle
                    middle = min
                    min = tmp
                if min > max :
                    tmp = max
                    max = min
                    min = tmp
            count += 1
        print ( count )
