def import _main
import __builtin__
import __builtin__
import __builtin__
import __builtin__
import __builtin__
import __builtin__
import __builtin__
class Main :
    def __init__ ( self , * args ) :
        self.n = args [ 0 ]
        self.salary = [ ]
        self.list = __builtin__.range ( n )
        for i in range ( 1 , n ) : self.list [ self.n - 1 ].append ( i )
        flag = True
        while flag :
            flag = False
            for i in range ( n ) :
                x = self.list [ i ]
                if salary [ i ] == 0 and len ( x ) == 0 :
                    flag = True
                    salary [ i ] = min ( x ) + max ( x ) + 1
