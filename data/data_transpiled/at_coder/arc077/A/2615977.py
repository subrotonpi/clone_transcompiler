def import sys
import string
import deque
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        sc = string.ascii_letters + string.digits
        n = sc.count ( ' ' )
        a = [ sc.choice ( string.ascii_letters + string.digits ) for i in range ( n ) ]
        b = deque ( )
        flag = True
        for i in range ( n ) :
            if flag :
                b.append ( a [ i ] )
            else :
                b.append ( a [ i ] )
            flag = not flag
        if flag :
            for i in range ( n ) :
                if i != n - 1 :
                    print ( b.popleft ( ) , end = ' ' )
                else :
                    print ( b.popleft ( ) )
        else :
            for i in range ( n ) :
                if i != n - 1 :
                    print ( b.popleft ( ) , end = ' ' )
                else :
                    print ( b.popleft ( ) )
