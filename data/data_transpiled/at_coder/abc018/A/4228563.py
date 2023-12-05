def _ import SPACETOKEN os.path
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = MyScanner ( )
        x = [ sc.randint ( 0 , 3 ) , sc.randint ( 1 , 3 ) , sc.randint ( 2 , 3 ) ]
        a = [ x [ 0 ] , x [ 1 ] , x [ 2 ] ]
        a.sort ( )
        ans = [ ]
        for i in range ( 3 ) :
            if a [ i ] > x [ 1 ] :
                ans.append ( 1 )
            elif a [ i ] == x [ 1 ] :
                ans.append ( 2 )
            else :
                ans.append ( 3 )
            print ( ans [ i ] )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        self.out = data
    def readline ( self ) :
        while not self.out or not self.out :
            try :
                self.out = readline ( self.out )
            except EOFError :
                pass
        return self.out
    def randint ( self ) :
        return int ( self.out )
    def long ( self ) :
        return long ( self.out )
    def uniform ( self ) :
        return uniform ( )
    def readline ( self ) :
        data = ''
        try :
            data = readline ( self.out )
        except EOFError :
            pass
        return data
